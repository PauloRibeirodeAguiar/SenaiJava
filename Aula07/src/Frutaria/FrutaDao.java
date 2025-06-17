package Frutaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FrutaDao {
    
    public void inserirFruta(Fruta fruta) {
        String sql = "INSERT INTO fruta (nomeFruta, qtdFruta, maturacaoFruta, localColhido) VALUES (?, ?, ?, ?)";

        try (Connection conn = FrutaConexaoDB.conexaoDB(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, fruta.getNomeFruta());
            stmt.setInt(2, fruta.getQtdFruta());
            stmt.setString(3, fruta.getMaturacaoFruta());
            stmt.setString(4, fruta.getLocalColhido());

            stmt.executeUpdate();
            System.out.println("Fruta inserida com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir fruta: " + e.getMessage());
        }       
    }
    
    public List<Fruta> listarFrutas() {
        List<Fruta> lista = new ArrayList<>();
        String sql = "SELECT * FROM fruta ORDER BY nomeFruta ASC";

        try (Connection conn = FrutaConexaoDB.conexaoDB();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("idFruta");
                String nome = rs.getString("nomeFruta");
                int qtd = rs.getInt("qtdFruta");
                String maturacao = rs.getString("maturacaoFruta");
                String local = rs.getString("localColhido");

                Fruta fruta = new Fruta(id, nome, qtd, maturacao, local);
                lista.add(fruta);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar frutas: " + e.getMessage());
        }

        return lista;
    }

    public Fruta buscarFrutaPorId(int id) {
        String sql = "SELECT * FROM fruta WHERE idFruta = ?";
        Fruta fruta = null;

        try (Connection conn = FrutaConexaoDB.conexaoDB();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int idFruta = rs.getInt("idFruta");
                    String nome = rs.getString("nomeFruta");
                    int qtd = rs.getInt("qtdFruta");
                    String maturacao = rs.getString("maturacaoFruta");
                    String local = rs.getString("localColhido");

                    fruta = new Fruta(idFruta, nome, qtd, maturacao, local);
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar fruta por ID: " + e.getMessage());
        }

        return fruta;
    }
    
    public boolean updateFruta(Fruta fruta) {
        String sql = "UPDATE fruta SET nomeFruta = ?, qtdFruta = ?, maturacaoFruta = ?, localColhido = ? WHERE idFruta = ?";

        try (Connection conn = FrutaConexaoDB.conexaoDB();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, fruta.getNomeFruta());
            stmt.setInt(2, fruta.getQtdFruta());
            stmt.setString(3, fruta.getMaturacaoFruta());
            stmt.setString(4, fruta.getLocalColhido());
            stmt.setInt(5, fruta.getIdFruta());

            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar fruta: " + e.getMessage());
            return false;
        }
    }
}