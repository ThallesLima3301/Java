package com.ecommerce.pedidos.strategy;

public class CartaoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
    }
}
