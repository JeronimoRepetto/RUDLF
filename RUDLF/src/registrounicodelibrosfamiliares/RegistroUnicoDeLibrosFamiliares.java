/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrounicodelibrosfamiliares;

import controlador.ControladorVistaPrincipal;
import java.io.IOException;

/**
 *
 * @author jeron
 */
public class RegistroUnicoDeLibrosFamiliares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //SE ABRE EL CMD PARA EJECUTRAR EL XAMPP
        Process proceso = Runtime.getRuntime().exec("cmd /c start C:/xampp/mysql/bin/mysqld.exe");
        //SE CREA E INICIALIZA EL CONTROLADOR DE PANTALLA PRINCIPAL 
        ControladorVistaPrincipal Start = new ControladorVistaPrincipal();
        //SE LLAMA AL METODO QUE ABRE LA PANTALLA PRINCIPAL
        Start.Start();

    }

}
