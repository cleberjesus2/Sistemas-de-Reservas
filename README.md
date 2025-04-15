# 🏨 Sistema de Reservas de Hotel

Um projeto simples e funcional para gerenciamento de reservas em um hotel, desenvolvido com foco em conceitos fundamentais da programação orientada a objetos em Java, utilizando JDBC, listas, filas e pilhas.

---

## ✨ Conceitos a Serem Revisados com Este Projeto

- ✅ **POO (Programação Orientada a Objetos)**
- ✅ **Tratamento de Exceções**
- ✅ **JDBC (Java Database Connectivity)**
- ✅ **Coleções: Listas e Filas (Queue)**

---

## 📋 Descrição Geral

Este sistema permite o **cadastro de hóspedes e quartos**, além de gerenciar **reservas, check-in, check-out** e até mesmo uma **fila de espera** para quando não houver quartos disponíveis. Conta também com um **histórico de reservas usando pilha**, permitindo funcionalidades como **desfazer a última reserva**.

---

## 🚀 Funcionalidades

### 🧍‍♂️ 1. Cadastro e Gerenciamento de Hóspedes

- Cadastro de hóspede (nome, CPF, telefone, e-mail)
- Consulta por nome ou CPF
- Edição de dados
- Remoção de hóspedes

### 🛏️ 2. Cadastro e Gerenciamento de Quartos

- Cadastro de quartos (número, tipo, capacidade, preço, disponibilidade)
- Consulta de quartos disponíveis
- Edição de dados
- Remoção de quartos

### 📆 3. Sistema de Reservas e Check-in/Check-out

- Criação de reserva (com datas de entrada e saída)
- Realização de check-in
- Realização de check-out com cálculo da estadia
- Consulta de reservas ativas

### ⏳ 4. Fila de Espera (Queue)

- Caso não haja quartos disponíveis, o hóspede entra em uma fila de espera
- Hóspedes são notificados conforme quartos se tornam disponíveis

### 📚 5. Histórico de Reservas (Stack)

- Armazena reservas finalizadas ou canceladas
- Permite desfazer a última reserva via pilha

### 📈 6. Relatórios e Estatísticas

- Número de quartos ocupados vs. disponíveis
- Tipo de quarto mais reservado

### 🛡️ 7. Validações e Exceções

- Impede reservas duplicadas
- Impede check-in sem reserva
- Impede check-out antes de check-in

---

## 💻 Tecnologias

- **Java 11+**
- **JDBC**
- **MySQL ou PostgreSQL**
- **Coleções Java (ArrayList, Queue, Stack)**
