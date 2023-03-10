package org.example.InterfazHilos.Numeros;

import javax.swing.*;
public class Impares extends Thread{

    private JTextArea areaTexto;

    public Impares(JTextArea areaTexto) {
        this.areaTexto = areaTexto;
    }

    public void run() {
        int n, c = 0;
        int contador = 0;
        for (n = 1; n <= 10; n++) {
            c = n % 2;
            if (c != 0) {
                String numero = " " + n + "\n";
                contador = contador + n;
                SwingUtilities.invokeLater(() -> areaTexto.append(numero));
            }
        }
        String suma = "La suma de los impares es : " + contador + "\n";
        SwingUtilities.invokeLater(() -> areaTexto.append(suma));
    }
}
