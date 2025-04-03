package com.ecommerce.pedidos.controller;

import com.ecommerce.pedidos.model.Pedido;
import com.ecommerce.pedidos.model.Cliente;
import com.ecommerce.pedidos.repository.PedidoRepository;
import com.ecommerce.pedidos.repository.ClienteRepository;
import com.ecommerce.pedidos.strategy.PagamentoStrategy;
import com.ecommerce.pedidos.strategy.BoletoPagamento;
import com.ecommerce.pedidos.strategy.CartaoPagamento;
import com.ecommerce.pedidos.strategy.PixPagamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    // Listar todos os pedidos
    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    // Buscar um pedido pelo ID
    @GetMapping("/{id}")
    public Optional<Pedido> buscarPedidoPorId(@PathVariable Long id) {
        return pedidoRepository.findById(id);
    }

    // Criar um novo pedido e processar pagamento
    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido, @RequestParam String metodoPagamento) {

        // Garantir que o cliente já está salvo no banco
        if (pedido.getCliente().getId() == null) {
            Cliente clienteSalvo = clienteRepository.save(pedido.getCliente());
            pedido.setCliente(clienteSalvo);
        }

        // Escolhendo o método de pagamento
        PagamentoStrategy pagamento;
        switch (metodoPagamento.toLowerCase()) {
            case "cartao":
                pagamento = new CartaoPagamento();
                break;
            case "boleto":
                pagamento = new BoletoPagamento();
                break;
            case "pix":
                pagamento = new PixPagamento();
                break;
            default:
                throw new IllegalArgumentException("Método de pagamento inválido");
        }

        // Processando o pagamento
        pagamento.pagar(pedido.getValorTotal());

        // Salvando o pedido
        return pedidoRepository.save(pedido);
    }

    // Atualizar um pedido existente
    @PutMapping("/{id}")
    public Pedido atualizarPedido(@PathVariable Long id, @RequestBody Pedido pedidoAtualizado) {
        return pedidoRepository.findById(id).map(pedido -> {
            pedido.setCliente(pedidoAtualizado.getCliente());
            pedido.setValorTotal(pedidoAtualizado.getValorTotal());
            return pedidoRepository.save(pedido);
        }).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    // Excluir um pedido
    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id) {
        pedidoRepository.deleteById(id);
    }
}
