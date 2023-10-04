package com.house;

public abstract class Aspirador {

    private String nomeAs;
    private boolean ativo;
    private String comodoAtual;
    
    public Aspirador(String nomeAs, boolean ativo, String comodoAtual) {
        this.nomeAs = nomeAs;
        this.ativo = ativo;
        this.comodoAtual = comodoAtual;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getComodoAtual() {
        return comodoAtual;
    }

    public String getNomeAs() {
        return nomeAs;
    }

    public void setNomeAs(String nomeAs) {
        this.nomeAs = nomeAs;
    }

    public void setComodoAtual(String comodoAtual) {
        this.comodoAtual = comodoAtual;
    }
    
    
}
