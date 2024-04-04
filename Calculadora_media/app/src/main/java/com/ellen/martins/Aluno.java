package com.ellen.martins;

public class Aluno {
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double media;

    public Aluno(String nome, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

  private double calcularMedia() {
        media = (nota1 + nota2)/2;
        return media;
  }
}
