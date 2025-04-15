package com.sistemaReservas.service;

import enums.TipoQuarto;
import exception.QuartoJaCadastradoException;
import exception.QuartoNaoEncontradoException;
import model.Quarto;

import java.util.ArrayList;
import java.util.List;

public class QuartoService {
    private final List<Quarto> quartos = new ArrayList<>();

    private Quarto encontrarPorNumero(int numero) {
        for (Quarto q : quartos) {
            if (q.getNumero() == numero) {
                return q;
            }
        }
        return null;
    }

    public void cadastrarQuarto(Quarto quarto) throws QuartoJaCadastradoException {
        if (encontrarPorNumero(quarto.getNumero()) != null) {
            throw new QuartoJaCadastradoException("O quarto nº " + quarto.getNumero() + " já está cadastrado.");
        }
        quartos.add(quarto);
        System.out.println("Quarto nº " + quarto.getNumero() + " cadastrado com sucesso!");
    }

    public void editarDadosQuarto(int numeroAntigo, int novoNumero, TipoQuarto tipoQuarto,
                                  int capacidade, double precoDiaria, boolean disponivel)
            throws QuartoNaoEncontradoException {

        Quarto quarto = encontrarPorNumero(numeroAntigo);

        if (quarto == null) {
            throw new QuartoNaoEncontradoException("Quarto nº " + numeroAntigo + " não encontrado.");
        }

        quarto.setNumero(novoNumero);
        quarto.setTipoQuarto(tipoQuarto);
        quarto.setCapacidade(capacidade);
        quarto.setPrecoDiaria(precoDiaria);
        quarto.setDisponivel(disponivel);

        System.out.println("Dados do Quarto nº " + novoNumero + " atualizados com sucesso!");
    }

    public void buscarQuarto(int numero) throws QuartoNaoEncontradoException {
        Quarto quarto = encontrarPorNumero(numero);

        if (quarto == null) {
            throw new QuartoNaoEncontradoException("Quarto nº " + numero + " não encontrado.");
        }

        System.out.println("Quarto encontrado: " + quarto);
    }

    public void consultarQuarto(int numero) throws QuartoNaoEncontradoException {
        Quarto quarto = encontrarPorNumero(numero);

        if (quarto == null) {
            throw new QuartoNaoEncontradoException("Quarto nº " + numero + " não encontrado.");
        }

        System.out.println("📋 Detalhes do Quarto:");
        System.out.println("Número: " + quarto.getNumero());
        System.out.println("Tipo: " + quarto.getTipoQuarto());
        System.out.println("Capacidade: " + quarto.getCapacidade());
        System.out.println("Disponível: " + (quarto.isDisponivel() ? "Sim" : "Não"));
        System.out.println("Preço da Diária: R$" + quarto.getPrecoDiaria());
    }
}
