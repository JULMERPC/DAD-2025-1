//package com.example.mspagos.util;
//
//import com.example.mspagos.entity.Pago;
//import com.example.mspagos.repository.PagoRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//
//@Component
//public class PagoSeeder implements CommandLineRunner {
//    private final PagoRepository pagoRepository;
//
//    public PagoSeeder(PagoRepository pagoRepository) {
//        this.pagoRepository = pagoRepository;
//    }
//
//    @Override
//    public void run(String... args) {
//        // Eliminar todos los pedidos (opcional)
//        // pagoRepository.deleteAll();
//
//        if (pagoRepository.count() == 0) { // Verifica si la tabla está vacía
//            // Crear 5 objetos de pedidos con el constructor adecuado
//            Pago pedido1 = new Pago(null, "Producto A", 10, "COD001", LocalDateTime.now().minusDays(1));
//            Pago pedido2 = new Pago(null, "Producto B", 15, "COD002", LocalDateTime.now().minusDays(2));
//            Pago pedido3 = new Pago(null, "Producto C", 20, "COD003", LocalDateTime.now().minusDays(3));
//            Pago pedido4 = new Pago(null, "Producto D", 25, "COD004", LocalDateTime.now().minusDays(4));
//            Pago pedido5 = new Pago(null, "Producto E", 30, "COD005", LocalDateTime.now().minusDays(5));
//
//            // Guardar en la base de datos
//            pagoRepository.save(pedido1);
//            pagoRepository.save(pedido2);
//            pagoRepository.save(pedido3);
//            pagoRepository.save(pedido4);
//            pagoRepository.save(pedido5);
//
//            System.out.println("✅ Datos de pedidos insertados correctamente.");
//        } else {
//            System.out.println("Los pedidos ya existen, no se insertaron datos.");
//        }
//    }
//}





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

//        pagoRepository.deleteAll();


        if (pagoRepository.count() == 0) {
            Pago pago1 = new Pago(null, "Laptop Dell", 1, "PAG001", LocalDateTime.now().minusDays(1));
            Pago pago2 = new Pago(null, "Mouse Logitech", 2, "PAG002", LocalDateTime.now().minusDays(2));
            Pago pago3 = new Pago(null, "Teclado Mecánico", 1, "PAG003", LocalDateTime.now().minusDays(3));
            Pago pago4 = new Pago(null, "Monitor Samsung", 1, "PAG004", LocalDateTime.now().minusDays(4));
            Pago pago5 = new Pago(null, "Escritorio", 1, "PAG005", LocalDateTime.now().minusDays(5));
            Pago pago6 = new Pago(null, "Silla Ergonómica", 1, "PAG006", LocalDateTime.now().minusDays(6));
            Pago pago7 = new Pago(null, "Impresora HP", 1, "PAG007", LocalDateTime.now().minusDays(7));
            Pago pago8 = new Pago(null, "Audífonos Sony", 3, "PAG008", LocalDateTime.now().minusDays(8));
            Pago pago9 = new Pago(null, "Webcam Logitech", 2, "PAG009", LocalDateTime.now().minusDays(9));
            Pago pago10 = new Pago(null, "Disco Duro SSD", 4, "PAG010", LocalDateTime.now().minusDays(10));

            pagoRepository.save(pago1);
            pagoRepository.save(pago2);
            pagoRepository.save(pago3);
            pagoRepository.save(pago4);
            pagoRepository.save(pago5);
            pagoRepository.save(pago6);
            pagoRepository.save(pago7);
            pagoRepository.save(pago8);
            pagoRepository.save(pago9);
            pagoRepository.save(pago10);

            System.out.println("✅ 10 pagos insertados correctamente.");
        } else {
            System.out.println("Los pagos ya existen, no se insertaron datos.");
        }
    }
}
