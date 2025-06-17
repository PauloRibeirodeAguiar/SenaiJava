package Frutaria;

import Frutaria.Fruta;

public class Fruta {
    private int idFruta;
    private String nomeFruta;
    private int qtdFruta;
    private String maturacaoFruta;
    private String localColhido;

    public Fruta(int idFruta, String nomeFruta, int qtdFruta, String maturacaoFruta, String localColhido) {
        this.idFruta = idFruta;
        this.nomeFruta = nomeFruta;
        this.qtdFruta = qtdFruta;
        this.maturacaoFruta = maturacaoFruta;
        this.localColhido = localColhido;
    }

    Fruta(int i, String anabeli_Atualizado, int i0, String joaonovocom, String string, String qa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return"\nId: " + idFruta + "\n"
              +"Fruta: " + nomeFruta + "\n"
              +"Quantidade: " + qtdFruta + "\n"
              +"Maturação: " + maturacaoFruta + "\n"
              +"Local Colhido: " + localColhido;
    }

    public void setIdFruta(int idFruta) {
        this.idFruta = idFruta;
    }

    public void setNomeFruta(String nomeFruta) {
        this.nomeFruta = nomeFruta;
    }

    public void setQtdFruta(int qtdFruta) {
        this.qtdFruta = qtdFruta;
    }

    public void setMaturacaoFruta(String maturacaoFruta) {
        this.maturacaoFruta = maturacaoFruta;
    }

    public void setLocalColhido(String localColhido) {
        this.localColhido = localColhido;
    }

    public int getIdFruta() {
        return idFruta;
    }

    public String getNomeFruta() {
        return nomeFruta;
    }

    public int getQtdFruta() {
        return qtdFruta;
    }

    public String getMaturacaoFruta() {
        return maturacaoFruta;
    }

    public String getLocalColhido() {
        return localColhido;
    }
}
