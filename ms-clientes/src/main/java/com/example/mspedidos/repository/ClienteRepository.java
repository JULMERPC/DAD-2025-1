package com.example.mspedidos.repository;

import com.example.mspedidos.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Integer id(Integer id);
}
