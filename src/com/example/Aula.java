package com.example;

import java.util.LinkedList;

public class Aula extends Identificador{
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    public Aula (String nome, int numero, Professor professor){
        this.nome = nome;
        this.numero = numero;
        this.sumario = "";
        this.professor = professor;
        this alunos = new LinkedList<>();


    }
    void adicionarLinhasSumario(String linha){

    }

    void adicionar(Aluno aluno){

    }
    void setProfessor(Professor professor){

    }
}
