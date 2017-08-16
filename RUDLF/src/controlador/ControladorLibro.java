/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.BDSentencias;
import modelo.Libro;

/**
 *
 * @author jeron
 */
public class ControladorLibro implements BDSentencias {

    //SE DECLARA Y SE INICIALIZA EL OBJETO LIBRO
    private Libro refL = new Libro();
    private ControladorGeneral ConG = new ControladorGeneral();

    //GETERS AND SETERS
    public Libro getRefL() {
        return refL;
    }

    public void setRefL(Libro refL) {
        this.refL = refL;
    }

    //METODO PARA CARGAR LIBROS
    public void CargarLibro(boolean bandera, Long id, String titulo, String tituloOrig, String autor, int año, String origen, String genero, String tema, String VM, String calificacion,
            String comentario, int ISBN, String editorial, int numero, int añoDEdicion, String lugarE, String traduccion, String ubicacion, String propietario) {
        boolean Nuevo = bandera;
        Libro newL = new Libro(id, titulo, tituloOrig, autor, año, origen, genero, tema, VM,
                calificacion, comentario, ISBN, editorial, numero, añoDEdicion, lugarE, traduccion, ubicacion, propietario);
        newL.setId(id);
        newL.setTema(tema);
        newL.setTituloOrig(tituloOrig);
        newL.setAutor(autor);
        newL.setAño(año);
        newL.setOrigen(origen);
        newL.setGenero(genero);
        newL.setTema(tema);
        newL.setVM(VM);
        newL.setCalificacion(calificacion);
        newL.setComentario(comentario);
        newL.setISBN(ISBN);
        newL.setEditorial(editorial);
        newL.setNumero(numero);
        newL.setAñoDEdicion(añoDEdicion);
        newL.setLugarE(lugarE);
        newL.setTraduccion(traduccion);
        newL.setUbicacion(ubicacion);
        newL.setPropietario(propietario);

        //SE CARGAN LAS VARIABLES A UN ARRAY DE STRINGS
        if (Nuevo == true) {//SI SE ENVIA VERDADERO SE GUARDA UN NUEVO LIBRO
            String[] dato1 = {newL.getTitulo(), newL.getTituloOrig(), newL.getAutor(), String.valueOf(newL.getAño()), newL.getOrigen(),
                newL.getGenero(), newL.getTema(), newL.getVM(), newL.getCalificacion(), newL.getComentario(), String.valueOf(newL.getISBN()), newL.getEditorial(), String.valueOf(newL.getNumero()), String.valueOf(newL.getAñoDEdicion()),
                newL.getLugarE(), newL.getTraduccion(), newL.getUbicacion(), newL.getPropietario()};
            ConG.ejecutarSentencia(dato1, cargarL);
        } else {//SI SE ENVIA FALSO MODIFICA UN LIBRO
            String[] dato1 = {newL.getTitulo(), newL.getTituloOrig(), newL.getAutor(), String.valueOf(newL.getAño()), newL.getOrigen(),
                newL.getGenero(), newL.getTema(), newL.getVM(), newL.getCalificacion(), newL.getComentario(), String.valueOf(newL.getISBN()), newL.getEditorial(), String.valueOf(newL.getNumero()), String.valueOf(newL.getAñoDEdicion()),
                newL.getLugarE(), newL.getTraduccion(), newL.getUbicacion(), newL.getPropietario(), String.valueOf(newL.getId())};
            ConG.ejecutarSentencia(dato1, modificarL);

        }

    }
}
