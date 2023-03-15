package com.example;

import java.util.LinkedList;

public class Aula extends Identificador{
    private StringBuilder sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    public Aula (String nome, int numero, Professor professor){
        super(nome,numero);
        this.sumario = new StringBuilder();
        this.professor = professor;
        this.alunos = new LinkedList<>();

    }

    public Professor getProfessor() {
        return professor;
    }

    public String getSumario() {
        return sumario.toString();
    }

    void adicionarLinhasSumario(String linha){
        if(linha == null)
            return;
        sumario.append(linha).append("\n");
    }

    public void desassociarProfessor(){
        this.professor = null;
        return;
    }

    void adicionar(Aluno aluno){
        if(aluno == null || alunos.contains(aluno))
            return;
        alunos.add(aluno);
        aluno.adicionar(this);
    }

    public void remover(Aluno aluno){
        if(aluno == null || !alunos.contains(aluno))
            return;
    }
    void setProfessor(Professor professor){
        if(professor == null || this.professor == professor)
            return;

        if (this.professor != null)
            desassociarProfessor();

        this.professor = professor;
        professor.adicionar(this);
    }
}
