package com.example.sistemavacacional;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JLabel label1, label2, label3, label4;
    private JButton button1;
    public static String userName = "";

    public Bienvenida() {
        setLayout(null);
        setTitle("Bienvenida");
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setIconImage(new ImageIcon(getClass().getResource("../../resources/assets/grafica.jpg")).getImage());

        ImageIcon imagen = new ImageIcon("../../resources/assets/grafica.jpg");
        label1 = new JLabel(imagen);
        label1.setBounds(25, 15, 300, 150);
        add(label1);

        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Andale Mono ", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("Ingrese su nombre: ");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono ", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("2025 Grafica Tamagnone SRL");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono ", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        textfield1 = new JTextField();
        textfield1.setBounds(45, 240, 255, 25);
        textfield1.setBackground(Color.white);
        textfield1.setFont(new Font("Andale Mono ", 1, 14));
        textfield1.setForeground(new Color(0, 0, 0));
        add(textfield1);

        button1 = new JButton("Ingresar");
        button1.setBounds(125, 280, 100, 30);
        button1.setBackground(new Color(255, 255, 255));
        button1.setForeground(new Color(0, 0, 0));
        button1.setFont(new Font("Andale Mono ", 1, 14));
        button1.addActionListener(this);
        add(button1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {

            userName = textfield1.getText().trim();

            if (userName.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, para continuar ingrese su nombre.");
            } else {
                Licencia ventanalicencia = new Licencia();
                ventanalicencia.setBounds(0, 0, 600, 360);
                ventanalicencia.setVisible(true);
                ventanalicencia.setResizable(false);
                ventanalicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        Bienvenida ventanabienvenida = new Bienvenida();
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setBounds(0, 0, 350, 450);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);
    }
}
