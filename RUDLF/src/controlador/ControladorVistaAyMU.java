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
import javax.swing.JOptionPane;
import vista.AyMLibro;
import vista.AyMUsuario;
import vista.MUsu;
import vista.fondos.PanelLibro;

/**
 *
 * @author jeron
 */
public class ControladorVistaAyMU implements BDSentencias {

    //SE DECLARAN VARIABLES NECESARIAS
    private boolean marca;
    private Connection conexion;
    private ConexionBD bd;

    //METODO PARA ABRIR LA VISTA AGREGAR Y MODIFICAR USUARIO
    public void Start() {

        AyMUsuario ventana = new AyMUsuario();
        PanelLibro fondo = new PanelLibro();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);

    }

    //METODO PARA ABRIR LA VISTA AGREGAR Y MODIFICAR LIBRO
    public void Start(AyMLibro pantalla, boolean bandera, Long id, Long idU) {
        AyMUsuario ventana = new AyMUsuario(pantalla, bandera, id, idU);
        PanelLibro fondo = new PanelLibro();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);

    }

    //METODO PARA ABRIR LA VISTA A MOSTRAR USUARIO
    public void Start(MUsu pantalla, boolean bandera, Long id, Long idU) {

        AyMUsuario ventana = new AyMUsuario(pantalla, bandera, id, idU);
        PanelLibro fondo = new PanelLibro();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);

    }

    //METODO PARA VERIFICAR SI SE COMPLETO EL NOMBRE Y EL APELLIDO AL CARGAR O MODIFICAR UN USUARIO
    public boolean SeCompletoNombreYApellido(String nombre, String apellido) {

        if ((nombre.equals("")) || (apellido.equals(""))) {

            JOptionPane.showMessageDialog(null, "NOMBRE Y APELLIDO NO PUEDEN QUEDAR INCOMPLETOS", "ERROR", 0);
            marca = false;
            return marca;

        }
        marca = true;
        return marca;
    }

    //METODO UTILIZADO PARA QUE NO SE ASIGNE UN USUARIO CON NOMBRE ADMIN
    public boolean NombreReservado(String usuario) {

        if ((usuario.equals("Admin")) || (usuario.equals("admin"))) {
            JOptionPane.showMessageDialog(null, "Nombre de Usuario reservado, Coloque Otro", "ERROR", 0);
            marca = false;
            return marca;
        }
        marca = true;
        return marca;

    }

    //METODO UTILIZADP PARA COMPARAR SI LA CONTRASEÑA COLOCADA CORRESPONDE A LA CONFIRMACION
    public boolean ComparacionContraseñas(String contraseña, String comparacion) {
        if (contraseña.equals("")) {
            JOptionPane.showMessageDialog(null, "LA CONTRASEÑA NO PUEDE QUEDAR INCOMPLETA", "ERROR", 0);
            marca = false;
            return marca;
        } else {
            if (contraseña.equals(comparacion)) {
                marca = true;
                return marca;
            } else {
                JOptionPane.showMessageDialog(null, "LAS CONTRASEÑAS NO COINSIDEN O NO HA CONFIRMADO LA CONTRASEÑA", "ERROR", 0);
                marca = false;
                return marca;
            }
        }
    }

    //METODO PARA INFORMAR AL USUARIO SI DESEA MODIFICAR LA CONTRASEÑA
    public int ModificacionContraseña(String contraseña, String contraseñaNue) {
        int respuesta = 2;
        if (contraseña.equals(contraseñaNue)) {
            marca = false;
            return respuesta;
        } else {
            String[] opciones = {"SI", "NO"};
            respuesta = JOptionPane.showOptionDialog(null, "¿Desea Cambiar la contraseña?", "Seleccione una Opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Opcion1");
            return respuesta;
        }

    }

    //METODO PARA REVISAR EL USUARIO
    public boolean ComparacionU(String[] datos) {
        bd = new ConexionBD();
        conexion = bd.estableceConexion();
        boolean respuesta = false;
        ResultSet res = null;
        if (datos[0].equals("")) {
            JOptionPane.showMessageDialog(null, "EL NOMBRE DE USUARIO NO PUEDE QUEDAR INCOMPLETO");
            return respuesta;
        } else {
            if (datos[0].contains(" ")) {
                JOptionPane.showMessageDialog(null, "EL NOMBRE DE USUARIO NO PUEDE CONTENER ESPACIOS");
                return respuesta;
            } else {
                try {
                    PreparedStatement ps = conexion.prepareStatement(compararU);

                    for (int i = 0; i < datos.length; i++) {
                        ps.setString(i + 1, datos[i]);
                    }

                    res = ps.executeQuery();

                    if (res.next()) {

                        JOptionPane.showMessageDialog(null, "Nombre de usuario existente", "ERROR", 0);
                        return respuesta;
                    }

                    respuesta = true;
                    return respuesta;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                respuesta = true;
                return respuesta;

            }
        }
    }
}
