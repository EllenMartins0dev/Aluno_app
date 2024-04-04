package com.ellen.martins;

public class Pessoa {
    private String nome;

    private int ano_nascimento;
    private String telefone;

    public Pessoa(String nome, int ano_nascimento, String telefone) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
