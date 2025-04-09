package com.example.mspagos.util;

import com.example.mspagos.entity.Pago;
import com.example.mspagos.repository.PagoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PagoSeeder implements CommandLineRunner {
    private final PagoRepository pagoRepository;

    public PagoSeeder(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    @Override
    public void run(String... args) {
        // Eliminar todos los pedidos (opcional)
        // pagoRepository.deleteAll();

        if (pagoRepository.count() == 0) { // Verifica si la tabla está vacía
            // Crear 5 objetos de pedidos con el constructor adecuado
            Pago pedido1 = new Pago(null, "Producto A", 10, "COD001", LocalDateTime.now().minusDays(1));
            Pago pedido2 = new Pago(null, "Producto B", 15, "COD002", LocalDateTime.now().minusDays(2));
            Pago pedido3 = new Pago(null, "Producto C", 20, "COD003", LocalDateTime.now().minusDays(3));
            Pago pedido4 = new Pago(null, "Producto D", 25, "COD004", LocalDateTime.now().minusDays(4));
            Pago pedido5 = new Pago(null, "Producto E", 30, "COD005", LocalDateTime.now().minusDays(5));

            // Guardar en la base de datos
            pagoRepository.save(pedido1);
            pagoRepository.save(pedido2);
            pagoRepository.save(pedido3);
            pagoRepository.save(pedido4);
            pagoRepository.save(pedido5);

            System.out.println("✅ Datos de pedidos insertados correctamente.");
        } else {
            System.out.println("Los pedidos ya existen, no se insertaron datos.");
        }
    }
}
