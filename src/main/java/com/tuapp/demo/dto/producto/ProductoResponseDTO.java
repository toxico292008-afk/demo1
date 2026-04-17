package com.tuapp.demo.dto.producto;

public class ProductoResponseDTO {

    private Long id;
    private String nombre;
    private double precio;
    private int stock;

    public ProductoResponseDTO() {
    }

    public ProductoResponseDTO(Long id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Long getId() {
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
}