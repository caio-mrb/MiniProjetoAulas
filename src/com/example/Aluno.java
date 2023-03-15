package com.example;

import java.util.LinkedList;

public class Aluno extends Identificador{
    private LinkedList<Aula> aulas;

    public Aluno(String nome, int numero){
        super(nome,numero);
        this.aulas = new LinkedList<>();
    }
    void adicionar (Aula aula){

    }
    void preencherSumario (Aula aula){
        if (aula==null || !aulas.contains(aula))
            return;
        assinarSumario(aula);
    }
    void assinarSumario (Aula aula) {
        aula.adicionarLinhasSumario(this.nome);
    }
}
