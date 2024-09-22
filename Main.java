package com.example;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Connor", "Canino", "Pitbull", 5, "grande", "Gris exotico", "saludable");
        Gato gato = new Gato("Totoy", "Felino", "Angora", 7, "Pequeño", "Cafe", "Saludable");
        Pajaro pajaro = new Pajaro("Piolin", "Aves", "Canarios", 2, "pequeño", "negro con amarillo", "saludable");
        Tortuga tortuga = new Tortuga("Donatelo", "reptil", "Marina", 8, "Grande", "Negra", "Saludable");

        System.out.println("Información del Perro:");
        perro.mostrarInformacion();
        perro.hacerSonido();
        perro.alimentar();
        perro.cuidar();
        System.out.println();

        System.out.println("Información del Gato:");
        gato.mostrarInformacion();
        gato.hacerSonido();
        gato.alimentar(); 
        gato.cuidar();
        System.out.println();

        System.out.println("Información del Pájaro:");
        pajaro.mostrarInformacion();
        pajaro.hacerSonido();
        pajaro.alimentar();
        pajaro.cuidar();
        System.out.println();

        System.out.println("Información de la Tortuga:");
        tortuga.mostrarInformacion();
        tortuga.hacerSonido();
        tortuga.alimentar();
        tortuga.cuidar();
    }  
}  
