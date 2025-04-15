package com.sistemaReservas.exception;

public class QuartoNaoEncontradoException extends Exception{
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public QuartoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
