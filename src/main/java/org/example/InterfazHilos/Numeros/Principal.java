package org.example.InterfazHilos.Numeros;

public class Principal {

    public static void main(String[] args) {
        Pares eje1 = new Pares();
        eje1.start();
        Impares eje2 = new Impares();
        eje2.start();
    }
}
