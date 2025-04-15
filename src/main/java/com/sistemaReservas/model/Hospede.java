package com.sistemaReservas.model;

public class Hospede {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Hospede(String telefone, String cpf, String nome, String email) {
        this.telefone = telefone;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
