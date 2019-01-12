/*
SQLyog Ultimate v11.5 (32 bit)
MySQL - 5.6.17 : Database - neostore
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`neostore` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `neostore`;

/*Table structure for table `article` */

DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `idArticle` int(10) NOT NULL AUTO_INCREMENT,
  `reference` varchar(10) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `fournisseur` varchar(20) NOT NULL,
  `marque` varchar(20) NOT NULL,
  `quantite` int(7) DEFAULT NULL,
  `prixAchat` int(10) NOT NULL,
  `prixVente` int(10) NOT NULL,
  PRIMARY KEY (`idArticle`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `article` */

insert  into `article`(`idArticle`,`reference`,`nom`,`fournisseur`,`marque`,`quantite`,`prixAchat`,`prixVente`) values (1,'zararob','robe','zara','zara',50,5000,6500),(2,'toyotavoi','voiture','camitoyota','toyota',5,2000000,2800000),(3,'toto','moto','nanfan','nanfan',6,300000,500000),(4,'AppleIph','Iphone 9','Apple','Apple',5,850000,950000),(5,'samsungtel','television','arno','samsung',10,155000,135000);

/*Table structure for table `fournisseur` */

DROP TABLE IF EXISTS `fournisseur`;

CREATE TABLE `fournisseur` (
  `idFournisseur` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) DEFAULT NULL,
  `raisonSociale` varchar(30) DEFAULT NULL,
  `adresse` varchar(30) NOT NULL,
  `categorie` varchar(30) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  PRIMARY KEY (`idFournisseur`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `fournisseur` */

insert  into `fournisseur`(`idFournisseur`,`nom`,`raisonSociale`,`adresse`,`categorie`,`telephone`) values (1,'youssouf','yema','yaounde','electronique','14785421'),(2,'ALIBABA','Xiaoping','Beijing, Chine','electronique','0145789652');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
