package com.sistemaReservas.exception;

public class HospedeNaoEncontradoException extends Exception {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public HospedeNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
