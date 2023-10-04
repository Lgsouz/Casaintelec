package com.house;

import java.util.ArrayList;

public class House {
    
  ArrayList<Quarto> Quarto = new ArrayList<>();

    public void adicionarAparelho(Quarto cont) {
        Quarto.add(cont);
    }

    public void removerAparelhoQ(String nome) {
        for (int i = 0; i < Quarto.size(); i++) {
            if (Quarto.get(i).getNome().equals(nome)) {
                Quarto.remove(i);
            }
        }
    }

    public void editarQuarto(String nome, Quarto cont) {
        for (int i = 0; i < Quarto.size(); i++) {
            if (Quarto.get(i).getNome().equals(nome)) {
                Quarto.set(i, cont);
            }
        }
    }

    ArrayList<Sala> Sala = new ArrayList<>();

    public void adicionarAparelhoS(Sala cont) {
        Sala.add(cont);
    }

    public void removerAparelho(String nome) {
        for (int i = 0; i < Sala.size(); i++) {
            if (Sala.get(i).getNome().equals(nome)) {
                Sala.remove(i);
            }
        }
    }

    public void editarSala(String nome, Sala cont) {
        for (int i = 0; i < Sala.size(); i++) {
            if (Sala.get(i).getNome().equals(nome)) {
                Sala.set(i, cont);
            }
        }
    }

    ArrayList<Cozinha> Cozinha = new ArrayList<>();

    public void adicionarAparelhoS(Cozinha cont) {
        Cozinha.add(cont);
    }

    public void removerAparelhoC(String nome) {
        for (int i = 0; i < Sala.size(); i++) {
            if (Sala.get(i).getNome().equals(nome)) {
                Sala.remove(i);
            }
        }
    }

    public void editarCozinha(String nome, Cozinha cont) {
        for (int i = 0; i < Cozinha.size(); i++) {
            if (Cozinha.get(i).getNome().equals(nome)) {
                Cozinha.set(i, cont);
            }
        }
    }

}
