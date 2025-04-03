package com.ecommerce.pedidos;

import com.ecommerce.pedidos.model.Cliente;
import com.ecommerce.pedidos.model.Produto;
import com.ecommerce.pedidos.model.Pedido;
import com.ecommerce.pedidos.repository.ClienteRepository;
import com.ecommerce.pedidos.repository.ProdutoRepository;
import com.ecommerce.pedidos.repository.PedidoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    private final ClienteRepository clienteRepository;
    private final ProdutoRepository produtoRepository;
    private final PedidoRepository pedidoRepository;

    public DataLoader(ClienteRepository clienteRepository, ProdutoRepository produtoRepository, PedidoRepository pedidoRepository) {
        this.clienteRepository = clienteRepository;
        this.produtoRepository = produtoRepository;
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Cliente cliente = new Cliente("João Silva", "joao@email.com");
        clienteRepository.save(cliente);

        Produto produto1 = new Produto("Laptop", 3500.00);
        Produto produto2 = new Produto("Mouse", 150.00);
        produtoRepository.saveAll(Arrays.asList(produto1, produto2));

        Pedido pedido = new Pedido(cliente, Arrays.asList(produto1, produto2), produto1.getPreco() + produto2.getPreco());
        pedidoRepository.save(pedido);

        System.out.println("Dados inseridos com sucesso!");
    }
}
