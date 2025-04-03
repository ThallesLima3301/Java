package com.ecommerce.pedidos.factory;

import com.ecommerce.pedidos.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class PedidoFactoryImpl implements PedidoFactory {

    @Override
    public Pedido criarPedido() {
        return new Pedido(); // Criando um novo pedido
    }
}
