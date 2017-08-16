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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Ingreso;
import vista.fondos.PanelStart;

/**
 *
 * @author jeron
 */
public class ControladorVistaIngreso implements BDSentencias {

    //CONTROLADORES Y VARIABLES
    private ControladorGeneral ConG;
    private DefaultTableModel modelo;
    private Connection conect;
    private ConexionBD bd;

    //CONSTRUCTOR
    public ControladorVistaIngreso() {
        bd = new ConexionBD();
        conect = bd.estableceConexion();
        ConG = new ControladorGeneral();
        modelo = new DefaultTableModel();
    }

    //METODO PARA MOSTRAR LA VENTANA INGRESO ENVIANDO EL ID DEL USUARIO CON EL CUAL SE INGRESO
    public void Start(Long id) {

        Ingreso ventana = new Ingreso(id);
        PanelStart fondo = new PanelStart();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);

    }

    //METODO PARA CREAR LA TABLA
    public DefaultTableModel mostrar(String Consulta) {
        try {
            PreparedStatement ps = conect.prepareStatement(Consulta);
            ResultSet res = ps.executeQuery();
            ControladorTabla.configuraColumnas(res, modelo);
            ControladorTabla.rellena(res, modelo);
            return modelo;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo crar la tabla", "ERROR DESCONOCIDO", 2);
            return modelo;
        }
    }

    //METODO PARA CREAR LA TABLA
    public DefaultTableModel mostrar(String nroConsulta, String[] arregloCampos) {
        ResultSet rs = null;
        try {

            rs = ConG.buscarCriterio(arregloCampos, nroConsulta);
            ControladorTabla.configuraColumnas(rs, modelo);
            ControladorTabla.rellena(rs, modelo);
            return modelo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelo;
    }

}
