package com.ecommerce.pedidos.strategy;

public class PixPagamento implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
    }
}
