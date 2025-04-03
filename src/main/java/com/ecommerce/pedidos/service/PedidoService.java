package com.ecommerce.pedidos.service;

import com.ecommerce.pedidos.factory.PedidoFactory;
import com.ecommerce.pedidos.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final PedidoFactory pedidoFactory;

    public PedidoService(PedidoFactory pedidoFactory) {
        this.pedidoFactory = pedidoFactory;
    }

    public Pedido criarPedido() {
        return pedidoFactory.criarPedido();
    }
}
