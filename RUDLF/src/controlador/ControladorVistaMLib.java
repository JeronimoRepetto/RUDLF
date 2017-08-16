/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.BorderLayout;
import vista.Ingreso;
import vista.MLib;
import vista.MUsu;
import vista.fondos.PanelLibro;

/**
 *
 * @author jeron
 */
public class ControladorVistaMLib {

    //METODO QUE ABRE LA PANTALLA MLib Desde Ingreso
    public void Start(Ingreso pantalla, boolean bandera, Long id, Long idU) {
        MLib ventana = new MLib(pantalla, bandera, id, idU);
        PanelLibro fondo = new PanelLibro();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);

    }

    //METODO PARA SEPARAR NOMBRE DE APELLIDO
    public String[] SepararNombreDeApellido(String nombreapellido) {

        String[] nombreapellido2 = nombreapellido.split(" ");
        String[] dato = new String[1];
        dato[0] = nombreapellido2[0];

        return dato;
    }

}
