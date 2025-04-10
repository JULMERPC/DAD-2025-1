package com.example.msclientes.service.impl;


import com.example.msclientes.entity.Cliente;
import com.example.msclientes.repository.ClienteRepository;
import com.example.msclientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> buscar(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente guardar(Cliente categoria) {
        return clienteRepository.save(categoria);
    }

    @Override
    public Cliente actualizar(Integer id, Cliente categoria) {
        categoria.setId(id);
        return clienteRepository.save(categoria);
    }

    @Override
    public void eliminar(Integer id) {
        clienteRepository.deleteById(id);

    }
}
