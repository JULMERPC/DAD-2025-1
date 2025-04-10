package com.example.msclientes.repository;

import com.example.msclientes.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Integer id(Integer id);
}
