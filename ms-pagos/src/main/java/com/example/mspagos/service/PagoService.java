package com.example.mspagos.service;


import com.example.mspagos.entity.Pago;

import java.util.List;
import java.util.Optional;




public interface PagoService {


    List<Pago> listar();
    Optional<Pago> buscar(Integer id);
    Pago guardar(Pago pedido);
    Pago actualizar(Integer id, Pago pedido );
    void eliminar(Integer id);
}
