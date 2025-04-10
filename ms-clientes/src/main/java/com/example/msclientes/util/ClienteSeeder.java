package com.example.msclientes.util;

import com.example.msclientes.entity.Cliente;
import com.example.msclientes.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ClienteSeeder implements CommandLineRunner {
    private final ClienteRepository clienteRepository;

    public ClienteSeeder(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void run(String... args) {
        // Eliminar todos los pedidos (opcional)
        // clienteRepository.deleteAll();

        if (clienteRepository.count() == 0) { // Verifica si la tabla está vacía
            // Crear 5 objetos de pedidos con el constructor adecuado
            Cliente pedido1 = new Cliente(null, "Producto A", 10, "COD001", LocalDateTime.now().minusDays(1));
            Cliente pedido2 = new Cliente(null, "Producto B", 15, "COD002", LocalDateTime.now().minusDays(2));
            Cliente pedido3 = new Cliente(null, "Producto C", 20, "COD003", LocalDateTime.now().minusDays(3));
            Cliente pedido4 = new Cliente(null, "Producto D", 25, "COD004", LocalDateTime.now().minusDays(4));
            Cliente pedido5 = new Cliente(null, "Producto E", 30, "COD005", LocalDateTime.now().minusDays(5));

            // Guardar en la base de datos
            clienteRepository.save(pedido1);
            clienteRepository.save(pedido2);
            clienteRepository.save(pedido3);
            clienteRepository.save(pedido4);
            clienteRepository.save(pedido5);

            System.out.println("✅ Datos de pedidos insertados correctamente.");
        } else {
            System.out.println("Los pedidos ya existen, no se insertaron datos.");
        }
    }
}
