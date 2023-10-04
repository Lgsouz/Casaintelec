package com.house;

public abstract class Fechadura {
    
    private String nomeFe;
    private boolean tranca;
    private String senha;
    private boolean biometria;
    private boolean chave;

    public Fechadura(String nomeFe, boolean tranca, String senha, boolean biometria, boolean chave){
       this.nomeFe = nomeFe;
       this.tranca = tranca;
       this.senha = senha;
       this.biometria = biometria;
       this.chave = chave;
    }

    public boolean isTranca() {
        return tranca;
    }

    public String getNomeFe() {
        return nomeFe;
    }

    public void setNomeFe(String nomeFe) {
        this.nomeFe = nomeFe;
    }

    public void setTranca(boolean tranca) {
        this.tranca = tranca;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isBiometria() {
        return biometria;
    }

    public void setBiometria(boolean biometria) {
        this.biometria = biometria;
    }

    public boolean isChave() {
        return chave;
    }

    public void setChave(boolean chave) {
        this.chave = chave;
    }


}
