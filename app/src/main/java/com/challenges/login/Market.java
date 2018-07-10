package com.challenges.login;

import android.view.View;

public class Market {

    private String nome, valor;
    private int image;

    public Market(String nome, String valor, int image) {
        this.nome = nome;
        this.valor = valor;
        this.image = image;
    }

    public Market(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
