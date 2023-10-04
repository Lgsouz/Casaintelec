package com.house;

public abstract class Geladeira {
    
    private String nomeGe;
    private boolean emFuncionamento;
    private boolean desgelo;
    private int temperatura;
    
    public Geladeira(String nomeGe, boolean emFuncionamento, boolean desgelo, int temperatura) {
        this.nomeGe = nomeGe;
        this.emFuncionamento = emFuncionamento;
        this.desgelo = desgelo;
        this.temperatura = temperatura;
    }

    public boolean isEmFuncionamento() {
        return emFuncionamento;
    }

    public void setEmFuncionamento(boolean emFuncionamento) {
        this.emFuncionamento = emFuncionamento;
    }

    public boolean isDesgelo() {
        return desgelo;
    }

    public void setDesgelo(boolean desgelo) {
        this.desgelo = desgelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getNomeGe() {
        return nomeGe;
    }

    public void setNomeGe(String nomeGe) {
        this.nomeGe = nomeGe;
    }

    
}
