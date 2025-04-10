package com.example.mspagos.service.impl;


import com.example.mspagos.entity.Pago;
import com.example.mspagos.repository.PagoRepository;
import com.example.mspagos.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoServiceImpl implements PagoService {
    @Autowired
    private PagoRepository pedidoRepository;
    @Override
    public List<Pago> listar() {
        return pedidoRepository.findAll();
    }

    @Override
    public Optional<Pago> buscar(Integer id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public Pago guardar(Pago categoria) {
        return pedidoRepository.save(categoria);
    }

    @Override
    public Pago actualizar(Integer id, Pago categoria) {
        categoria.setId(id);
        return pedidoRepository.save(categoria);
    }

    @Override
    public void eliminar(Integer id) {
        pedidoRepository.deleteById(id);

    }
}
