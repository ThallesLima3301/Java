package com.ecommerce.pedidos.repository;

import com.ecommerce.pedidos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
