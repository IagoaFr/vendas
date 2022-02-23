package io.github.IagoaFr.service;

import io.github.IagoaFr.domain.entity.Pedido;
import io.github.IagoaFr.domain.enums.StatusPedido;
import io.github.IagoaFr.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
