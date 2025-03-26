package com.example.ms_catalogo.repository;

import com.example.ms_catalogo.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    Integer id(Integer id);
}
