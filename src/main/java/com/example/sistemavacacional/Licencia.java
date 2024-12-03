package com.example.sistemavacacional;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton button1, button2;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    String nombre_usuario = "";

    public Licencia() {
        setLayout(null);
        setTitle("Licencia de uso");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setIconImage(new ImageIcon(getClass().getResource("../../resources/assets/grafica.jpg")).getImage());
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombre_usuario = Bienvenida.userName;


        label1 = new JLabel("TERMINOS y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Andale Mono", 0, 9));
        textArea.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                "\n\n          A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA AGUSTIN TAMAGNONE." +
                "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                "\n            C.  AGUSTIN TAMAGNONE NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                "\n          (AGUSTIN TAMAGNONE), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
                "\n          www.agustintamagnonedev.com");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 40, 575, 200);
        add(scrollPane);

        check1 = new JCheckBox("Yo " + nombre_usuario + " Acepto");
        check1.setBounds(10, 250, 300, 30);
        check1.addChangeListener(this);
        add(check1);

        button1 = new JButton("Continuar");
        button1.setBounds(10, 290, 100, 30);
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);

        button2 = new JButton("No Acepto");
        button2.setBounds(120, 290, 100, 30);
        button2.addActionListener(this);
        button2.setEnabled(true);
        add(button2);

        ImageIcon imagen = new ImageIcon("../../resources/assets/grafica.jpg");
        label2 = new JLabel(imagen);
        label2.setBounds(315, 135, 300, 300);
        add(label2);
    }

    public void stateChanged(ChangeEvent e) {
        if (check1.isSelected()) {
            button1.setEnabled(true);
            button2.setEnabled(false);
        } else {
            button1.setEnabled(false);
            button2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            Principal principal = new Principal();
            principal.setVisible(true);
            principal.setBounds(0, 0, 900, 700);
            principal.setLocationRelativeTo(null);
            principal.setResizable(false);
            this.setVisible(false);

        } else if (e.getSource() == button2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Licencia ventanalicencia = new Licencia();
        ventanalicencia.setBounds(0, 0, 600, 360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
    }
}
