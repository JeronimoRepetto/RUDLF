/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.BDSentencias;
import conexion.ConexionBD;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.AyMLibro;
import vista.AyMUsuario;
import vista.Ingreso;
import vista.MLib;
import vista.fondos.PanelLibro;

/**
 *
 * @author jeron
 */
public class ControladorVistaAyML implements BDSentencias {

    //VARIABLES NECESARIOAS
    private Connection conect;
    private ConexionBD bd;

    //CONSTRUCTOR
    public ControladorVistaAyML() {
        bd = new ConexionBD();
        conect = bd.estableceConexion();
    }

    //METODO QUE LLAMA A LA VISTA INGRESO
    public void Start(Ingreso pantalla, boolean bandera, Long id, Long idU) {

        AyMLibro ventana = new AyMLibro(pantalla, bandera, id, idU);
        PanelLibro fondo = new PanelLibro();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);

    }

    //METODO QUE LLAMA A LA VISTA MOSTRAR LIBRO
    public void Start(MLib pantalla, boolean bandera, Long id, Long idU) {

        AyMLibro ventana = new AyMLibro(pantalla, bandera, id, idU);
        PanelLibro fondo = new PanelLibro();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);

    }

    //METODO PARA CARGAR NOMBRES Y APELLIDOS A LOS BOX DE PROPIETARIO Y UBICACION
    public ArrayList<String> CargarPropYUbic(String nroConsulta) {
        ResultSet res = null;
        int i = 0;
        ArrayList<String> datosN = new ArrayList<>();
        ArrayList<String> datosA = new ArrayList<>();
        ArrayList<String> datosTotal = new ArrayList<>();
        try {
            PreparedStatement ps = conect.prepareStatement(nroConsulta);
            res = ps.executeQuery();
            datosTotal.add(0, "Nuevo");
            while (res.next()) {
                i++;
                String auxN;
                String auxA;
                datosN.add(res.getString("Nombre"));
                datosA.add(res.getString("Apellido"));
                auxN = datosN.get(i - 1);
                auxA = datosA.get(i - 1);
                datosTotal.add(i, auxN + " " + auxA);
            }
            return datosTotal;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo crar la tabla", "ERROR DESCONOCIDO", 2);

        }
        return datosTotal;
    }

    //SE REVISA SI SI LOS DATOS DE INT ESTAN COMPLETOS DE NO ESTARLO SE CARGAN
    public void revicionDatos(String numero, String isbn, String año, String añoE) {
        if (numero.equals("")) {
            JOptionPane.showMessageDialog(null, "El numero de Edicion no puede quedar vacio\n De no tener el numero o no saberlo coloque 0 (CERO)", "ERROR", 2);
            
        }
        if (isbn.equals("")) {
            JOptionPane.showMessageDialog(null, "El ISBN no puede quedar vacio\n De no tener el numero o no saberlo coloque 0 (CERO)", "ERROR", 2);

        }

        if (año.equals("")) {
            JOptionPane.showMessageDialog(null, "El año de la obra no puede quedar vacio\n De no tener el año o no saberlo coloque 0 (CERO)", "ERROR", 2);

        }

        if (añoE.equals("")) {

            JOptionPane.showMessageDialog(null, "El año de edicion no puede quedar vacio\n De no tener el año o no saberlo coloque 0 (CERO)", "ERROR", 2);
        }

    }

}
