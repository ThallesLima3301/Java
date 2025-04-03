package com.ecommerce.pedidos.factory;

import com.ecommerce.pedidos.model.Pedido;
import java.util.ArrayList;

public class PedidoComumFactory implements PedidoFactory {

    @Override
    public Pedido criarPedido() {
        return new Pedido(null, new ArrayList<>(), 0.0);
    }
}
