/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.BDSentencias;
import static conexion.BDSentencias.comparar;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jeron
 */
public class ControladorGeneral implements BDSentencias {

    //DECLARACION DE VARIABLES QUE SE UTILIZARAN EN LOS METODOS
    private Connection conexion;
    private ConexionBD bd;

    // CONSTRUCTOR
    public ControladorGeneral() {
        //SE GENERA UNA NUEVA CONEXION
        bd = new ConexionBD();
        conexion = bd.estableceConexion();
    }

    //METODO QUE EJECUTA LAS DIFERENTES SENTENCIAS DE LA BASE DE DATOS 
    public void ejecutarSentencia(String arregloDatosCampos[], String Consulta) {
        try {
            PreparedStatement ps = conexion.prepareStatement(Consulta);

            for (int i = 0; i < arregloDatosCampos.length; i++) {
                ps.setObject(i + 1, arregloDatosCampos[i]);
            }

            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR ALGUN DATO EN EL QUE SE ESPERABA COMO ENTERO\n FUE UN CARACTER  ");
            e.printStackTrace();
        }
    }

    //METODO QUE EJECUTA LAS DIFERENTES SENTENCIAS DE BUSQUEDA DE LA BASE DE DATOS
    public ResultSet buscarCriterio(String arregloDatosCampos[], String Consulta) {
        ResultSet res = null;
        try {
            PreparedStatement ps = conexion.prepareStatement(Consulta);

            for (int i = 0; i < arregloDatosCampos.length; i++) {
                ps.setString(i + 1, arregloDatosCampos[i] + "%");
            }
            res = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    //METODO PARA CORROBORAR QUE EL USUARIO Y CONTRASEÑA SE ENCUENTRE EN LA BASE DE DATOS
    public boolean ComparacionUC(String datos[]) {

        ResultSet res = null;
        boolean respuesta = false;
        try {
            PreparedStatement ps = conexion.prepareStatement(comparar);

            for (int i = 0; i < datos.length; i++) {
                ps.setString(i + 1, datos[i]);
            }

            res = ps.executeQuery();

            if (res.next()) {

                respuesta = true;
                return respuesta;
            }

            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrecta", "ERROR", 2);

            return respuesta;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return respuesta;

    }

    //METODO UTILIZADO PARA PASAR LOS DATOS DE UN LIBRO O USUARIO A UNA PANTALLA
    public String[] mostrarFormulario(String nroConsulta, String[] arregloCampos) {
        ResultSet rs = null;
        String[] resultado = null;
        try {
            PreparedStatement ps = conexion.prepareStatement(nroConsulta);

            for (int i = 0; i < arregloCampos.length; i++) {
                ps.setString(i + 1, arregloCampos[i]);
            }
            rs = ps.executeQuery();
            resultado = new String[rs.getMetaData().getColumnCount()];

            while (rs.next()) {

                for (int i = 0; i < resultado.length; i++) {
                    resultado[i] = rs.getObject(i + 1).toString();

                }
            }
            return resultado;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
