package com.example;

import java.util.LinkedList;

public class Professor extends Identificador {
    private LinkedList<Aula> aulas;

    public Professor(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<>();
    }

    void adicionar(Aula aula){

    }

    void preeencherSumario(Aula aula){

    }

    void asssinarSumario(Aula aula){

    }
}
