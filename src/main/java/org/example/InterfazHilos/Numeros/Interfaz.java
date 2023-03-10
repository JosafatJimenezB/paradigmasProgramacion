package org.example.InterfazHilos.Numeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interfaz extends JFrame{
    private JButton botonPares;
    private JButton botonImpares;
    private JTextArea areaTexto;
    private JScrollPane scrollPane;

    public Interfaz() {
        // Configuración de la ventana
        setTitle("Pares e Impares");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creación de los componentes
        botonPares = new JButton("Mostrar Pares");
        botonImpares = new JButton("Mostrar Impares");
        areaTexto = new JTextArea();
        scrollPane = new JScrollPane(areaTexto);

        // Configuración del área de texto
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);

        // Configuración del panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Configuración del panel de botones
        JPanel panelBotones = new JPanel(new GridLayout(1, 2, 10, 0));
        panelBotones.add(botonPares);
        panelBotones.add(botonImpares);

        // Agregamos los componentes al panel principal
        panelPrincipal.add(panelBotones, BorderLayout.NORTH);
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);

        // Agregamos el panel principal a la ventana
        getContentPane().add(panelPrincipal);

        // Creamos el área de texto
        areaTexto = new JTextArea();
        scrollPane = new JScrollPane(areaTexto);

        // Creamos los objetos de las clases Pares e Impares
        Pares pares = new Pares(areaTexto);
        Impares impares = new Impares(areaTexto);

        // Agregamos los listeners a los botones
        botonPares.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("Pares:\n");
                pares.start();
            }
        });

        botonImpares.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("Impares:\n");
                impares.start();
            }
        });
    }
}
