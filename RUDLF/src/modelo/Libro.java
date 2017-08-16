/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jeron
 */
public class Libro {

    private Long id;
    private String titulo;
    private String tituloOrig;
    private String autor;
    private int año;
    private String origen;
    private String genero;
    private String tema;
    private String VM;
    private String calificacion;
    private String comentario;
    private int ISBN;
    private String editorial;
    private int numero;
    private String lugarE;
    private int añoDEdicion;
    private String traduccion;
    private String ubicacion;
    private String propietario;

    public Libro() {
    }

    public Libro(Long id, String titulo, String tituloOrig, String autor, int año, String origen, String genero, String tema, String VM, String calificacion, String comentario, int ISBN, String editorial, int numero, int añoDEdicion, String lugarE, String traduccion, String ubicacion, String propietario) {
        this.id = id;
        this.titulo = titulo;
        this.tituloOrig = tituloOrig;
        this.autor = autor;
        this.año = año;
        this.origen = origen;
        this.genero = genero;
        this.tema = tema;
        this.VM = VM;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.numero = numero;
        this.añoDEdicion = añoDEdicion;
        this.lugarE = lugarE;
        this.traduccion = traduccion;
        this.ubicacion = ubicacion;
        this.propietario = propietario;
    }

    public String getLugarE() {
        return lugarE;
    }

    public void setLugarE(String lugarE) {
        this.lugarE = lugarE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloOrig() {
        return tituloOrig;
    }

    public void setTituloOrig(String tituloOrig) {
        this.tituloOrig = tituloOrig;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getVM() {
        return VM;
    }

    public void setVM(String VM) {
        this.VM = VM;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAñoDEdicion() {
        return añoDEdicion;
    }

    public void setAñoDEdicion(int añoDEdicion) {
        this.añoDEdicion = añoDEdicion;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}
