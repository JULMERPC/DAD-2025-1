package com.example.mspagos.repository;

import com.example.mspagos.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface PagoRepository extends JpaRepository<Pago, Integer> {
    Integer id(Integer id);
}
