package com.example.mspedidos.util;

import com.example.mspedidos.entity.Cliente;
import com.example.mspedidos.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PedidoSeeder implements CommandLineRunner {
    private final ClienteRepository pedidoRepository;

    public PedidoSeeder(ClienteRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public void run(String... args) {
        // Eliminar todos los pedidos (opcional)
        // pedidoRepository.deleteAll();

        if (pedidoRepository.count() == 0) { // Verifica si la tabla está vacía
            // Crear 5 objetos de pedidos con el constructor adecuado
            Cliente pedido1 = new Cliente(null, "Producto A", 10, "COD001", LocalDateTime.now().minusDays(1));
            Cliente pedido2 = new Cliente(null, "Producto B", 15, "COD002", LocalDateTime.now().minusDays(2));
            Cliente pedido3 = new Cliente(null, "Producto C", 20, "COD003", LocalDateTime.now().minusDays(3));
            Cliente pedido4 = new Cliente(null, "Producto D", 25, "COD004", LocalDateTime.now().minusDays(4));
            Cliente pedido5 = new Cliente(null, "Producto E", 30, "COD005", LocalDateTime.now().minusDays(5));

            // Guardar en la base de datos
            pedidoRepository.save(pedido1);
            pedidoRepository.save(pedido2);
            pedidoRepository.save(pedido3);
            pedidoRepository.save(pedido4);
            pedidoRepository.save(pedido5);

            System.out.println("✅ Datos de pedidos insertados correctamente.");
        } else {
            System.out.println("Los pedidos ya existen, no se insertaron datos.");
        }
    }
}
