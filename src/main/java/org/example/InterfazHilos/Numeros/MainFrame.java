package org.example.InterfazHilos.Numeros;

import javax.swing.*;

public class MainFrame extends JFrame {

    private JTextArea outputArea;

    public MainFrame() {
        setTitle("Pares e Impares");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        contentPane.add(scrollPane);
    }

    public void appendToOutput(String text) {
        outputArea.append(text);
    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);

        Pares paresThread = new Pares(frame);
        Impares imparesThread = new Impares(frame);

        paresThread.start();
        imparesThread.start();
    }
}
