package com.example.mspagos.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

//@Entity
//@Table(name = "pedidos")
//@Data
//public class Pedido {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String producto;
//    private Integer cantidad;
//    private String codigo;
//    private LocalDateTime fecha = LocalDateTime.now();
//}


@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String producto;
    private Integer cantidad;
    private String codigo;
    private LocalDateTime fecha;

    public Pago() {
        this.fecha = LocalDateTime.now();
    }

    public Pago(Integer id, String producto, Integer cantidad, String codigo, LocalDateTime fecha) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", codigo='" + codigo + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
