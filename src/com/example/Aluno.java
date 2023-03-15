package com.example;

import java.util.LinkedList;

public class Aluno extends Identificador{
    private LinkedList<Aula> aulas;

    public Aluno(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<>();
    }
    void adicionar (Aula aula){

    }
    void preencherSumario (Aula aula){

    }
    void assinarSumario (Aula aula) {

    }
}
