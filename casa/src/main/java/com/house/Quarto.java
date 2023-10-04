package com.house;

public class Quarto {

    String nome, senha, comodo, cor, refrigeracaoForma;
    boolean tranca, ativo, emFuncionamento, desgelo, biometria, chave, acesa, ligado;
    int temperatura, intensidade, temperaturaAr;

   public Quarto(String nome){
     this.nome = nome;
   }

public Quarto(String nome, boolean ativo, String comodo) {
}

public Quarto(String nome, boolean emFuncionamento, boolean desgelo, int temperatura) {
}

public Quarto(String nome, boolean tranca, String senha, boolean biometria, boolean chave) {
}

public Quarto(String nome, boolean acesa, String cor, int intensidade) {
}

public Quarto(String nome, boolean ligado, int temperaturaAr, String refrigeracaoForma, int horarioFuncionamento) {
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getSenha() {
    return senha;
}

public void setSenha(String senha) {
    this.senha = senha;
}

public String getComodo() {
    return comodo;
}

public void setComodo(String comodo) {
    this.comodo = comodo;
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

public String getRefrigeracaoForma() {
    return refrigeracaoForma;
}

public void setRefrigeracaoForma(String refrigeracaoForma) {
    this.refrigeracaoForma = refrigeracaoForma;
}

public boolean isTranca() {
    return tranca;
}

public void setTranca(boolean tranca) {
    this.tranca = tranca;
}

public boolean isAtivo() {
    return ativo;
}

public void setAtivo(boolean ativo) {
    this.ativo = ativo;
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

public boolean isAcesa() {
    return acesa;
}

public void setAcesa(boolean acesa) {
    this.acesa = acesa;
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

public void setTemperatura(int temperatura) {
    this.temperatura = temperatura;
}

public int getIntensidade() {
    return intensidade;
}

public void setIntensidade(int intensidade) {
    this.intensidade = intensidade;
}

public int getTemperaturaAr() {
    return temperaturaAr;
}

public void setTemperaturaAr(int temperaturaAr) {
    this.temperaturaAr = temperaturaAr;
}

public String Imprimir() {
    return "\nO " + getNome() + "\nestá " + isAtivo() + "\nno cômodo: "
            + getComodo() +".";
}
}
