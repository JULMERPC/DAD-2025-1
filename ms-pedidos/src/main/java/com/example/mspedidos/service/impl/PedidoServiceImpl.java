package com.example.mspedidos.service.impl;


import com.example.mspedidos.entity.Pedido;
import com.example.mspedidos.repository.PedidoRepository;
import com.example.mspedidos.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Override
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> buscar(Integer id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public Pedido guardar(Pedido categoria) {
        return pedidoRepository.save(categoria);
    }

    @Override
    public Pedido actualizar(Integer id, Pedido categoria) {
        categoria.setId(id);
        return pedidoRepository.save(categoria);
    }

    @Override
    public void eliminar(Integer id) {
        pedidoRepository.deleteById(id);

    }
}
