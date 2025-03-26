package com.example.ms_catalogo.util;

import com.example.ms_catalogo.entity.Categoria;
import com.example.ms_catalogo.repository.CategoriaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CategoriaSeeder implements CommandLineRunner {
    private final CategoriaRepository categoriaRepository;

    public CategoriaSeeder(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }


    @Override
    public void run(String... args) {

//        categoriaRepository.deleteAll();

        if (categoriaRepository.count() == 0) { // Verifica si la tabla está vacía
            // Crear objetos de categorías
            Categoria cat1 = new Categoria(null, "Electrónica");
            Categoria cat2 = new Categoria(null, "Automotriz");
            Categoria cat3 = new Categoria(null, "Ropa");
            Categoria cat4 = new Categoria(null, "Hogar");
            Categoria cat5 = new Categoria(null, "Juguetes");
            Categoria cat6 = new Categoria(null, "Libros");
            Categoria cat7 = new Categoria(null, "Deportes");
            Categoria cat8 = new Categoria(null, "Salud");
            Categoria cat9 = new Categoria(null, "Belleza");
            Categoria cat10 = new Categoria(null, "Mascotas");
            Categoria cat11 = new Categoria(null, "Computadoras");
            Categoria cat12 = new Categoria(null, "Celulares");
            Categoria cat13 = new Categoria(null, "Física");
            Categoria cat14 = new Categoria(null, "Jardín");
            Categoria cat15 = new Categoria(null, "Bebidas");
            Categoria cat16 = new Categoria(null, "Joyería");
            Categoria cat17 = new Categoria(null, "Videojuegos");
            Categoria cat18 = new Categoria(null, "Papelería");
            Categoria cat19 = new Categoria(null, "Cine y TV");
            Categoria cat20 = new Categoria(null, "Cuidado Personal");

            // Guardar en la base de datos
            categoriaRepository.save(cat1);
            categoriaRepository.save(cat2);
            categoriaRepository.save(cat3);
            categoriaRepository.save(cat4);
            categoriaRepository.save(cat5);
            categoriaRepository.save(cat6);
            categoriaRepository.save(cat7);
            categoriaRepository.save(cat8);
            categoriaRepository.save(cat9);
            categoriaRepository.save(cat10);
            categoriaRepository.save(cat11);
            categoriaRepository.save(cat12);
            categoriaRepository.save(cat13);
            categoriaRepository.save(cat14);
            categoriaRepository.save(cat15);
            categoriaRepository.save(cat16);
            categoriaRepository.save(cat17);
            categoriaRepository.save(cat18);
            categoriaRepository.save(cat19);
            categoriaRepository.save(cat20);

            System.out.println("✅ Datos de categorías insertadas correctamente.");
        }  else {
            System.out.println("Las categoria ya existen, no se insertaron datos.");
        }

    }
}
