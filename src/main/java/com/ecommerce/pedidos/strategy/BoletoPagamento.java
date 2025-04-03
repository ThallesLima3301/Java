package com.ecommerce.pedidos.strategy;

public class BoletoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Boleto gerado no valor de R$" + valor + ". Aguarde a compensação.");
    }
}
