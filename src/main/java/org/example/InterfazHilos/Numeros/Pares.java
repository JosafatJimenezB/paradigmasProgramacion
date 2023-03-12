package org.example.InterfazHilos.Numeros;

import javax.swing.*;
public class Pares extends Thread{

    private MainFrame frame;

    public Pares(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        int n;
        int contador = 0;
        for (n = 1; n <= 10; n++) {
            if (n % 2 == 0) {
                String output = " " + n + "\n";
                frame.appendToOutput(output);
                contador = contador + n;
            }
        }
        String sum = "La suma de los pares es: " + contador + "\n";
        String separator = "********************\n";
        frame.appendToOutput(sum);
        frame.appendToOutput(separator);
    }
}
