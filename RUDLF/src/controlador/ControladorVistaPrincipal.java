/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.BorderLayout;
import vista.PrimeraPantalla;
import vista.fondos.PanelStart;

/**
 *
 * @author jeron
 */
public class ControladorVistaPrincipal {

    //METODO PARA ABRIR LA PRIMERA PANTALLA
    public void Start() {

        PrimeraPantalla ventana = new PrimeraPantalla();
        PanelStart fondo = new PanelStart();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);

    }

}
