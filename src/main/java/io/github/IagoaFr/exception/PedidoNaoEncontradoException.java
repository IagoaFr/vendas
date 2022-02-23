package io.github.IagoaFr.exception;

public class PedidoNaoEncontradoException extends RuntimeException {

    public PedidoNaoEncontradoException() {
        super("Pedido Não encontrado");
    }
}
