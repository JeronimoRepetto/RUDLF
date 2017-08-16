/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.BorderLayout;
import vista.AyMUsuario;
import vista.Ingreso;
import vista.MLib;
import vista.MUsu;
import vista.fondos.PanelLibro;

/**
 *
 * @author jeron
 */
public class ControladorVistaMUsu {

    //METODO PARA ABRIR MOSTRAR USUARIO DESDE AGREGAR Y MODIFICAR USUARIO    
    public void Start(AyMUsuario pantalla, boolean bandera, Long id, Long idU) {

        MUsu ventana = new MUsu(pantalla, bandera, id, idU);
        PanelLibro fondo = new PanelLibro();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);

    }

    //METODO PARA ABRUR MOSTRAR USUARIO DESDE MOSTRA LIBRO
    public void Start(MLib pantalla, boolean bandera, Long id, Long idU) {

        MUsu ventana = new MUsu(pantalla, bandera, id, idU);
        PanelLibro fondo = new PanelLibro();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);

    }

    //METODO PARA ABRIR MOSTRAR USUARIO DESDE INGRESO
    public void Start(Ingreso pantalla, boolean bandera, Long id, Long idU) {

        MUsu ventana = new MUsu(pantalla, bandera, id, idU);
        PanelLibro fondo = new PanelLibro();
        ventana.add(fondo, BorderLayout.CENTER);
        fondo.repaint();
        ventana.setVisible(true);
    }

}
