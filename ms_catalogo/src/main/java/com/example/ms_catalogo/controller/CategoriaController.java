package com.example.ms_catalogo.controller;

import com.example.ms_catalogo.entity.Categoria;
import com.example.ms_catalogo.repository.CategoriaRepository;
import com.example.ms_catalogo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping
    public List<Categoria> listar() {
        return categoriaService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Categoria> buscar(@PathVariable Integer id) {
        return categoriaService.buscar(id);
    }

    @PostMapping
    public Categoria guardar(@RequestBody Categoria categoria) {
        System.out.println(categoria);
        return categoriaService.guardar(categoria);
    }

    @PutMapping("/{id}")
    public Categoria actualizar(@PathVariable Integer id, @RequestBody Categoria categoria) {
        return categoriaService.actualizar(id, categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        categoriaService.eliminar(id);
    }
}
