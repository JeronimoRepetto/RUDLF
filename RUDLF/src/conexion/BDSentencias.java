/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author jeron
 */
public interface BDSentencias {
    
    //STENTENCIAS USUARIO:
    //Carga Usuario
public static final String cargarU = "INSERT INTO `rulf`.`usuarios`(`id`,`Usuario`,`Nombre`,`Apellido`,`Tel`,`Domicilio`,`Contraseña`) VALUES ( NULL,?,?,?,?,?,?)";
    //Elimina Usuario
public static final String eliminarU = "DELETE FROM `rulf`.`usuarios` WHERE `id`=?";
    //Modificar Usuario(TODO)
public static final String modificarUsu = "UPDATE `rulf`.`usuarios` SET `Usuario`= ?,`Nombre`= ?,`Apellido`= ?,`Tel`= ?,`Domicilio`= ?,`Contraseña`= ? WHERE `id`= ?";
    //Modificar Contraseña Usuario
public static final String modificarCon = "UPDATE `rulf`.`usuarios` SET `Contraseña`= ? WHERE `Usuario`= ?";
    //Muestra usuarios
public static final String mostrarU = "SELECT * FROM `rulf`.`usuarios`";
    //Muestra usuarios x id
public static final String mostrarUXId = "SELECT * FROM `rulf`.`usuarios`WHERE `id`= ?";
    //Sentencia usada para comparar usuario
public static final String comparar = "SELECT * FROM `rulf`.`usuarios` WHERE `Usuario`= ? AND `Contraseña`= ?";
 //Sentencia usada para comparar contraseña
public static final String buscarU = "SELECT * FROM `rulf`.`usuarios` where `Usuario` like ?";
    //Sentencia usada para comparar contraseña
public static final String compararU = "SELECT * FROM `rulf`.`usuarios` WHERE `Usuario`= ?";
    //Se envia el id del usuario enviado
public static final String IDUs = "SELECT `id` FROM `rulf`.`usuarios` WHERE `Usuario`= ?";
    //Se envia el id del Nombre enviado
public static final String IDNs = "SELECT `id` FROM `rulf`.`usuarios` WHERE `Nombre`= ?";

//SENTENCIAS LIBRO:
    //Carga Libro
public static final String cargarL = "INSERT INTO `rulf`.`libro`(`id-lib`,`Titulo`,`Titulo Original`,`Autor`,`Año`,`Origen`,`Genero`,`Tema`,`V.M.`,`Calificación`,`Comentario`,`ISBN`,`Editorial`,`Numero`,`Año de Edición`,`Lugar de Edición`,`Traduccion`,`Ubicacion`,`Propietario`) VALUES ( NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    //Elimina Libro
public static final String eliminarL = "DELETE FROM `rulf`.`libro` WHERE `id-lib`=?";
    //Modifica Libro
public static final String modificarL = "UPDATE `rulf`.`libro` SET `Titulo`= ?,`Titulo Original`= ?,`Autor`= ?,`Año`= ?,`Origen`= ?,`Genero`= ?,`Tema`= ?,`V.M.`= ?,`Calificación`= ?,`Comentario`= ?,`ISBN`= ?,`Editorial`= ?,`Numero`= ?,`Año de Edición`= ?,`Lugar de Edición`= ?,`Traduccion`= ?,`Ubicacion`= ?,`Propietario`= ? WHERE `id-lib`= ?";
    //Muestra Libros
public static final String mostrarL = "SELECT * FROM `rulf`.`libro`";
    //Muestra x id
public static final String mostrarXId = "SELECT * FROM `rulf`.`libro`where `id-lib` = ?";
    //Muestra Libro x Titulo
public static final String Titulo = "SELECT * FROM `rulf`.`libro` where `Titulo` like ?";
    //Muestra Libro x genero
public static final String Genero = "SELECT * FROM `rulf`.`libro` where `Genero` like ?";
    //Muestra Libro x año
public static final String Año = "SELECT * FROM `rulf`.`libro` where `Año` like ?";
    //Muestra Libro x calificacion
public static final String Calificacion = "SELECT * FROM `rulf`.`libro` where `Calificación` like ?";
    //Muestra Libro x VM
public static final String VM = "SELECT * FROM `rulf`.`libro` where `V.M.` like ?";
    //Muestra Libro x autor
public static final String Autor = "SELECT * FROM `rulf`.`libro` where `Autor` like ?";
    //Muestra Libro x editorial
public static final String Editorial = "SELECT * FROM `rulf`.`libro` where `Editorial` like ?";
    //Muestra Libro x ubicacion
public static final String Ubicacion = "SELECT * FROM `rulf`.`libro` where `Ubicacion` like ?";
    //Muestra Libro x propietario
public static final String Propietario= "SELECT * FROM `rulf`.`libro` where `Propietario` like ?";
    
}
