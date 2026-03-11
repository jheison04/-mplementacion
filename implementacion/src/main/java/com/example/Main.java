package com.example;

public class Main {

    public static void main(String[] args) {

        // Producto usando constructor por defecto
        Producto p1 = new Producto();

        p1.setId(1);
        p1.setNombre("Laptop");
        p1.setPrecio(1200);
        p1.setStock(5);

        // Producto usando constructor parametrizado
        Producto p2 = new Producto(2, "Mouse", 50, 20);

        // Mostrar información
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        // Modificar datos
        p2.setPrecio(45);
        p2.setStock(25);

        System.out.println("Producto actualizado:");
        System.out.println(p2.toString());
    }
}
