package com.example.msclientes.controller;

import com.example.msclientes.entity.Cliente;
import com.example.msclientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @RequestMapping
    public List<Cliente> listar() {
        return clienteService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Cliente> buscar(@PathVariable Integer id) {
        return clienteService.buscar(id);
    }

    @PostMapping
    public Cliente guardar(@RequestBody Cliente cliente) {
        System.out.println(cliente);
        return clienteService.guardar(cliente);
    }

    @PutMapping("/{id}")
    public Cliente actualizar(@PathVariable Integer id, @RequestBody Cliente cliente) {
        return clienteService.actualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        clienteService.eliminar(id);
    }
}
