package com.example;

import java.util.LinkedList;
public class Professor extends Identificador {
    private LinkedList<Aluno> alunos;

    private LinkedList<Aula> aulas;

    public Professor(String nome, int numero) {
        super(nome, numero);
        this.alunos = new LinkedList<>();
        this.aulas = new LinkedList<>();
    }

    public void adicionar(Aula aula){
        if(aula == null || aulas.contains(aula))
            return;
        aulas.add(aula);
        aula.setProfessor(this);
    }

    public void remover(Aula aula){
        if (aula == null || !aulas.contains(aula))
            return;
        aulas.remove(aula);
        aula.desassociarProfessor();
    }
    public void preeencherSumario(Aula aula){
        if(aula == null || aula.getProfessor() != this || !aula.getSumario().isEmpty())
            return;
        aula.adicionarLinhasSumario(String.valueOf(aula.getNumero()));
    }

    public void asssinarSumario(Aula aula){

    }

    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<>(alunos);
    }
}
