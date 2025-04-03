package com.ecommerce.pedidos.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToMany
    private List<Produto> produtos;

    private double valorTotal;

    // Construtor com todos os atributos
    public Pedido(Cliente cliente, List<Produto> produtos, double valorTotal) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    // Construtor vazio necessário para o JPA
    public Pedido() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    // Método que estava faltando
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
