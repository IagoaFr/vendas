package io.github.IagoaFr.exception;

public class SenhaInvalidaException extends RuntimeException {
    public  SenhaInvalidaException() {
        super("Senha inválida");
    }
}
