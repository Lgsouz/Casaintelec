package com.house;

public abstract class Lampada {

    private String nomeLa;
    private boolean acesa;
    private String cor;
    private int intensidade;
    
    public Lampada(String nomeLa, boolean acesa, String cor, int intensidade) {
        this.nomeLa = nomeLa;
        this.acesa = acesa;
        this.cor = cor;
        this.intensidade = intensidade;
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public String getNomeLa() {
        return nomeLa;
    }

    public void setNomeLa(String nomeLa) {
        this.nomeLa = nomeLa;
    }

}
