package com.ucreativa.ui;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    public FrontEnd(String pTitulo)
    {
        super(pTitulo);
    }

    public void build()
    {
        this.construccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void construccionPantalla()
    {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,200);
        super.setLayout(new GridLayout(5,2));
    }

    private void agregarComponente(Component pComponente)
    {
        super.getContentPane().add(pComponente);
    }

    private void crearComponentes()
    {
        //Labels.
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblCedula = new JLabel("Cédula");
        JLabel lblEdad = new JLabel("Edad");
        JLabel lblRiesgo = new JLabel("Riesgo");
        JLabel lblEsAmigo = new JLabel("Es Amigo?");
        JLabel lblRelacion = new JLabel("Relación");
        JLabel lblFacebook = new JLabel("Facebook");
        JLabel lblParentesco = new JLabel("Parentesco");
        JLabel lblMarca = new JLabel("Marca");

        //Campos de Texto
        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtEdad = new JTextField();
        JTextField txtRelacion = new JTextField();
        JTextField txtFacebook = new JTextField();
        JTextField txtParentesco = new JTextField();
        JTextField txtMarca = new JTextField();

        //Checkboxes.
        JCheckBox chkRiesgo = new JCheckBox();
        JCheckBox chkEsAmigo = new JCheckBox();

        chkEsAmigo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (chkEsAmigo.isSelected())
                {
                    lblParentesco.setVisible(false);
                    txtParentesco.setVisible(false);
                }
                else
                {
                    lblParentesco.setVisible(true);
                    txtParentesco.setVisible(true);
                }
            }
        });

        //Botones
        JButton btnGuardar = new JButton("Guardar");

        btnGuardar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService oService = new BitacoraService(new FileRepository());
                try {
                    oService.save(txtNombre.getText(),
                                  txtCedula.getText(),
                                  txtEdad.getText(),
                                  chkRiesgo.isSelected(),
                                  chkEsAmigo.isSelected(),
                                  txtRelacion.getText(),
                                  txtFacebook.getText(),
                                  txtParentesco.getText(),
                                  txtMarca.getText());
                } catch (ErrorEnEdadException errorEnEdadException) {
                    errorEnEdadException.printStackTrace();
                }

                txtNombre.setText("");
                txtCedula.setText("");
                txtEdad.setText("");
                txtRelacion.setText("");
                txtFacebook.setText("");
                txtParentesco.setText("");
                txtMarca.setText("");

                //Impresión del Reporte.
                String strReporte = String.join("\n", oService.get());
                JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), strReporte);
            }
        });

        //Agregar Componentes al Form.
        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblCedula);
        this.agregarComponente(txtCedula);
        this.agregarComponente(lblEdad);
        this.agregarComponente(txtEdad);
        this.agregarComponente(lblRiesgo);
        this.agregarComponente(chkRiesgo);
        this.agregarComponente(lblEsAmigo);
        this.agregarComponente(chkEsAmigo);
        this.agregarComponente(lblRelacion);
        this.agregarComponente(txtRelacion);
        this.agregarComponente(lblFacebook);
        this.agregarComponente(txtFacebook);
        this.agregarComponente(lblParentesco);
        this.agregarComponente(txtParentesco);
        this.agregarComponente(lblMarca);
        this.agregarComponente(txtMarca);
        this.agregarComponente(btnGuardar);
    }
}
