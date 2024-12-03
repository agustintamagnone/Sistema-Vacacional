package com.example.sistemavacacional;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu menuOpciones, menuColorFondo, menuCalcular, menuAcercaDe;
    private JMenuItem miRojo, miNegro, miMorado, miNuevo, miSalir, miCalculo, miAcercaDe;
    private JLabel lblBienvenido, lblDatosTrabajador, lblImagen, lblNombreTrabajador, lblMaternoTrabajador, lblPaternoTrabajador, lbldepartamento, lblantiguedad, lblResultado, lblFooter;
    private JTextField txtNombreTrabajador, txtPaternoTrabajador, txtMaternoTrabajador;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JComboBox combodepartamento, comboantiguedad;
    private JButton btnCalcular;
    String nombre_usuario = "";

    public Principal() {
        setLayout(null);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombre_usuario = Bienvenida.userName;

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuBar.add(menuOpciones);


        menuCalcular = new JMenu("Calcular");
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuBar.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuBar.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de Fondo");
        menuOpciones.add(menuColorFondo);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.addActionListener(this);
        menuOpciones.add(miNuevo);

        miSalir = new JMenuItem("Salir");
        miSalir.addActionListener(this);
        menuOpciones.add(miSalir);

        miAcercaDe = new JMenuItem("Acerca de");
        miAcercaDe.addActionListener(this);
        menuAcercaDe.add(miAcercaDe);


        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.addActionListener(this);
        menuCalcular.add(miCalculo);

        miRojo = new JMenuItem("Rojo");
        miRojo.addActionListener(this);
        menuColorFondo.add(miRojo);

        miNegro = new JMenuItem("Negro");
        miNegro.addActionListener(this);
        menuColorFondo.add(miNegro);

        miMorado = new JMenuItem("Morado");
        miMorado.addActionListener(this);
        menuColorFondo.add(miMorado);

        ImageIcon imagen = new ImageIcon("../../resources/assets/grafica.jpg");
        lblImagen = new JLabel(imagen);
        lblImagen.setBounds(5, 5, 300, 300);
        add(lblImagen);

        lblBienvenido = new JLabel("Bienvenido " + nombre_usuario );
        lblBienvenido.setBounds(410, 25, 400, 100);
        lblBienvenido.setFont(new Font("Andale Mono", 3, 34));
        lblBienvenido.setForeground(Color.WHITE);
        add(lblBienvenido);

        lblDatosTrabajador = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        lblDatosTrabajador.setBounds(50, 80, 1000, 200);
        lblDatosTrabajador.setFont(new Font("Andale Mono", 3, 24));
        lblDatosTrabajador.setForeground(Color.WHITE);
        add(lblDatosTrabajador);

        lblNombreTrabajador = new JLabel("Nombre:");
        lblNombreTrabajador.setBounds(33, 220, 200, 30);
        lblNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
        lblNombreTrabajador.setForeground(Color.WHITE);
        add(lblNombreTrabajador);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(30, 250, 200, 40);
        txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtNombreTrabajador.setForeground(Color.black);
        add(txtNombreTrabajador);

        lblPaternoTrabajador = new JLabel("Apellido Paterno:");
        lblPaternoTrabajador.setBounds(33, 300, 200, 30);
        lblPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        lblPaternoTrabajador.setForeground(Color.WHITE);
        add(lblPaternoTrabajador);

        txtPaternoTrabajador = new JTextField();
        txtPaternoTrabajador.setBounds(30, 330, 200, 40);
        txtPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtPaternoTrabajador.setForeground(Color.black);
        add(txtPaternoTrabajador);

        lblMaternoTrabajador = new JLabel("Apellido Materno:");
        lblMaternoTrabajador.setBounds(33, 380, 200, 30);
        lblMaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        lblMaternoTrabajador.setForeground(Color.WHITE);
        add(lblMaternoTrabajador);

        txtMaternoTrabajador = new JTextField();
        txtMaternoTrabajador.setBounds(30, 410, 200, 40);
        txtMaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtMaternoTrabajador.setForeground(Color.black);
        add(txtMaternoTrabajador);

        lbldepartamento = new JLabel("Selecciona el departamento:");
        lbldepartamento.setBounds(290, 220, 300, 30);
        lbldepartamento.setFont(new Font("Andale Mono", 1, 14));
        lbldepartamento.setForeground(Color.WHITE);
        add(lbldepartamento);

        combodepartamento = new JComboBox();
        combodepartamento.setBounds(290, 250, 300, 40);
        combodepartamento.setFont(new Font("Andale Mono", 1, 14));
        add(combodepartamento);
        combodepartamento.addItem("");
        combodepartamento.addItem("Atención al Cliente");
        combodepartamento.addItem("Departamento de Logistica");
        combodepartamento.addItem("Departamento de Gerencia");

        lblantiguedad = new JLabel("Selecciona tu antiguedad:");
        lblantiguedad.setBounds(290, 300, 300, 30);
        lblantiguedad.setFont(new Font("Andale Mono", 1, 14));
        lblantiguedad.setForeground(Color.WHITE);
        add(lblantiguedad);

        comboantiguedad = new JComboBox();
        comboantiguedad.setBounds(290, 330, 300, 40);
        comboantiguedad.setFont(new Font("Andale Mono", 1, 14));
        add(comboantiguedad);
        comboantiguedad.addItem("");
        comboantiguedad.addItem("1 año de servicio");
        comboantiguedad.addItem("2 a 6 años de servicio");
        comboantiguedad.addItem("7 años o más de servicio");

        lblResultado = new JLabel("Resultado del cálculo:");
        lblResultado.setBounds(290, 380, 300, 30);
        lblResultado.setFont(new Font("Andale Mono", 1, 14));
        lblResultado.setForeground(Color.WHITE);
        add(lblResultado);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Andale Mono", 1, 12));
        textArea.setText("\n    Aquí aparece el resultado del cálculo de las vacaciones.");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(290, 410, 550, 90);
        add(scrollPane);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setFont(new Font("Andale Mono", 1, 14));
        btnCalcular.setForeground(Color.BLACK);
        btnCalcular.setBackground(Color.WHITE);
        btnCalcular.setBounds(290, 520, 100, 30);
        btnCalcular.addActionListener(this);
        add(btnCalcular);

        lblFooter = new JLabel("Todos los derechos reservados al desarrollador Agustin Tamagnone 2025.");
        lblFooter.setBounds(200, 600, 500, 30);
        lblFooter.setFont(new Font("Andale Mono", 1, 14));
        lblFooter.setForeground(Color.WHITE);
        add(lblFooter);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == miCalculo || e.getSource() == btnCalcular) {
            String nombreTrabajador = txtNombreTrabajador.getText();
            String AP = txtPaternoTrabajador.getText();
            String AM = txtMaternoTrabajador.getText();
            String departamento = combodepartamento.getSelectedItem().toString();
            String antiguedad = comboantiguedad.getSelectedItem().toString();

            if (nombreTrabajador.equals("") || AP.equals("") || AM.equals("") || departamento.equals("") || antiguedad.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor rellena todos los campos con la información requerida.");
            } else {

                if(departamento.equals("Atencion al Cliente")){

                    if(antiguedad.equals("1 año de servicio")){
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + departamento + " con " + antiguedad +
                                "\n   recibe 6 dias de vacaciones.");
                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + departamento + " con " + antiguedad +
                                "\n   recibe 14 dias de vacaciones.");
                    }
                    if(antiguedad.equals("7 años o más de servicio")){
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + departamento + " con " + antiguedad +
                                "\n   recibe 20 dias de vacaciones.");
                    }

                }
                if(departamento.equals("Departamento de Logistica")){

                    if(antiguedad.equals("1 año de servicio")){
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + departamento + " con " + antiguedad +
                                "\n   recibe 7 dias de vacaciones.");
                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + departamento + " con " + antiguedad +
                                "\n   recibe 15 dias de vacaciones.");
                    }
                    if(antiguedad.equals("7 años o más de servicio")){
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + departamento + " con " + antiguedad +
                                "\n   recibe 22 dias de vacaciones.");
                    }
                }
                if(departamento.equals("Departamento de Gerencia")){

                    if(antiguedad.equals("1 año de servicio")){
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + departamento + " con " + antiguedad +
                                "\n   recibe 10 dias de vacaciones.");
                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + departamento + " con " + antiguedad +
                                "\n   recibe 20 dias de vacaciones.");
                    }
                    if(antiguedad.equals("7 años o más de servicio")){
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + departamento + " con " + antiguedad +
                                "\n   recibe 30 dias de vacaciones.");
                    }
                }
            }
        } else if (e.getSource() == miRojo) {
            getContentPane().setBackground(new Color(255, 0, 0));

        } else if (e.getSource() == miNegro) {
            getContentPane().setBackground(Color.black);

        } else if (e.getSource() == miMorado) {
            getContentPane().setBackground(new Color(51, 0, 51));

        } else if (e.getSource() == miNuevo) {
            txtNombreTrabajador.setText("");
            txtPaternoTrabajador.setText("");
            txtMaternoTrabajador.setText("");
            comboantiguedad.setSelectedIndex(0);
            combodepartamento.setSelectedIndex(0);
            textArea.setText("\n    Aquí aparece el resultado del cálculo de las vacaciones.");

        } else if (e.getSource() == miSalir) {
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setBounds(0, 0, 350, 450);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);

        } else if (e.getSource() == miAcercaDe) {
            JOptionPane.showMessageDialog(null,"Producto desarrollado por Agustin Tamagnone 2025. www.agustintamagnone.com");
        }
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setBounds(0, 0, 900, 700);
        principal.setLocationRelativeTo(null);
        principal.setResizable(false);
    }
}
