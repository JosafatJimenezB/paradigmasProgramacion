package org.example.InterfazHilos.Numeros;

import javax.swing.*;
public class Pares extends Thread{

    private JTextArea areaTexto;

    public Pares(JTextArea areaTexto) {
        this.areaTexto = areaTexto;
    }

    public void run() {
        int n;
        int contador = 0;
        for (n = 1; n <= 10; n++) {
            if (n % 2 == 0) {
                String numero = " " + n + "\n";
                contador = contador + n;
                SwingUtilities.invokeLater(() -> areaTexto.append(numero));
            }
        }
        String suma = "La suma de los pares es : " + contador + "\n";
        SwingUtilities.invokeLater(() -> {
            areaTexto.append(suma);
            areaTexto.append(" ******************** \n");
        });
    }
}
