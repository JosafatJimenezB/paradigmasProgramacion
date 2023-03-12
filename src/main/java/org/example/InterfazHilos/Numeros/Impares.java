package org.example.InterfazHilos.Numeros;

import javax.swing.*;
public class Impares extends Thread{

    private MainFrame frame;

    public Impares(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        int n, c = 0;
        int contador = 0;
        for (n = 1; n <= 10; n++) {
            c = n % 2;
            if (c != 0) {
                String output = " " + n + "\n";
                frame.appendToOutput(output);
                contador = contador + n;
            }
        }
        String sum = "La suma de los impares es: " + contador + "\n";
        frame.appendToOutput(sum);
    }
}
