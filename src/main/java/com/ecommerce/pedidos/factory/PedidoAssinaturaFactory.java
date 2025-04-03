package com.ecommerce.pedidos.factory;

import com.ecommerce.pedidos.model.Pedido;
import java.util.ArrayList;

public class PedidoAssinaturaFactory implements PedidoFactory {

    @Override
    public Pedido criarPedido() {
        Pedido pedido = new Pedido(null, new ArrayList<>(), 0.0);
        
        return pedido;
    }
}
