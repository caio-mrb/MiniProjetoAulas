package com.example;

import java.util.LinkedList;

public class Professor extends Identificador {
    private LinkedList<Aluno> alunos;

    public Professor(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.alunos = new LinkedList<>();
    }

    void adicionar(Aula aula){

    }

    void preeencherSumario(Aula aula){

    }

    void asssinarSumario(Aula aula){

    }

    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<>(alunos);
    }
}
