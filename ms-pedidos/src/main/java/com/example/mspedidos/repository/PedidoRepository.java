package com.example.mspedidos.repository;

import com.example.mspedidos.entity.Pedido;
import com.example.mspedidos.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface PedidoRepository extends JpaRepository<com.example.mspedidos.entity.Pedido, Integer> {
    Integer id(Integer id);
}
