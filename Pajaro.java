package com.example;

public class Pajaro extends Mascota {
    public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void alimentar() {
        System.out.println(" El pajaro se alimenta con alpiste.");

    }

    @Override
    public void cuidar() {
        System.out.println("El pajaros necesita baños mensuales y cepillado.");

    }

    @Override
    public void hacerSonido() {
        System.out.println("El pajaro canta ");
    }
}
