package com.example.mspedidos.controller;

import com.example.mspedidos.entity.Pedido;
import com.example.mspedidos.repository.PedidoRepository;
import com.example.mspedidos.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @RequestMapping
    public List<Pedido> listar() {
        return pedidoService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Pedido> buscar(@PathVariable Integer id) {
        return pedidoService.buscar(id);
    }

    @PostMapping
    public Pedido guardar(@RequestBody Pedido pedido) {
        System.out.println(pedido);
        return pedidoService.guardar(pedido);
    }

    @PutMapping("/{id}")
    public Pedido actualizar(@PathVariable Integer id, @RequestBody Pedido pedido) {
        return pedidoService.actualizar(id, pedido);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        pedidoService.eliminar(id);
    }
}
