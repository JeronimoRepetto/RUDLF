/*
SQLyog Ultimate v9.63 
MySQL - 5.5.5-10.1.21-MariaDB : Database - rulf
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rulf` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `rulf`;

/*Table structure for table `libro` */

DROP TABLE IF EXISTS `libro`;

CREATE TABLE `libro` (
  `id-lib` bigint(100) NOT NULL AUTO_INCREMENT,
  `Titulo` varchar(45) DEFAULT NULL,
  `Titulo Original` varchar(45) DEFAULT NULL,
  `Autor` varchar(45) DEFAULT NULL,
  `Año` int(4) DEFAULT NULL,
  `Origen` varchar(45) DEFAULT NULL,
  `Genero` varchar(45) DEFAULT NULL,
  `Tema` varchar(45) DEFAULT NULL,
  `V.M.` varchar(4) DEFAULT NULL,
  `Calificación` varchar(45) DEFAULT NULL,
  `Comentario` varchar(350) DEFAULT NULL,
  `ISBN` int(100) DEFAULT NULL,
  `Editorial` varchar(45) DEFAULT NULL,
  `Numero` int(3) DEFAULT NULL,
  `Año de Edición` int(4) DEFAULT NULL,
  `Lugar de Edición` varchar(45) DEFAULT NULL,
  `Traduccion` varchar(45) DEFAULT NULL,
  `Ubicacion` varchar(45) DEFAULT NULL,
  `Propietario` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id-lib`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `libro` */

/*Table structure for table `usuarios` */

DROP TABLE IF EXISTS `usuarios`;

CREATE TABLE `usuarios` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(45) DEFAULT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Tel` varchar(20) DEFAULT NULL,
  `Domicilio` varchar(45) DEFAULT NULL,
  `Contraseña` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

/*Data for the table `usuarios` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
