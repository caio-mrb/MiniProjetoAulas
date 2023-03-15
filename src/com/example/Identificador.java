package com.example;

public class Identificador {
    protected String nome;
    protected int numero;

    public Identificador(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }
}
