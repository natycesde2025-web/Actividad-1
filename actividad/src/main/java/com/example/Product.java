package com.example;

public class Product {

    // Atributos
    private String id;
    private String nombre;
    private double precio;
    private int stock;

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método toString
    @Override
    public String toString() {
        return "Producto [ID: " + id +
               ", Nombre: " + nombre +
               ", Precio: " + precio +
               ", Stock: " + stock + "]";
    }
}
