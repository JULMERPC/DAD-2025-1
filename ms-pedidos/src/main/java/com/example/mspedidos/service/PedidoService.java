package com.example.mspedidos.service;


import com.example.mspedidos.entity.Pedido;

import java.util.List;
import java.util.Optional;




public interface PedidoService {


    List<Pedido> listar();
    Optional<Pedido> buscar(Integer id);
    Pedido guardar(Pedido pedido);
    Pedido actualizar(Integer id, Pedido pedido );
    void eliminar(Integer id);
}
