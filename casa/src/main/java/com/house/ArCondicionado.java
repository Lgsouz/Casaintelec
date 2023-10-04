package com.house;

public abstract class ArCondicionado {

    private String nomeAr;
    private boolean ligado;
    private int temperatura;
    private String refrigeracaoForma;
    private int horarioFuncionamento;
    
    public ArCondicionado(String nomeAr, boolean ligado, int temperatura, String refrigeracaoForma, int horarioFuncionamento) {
        this.nomeAr = nomeAr;
        this.ligado = ligado;
        this.temperatura = temperatura;
        this.refrigeracaoForma = refrigeracaoForma;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getNomeAr() {
        return nomeAr;
    }

    public void setNomeAr(String nomeAr) {
        this.nomeAr = nomeAr;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getRefrigeracaoForma() {
        return refrigeracaoForma;
    }

    public void setRefrigeracaoForma(String refrigeracaoForma) {
        this.refrigeracaoForma = refrigeracaoForma;
    }

    public int getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(int horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    
}
