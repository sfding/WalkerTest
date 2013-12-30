CREATE DATABASE  IF NOT EXISTS `walkerdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `walkerdb`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: walkerdb
-- ------------------------------------------------------
-- Server version	5.6.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_ads`
--

DROP TABLE IF EXISTS `tbl_ads`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_ads` (
  `ads_primarykey` int(11) NOT NULL AUTO_INCREMENT,
  `ads_index` int(11) NOT NULL,
  `ads_typeid` int(11) NOT NULL,
  `ads_imgpath` varchar(100) DEFAULT NULL,
  `ads_url` varchar(100) DEFAULT NULL,
  `ads_time` int(11) NOT NULL,
  PRIMARY KEY (`ads_primarykey`),
  UNIQUE KEY `ads_index_UNIQUE` (`ads_index`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ads`
--

LOCK TABLES `tbl_ads` WRITE;
/*!40000 ALTER TABLE `tbl_ads` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_ads` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_forms`
--

DROP TABLE IF EXISTS `tbl_forms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_forms` (
  `forms_primarykey` int(11) NOT NULL AUTO_INCREMENT,
  `forms_index` int(11) NOT NULL,
  `forms_typeid` int(11) NOT NULL,
  `forms_name` varchar(100) DEFAULT NULL,
  `forms_url` varchar(100) DEFAULT NULL,
  `forms_time` int(11) NOT NULL,
  PRIMARY KEY (`forms_primarykey`),
  UNIQUE KEY `forms_index_UNIQUE` (`forms_index`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_forms`
--

LOCK TABLES `tbl_forms` WRITE;
/*!40000 ALTER TABLE `tbl_forms` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_forms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_news`
--

DROP TABLE IF EXISTS `tbl_news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_news` (
  `news_primarykey` int(11) NOT NULL AUTO_INCREMENT,
  `news_index` int(11) NOT NULL,
  `news_context` varchar(500) DEFAULT NULL,
  `news_url` varchar(100) DEFAULT NULL,
  `news_time` int(11) NOT NULL,
  PRIMARY KEY (`news_primarykey`),
  UNIQUE KEY `news_index_UNIQUE` (`news_index`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_news`
--

LOCK TABLES `tbl_news` WRITE;
/*!40000 ALTER TABLE `tbl_news` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_news` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-12-24 15:36:14
