/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.BDSentencias;
import modelo.Usuario;

/**
 *
 * @author jeron
 */
public class ControladorUsuario implements BDSentencias {

    //SE CREAN Y SE INICIALIZAN LOS OBJETOS Y SE INICIALIZA EL CONTROLADOR NECESARIO
    private Usuario refU = new Usuario();
    private Usuario refUsuario;
    private ControladorGeneral cg = new ControladorGeneral();

    //GETERS AND SETERS
    public Usuario getRefU() {
        return refU;
    }

    public void setRefU(Usuario refU) {
        this.refU = refU;
    }

    //METODO PARA CARGAR USUARIO
    public void CargarUsuario(Long id, String usuario, String nombre,
            String apellido, String tel, String domicilio, String contraseña) {

        Usuario nuevoU = new Usuario(id, usuario, nombre, apellido, tel, domicilio, contraseña);
        nuevoU.setId(id);
        nuevoU.setUsuario(usuario);
        nuevoU.setNombre(nombre);
        nuevoU.setApellido(apellido);
        nuevoU.setTelefono(tel);
        nuevoU.setDomicilio(domicilio);
        nuevoU.setContraseña(contraseña);
        //SE CARGAN LOS DATOS A UN ARRAY LIST PARA ENVIAR AL METODO
        String[] datos = {nuevoU.getUsuario(), nuevoU.getNombre(), nuevoU.getApellido(), nuevoU.getTelefono(), nuevoU.getDomicilio(), nuevoU.getContraseña()};
        //SE LLAMA AL METODO PARA CARGAR USUARIO
        cg.ejecutarSentencia(datos, cargarU);
    }

    //METODO PARA MODIFICAR USUARIO
    public void ModificarUsuario(Long id, String usuario, String nombre,
            String apellido, String tel, String domicilio, String contraseña) {

        Usuario nuevoU = new Usuario(id, usuario, nombre, apellido, tel, domicilio, contraseña);
        nuevoU.setId(id);
        nuevoU.setUsuario(usuario);
        nuevoU.setNombre(nombre);
        nuevoU.setApellido(apellido);
        nuevoU.setTelefono(tel);
        nuevoU.setDomicilio(domicilio);
        nuevoU.setContraseña(contraseña);
        //SE CARGAN LOS DATOS A UN ARRAY LIST PARA ENVIAR AL METODO
        String[] datos = {nuevoU.getUsuario(), nuevoU.getNombre(), nuevoU.getApellido(), nuevoU.getTelefono(), nuevoU.getDomicilio(), nuevoU.getContraseña(), String.valueOf(nuevoU.getId())};
        //SE LLAMA AL METODO PARA MODIFICAR USUARIO
        cg.ejecutarSentencia(datos, modificarUsu);
    }

    //METODO PARA TOMAR LOS DATOS DEL LA PANTALLA INGRESO
    public void IngresoManual(String usuario, String contraseña) {
        refUsuario = new Usuario();
        refUsuario.setUsuario(usuario);
        refUsuario.setContraseña(contraseña);
    }

    //SE CREA UN OBJETO USUARIO PARA LA MUESTRA
    public boolean Comparacion1() {
        boolean resultado = false;

        cg = new ControladorGeneral();
        String[] usuarioRef = {refUsuario.getUsuario(), refUsuario.getContraseña()};
        //SE LLAMA AL METODO QUE COMPARA EL USUARIO Y LA CONTRASEÑA
        resultado = cg.ComparacionUC(usuarioRef);

        return resultado;
    }

}
