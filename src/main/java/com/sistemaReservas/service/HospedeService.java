package com.sistemaReservas.service;

import exception.HospedeNaoEncontradoException;
import model.Hospede;

import java.util.ArrayList;

public class HospedeService {
    ArrayList <Hospede> hospedes = new ArrayList<>();

    public void cadastrarHospede(Hospede hospede){
        hospedes.add(hospede);
        System.out.println("O HOSPEDE  " + hospede.getNome() + " FOI CADASTRADO COM SUCESSO !");
    }

    public void editarDados(Hospede hospede, String cpf,String nome, String email, String telefone){
        hospede.setCpf(cpf);
        hospede.setNome(nome);
        hospede.setEmail(email);
        hospede.setTelefone(telefone);

        System.out.println("Seus dados foram alterados com sucesso !");
    }

    public void consultarDadosPorCpf(String cpf) throws HospedeNaoEncontradoException {
        boolean encontrado = false;

        for (Hospede h : hospedes) {
            if (h.getCpf().equals(cpf)) {
                System.out.println(" CPF do hóspede encontrado! Seguem os dados:");
                System.out.println("Nome: " + h.getNome());
                System.out.println("Telefone: " + h.getTelefone());
                System.out.println("E-mail: " + h.getEmail());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            throw new HospedeNaoEncontradoException(" CPF não encontrado! Este hóspede não está cadastrado.");
        }
    }



    public void consultarDados(Hospede hospede){
        System.out.println("CPF: " + hospede.getCpf() + "\n" + "NOME: " + hospede.getNome() + "\n" + "EMAIL: "+ hospede.getEmail() + "\n" + "TELEFONE: " + hospede.getTelefone());
    }

}
