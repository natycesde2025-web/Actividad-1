package com.example;

public class Main {

    public static void main(String[] args) {

        // Crear objetos vacíos
        Product producto1 = new Product();
        Product producto2 = new Product();

        // Asignar valores con setters
        producto1.setId("P01");
        producto1.setNombre("Cuaderno");
        producto1.setPrecio(5000);
        producto1.setStock(20);

        producto2.setId("P02");
        producto2.setNombre("Lapicero");
        producto2.setPrecio(3000);
        producto2.setStock(50);

        // Modificar al menos un atributo
        producto1.setPrecio(2500);
        producto2.setStock(20);
        // Usar getters
        System.out.println("Nombre producto 1: " + producto1.getNombre());
        System.out.println("Precio producto 1: " + producto1.getPrecio());

        System.out.println("Nombre producto 2: " + producto2.getNombre());
        System.out.println("Stock producto 2: " + producto2.getStock());

        // Mostrar objeto completo
        System.out.println(producto1);
        System.out.println(producto2);
    }
}