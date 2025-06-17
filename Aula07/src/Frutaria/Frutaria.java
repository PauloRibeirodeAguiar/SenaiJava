package Frutaria;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Frutaria.Fruta;
import Frutaria.FrutaDao;


public class Frutaria {

    public static void main(String[] args) {

        /*try {
            Connection conn = FrutaConexaoDB.conexaoDB();
            if (conn != null) {
                System.out.println("Conectado com sucesso!");
                conn.close();
            } else {
                System.out.println("Falha na conexão com o banco de dados.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar com o banco: " + e.getMessage());
        }*/
 /*Fruta fruta = new Fruta(0, "Laranja", 25, "Maduro", "Sítio Verde");
       
        FrutaDao dao = new FrutaDao();
        dao.inserirFruta(fruta);*/
 
 /*FrutaDao listaFrutas = new FrutaDao();
        listaFrutas.listarFrutas();
        System.out.println(listaFrutas.listarFrutas()+"\n");*/
        
 /*FrutaDao consultaId = new FrutaDao();
        Fruta fruta = consultaId.buscarFrutaPorId(2);
        System.out.println(consultaId.buscarFrutaPorId(2));*/
    }

    private static boolean buscarFrutaPorId(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

        
      
    }

        
    
   
       
        
   
        
    


