-- MySQL dump 10.13  Distrib 5.5.36, for Win32 (x86)
--
-- Host: localhost    Database: ks
-- ------------------------------------------------------
-- Server version	5.5.36

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
-- Table structure for table `people`
--

DROP TABLE IF EXISTS `people`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `people` (
  `编号` bigint(20) NOT NULL,
  `姓名` varchar(255) DEFAULT NULL,
  `性别` varchar(255) DEFAULT NULL,
  `年龄` bigint(20) DEFAULT NULL,
  `所在系部` varchar(255) DEFAULT NULL,
  `专业` varchar(255) DEFAULT NULL,
  `职称` varchar(255) DEFAULT NULL,
  `所在实验室` varchar(255) DEFAULT NULL,
  `职务` varchar(255) DEFAULT NULL,
  `政治面貌` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`编号`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `people`
--

LOCK TABLES `people` WRITE;
/*!40000 ALTER TABLE `people` DISABLE KEYS */;
INSERT INTO `people` VALUES (2001,'李加军','男',32,'英语系','英语','副教授',NULL,NULL,NULL),(2002,'代国兴','男',55,'数学系','数学','教授',NULL,NULL,NULL),(2003,'刘一松','男',40,'计算机','软件工程','教授',NULL,NULL,NULL),(2004,'张三三','女',30,'法学系','法律','副教授',NULL,NULL,'党员'),(2005,'贾洪杰','男',30,'计算机','软件工程','副教授',NULL,NULL,NULL),(2006,'袁加仁','男',18,NULL,NULL,NULL,'物理实验室','教学',NULL),(2007,'潘森杉','男',30,'计算机','计算机','副教授',NULL,NULL,NULL),(2008,'崔青义','女',37,'物理系','物理','副教授',NULL,NULL,NULL),(2009,'刘明','男',45,NULL,NULL,'副教授',NULL,NULL,'党员'),(2010,'刘小红','女',49,'计算机','人工智能','副教授',NULL,NULL,NULL),(2012,'赵红','女',39,'文学系','文学','副教授',NULL,NULL,'党员'),(2014,'姜震','男',36,NULL,NULL,NULL,'计算机实验室','教学',NULL),(2015,'沈项军','男',40,'计算机','软件工程','教授',NULL,NULL,NULL),(2022,'陈小明','男',40,'计算机','软件工程','副教授',NULL,NULL,NULL),(2040,'闫长娟','女',40,'外国语','英语','副教授',NULL,NULL,NULL),(2041,'王柳荣','男',41,NULL,NULL,NULL,'物理实验室','教学',NULL),(2042,'王丽梅','女',35,NULL,NULL,'副教授',NULL,NULL,'党员'),(2043,'褚俊清','男',40,'文学系','语文','副教授',NULL,NULL,'党员');
/*!40000 ALTER TABLE `people` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers`
--

DROP TABLE IF EXISTS `teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teachers` (
  `编号` bigint(20) NOT NULL,
  `姓名` varchar(255) DEFAULT NULL,
  `性别` varchar(255) DEFAULT NULL,
  `年龄` bigint(20) DEFAULT NULL,
  `所在系部` varchar(255) DEFAULT NULL,
  `专业` varchar(255) DEFAULT NULL,
  `职称` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`编号`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers`
--

LOCK TABLES `teachers` WRITE;
/*!40000 ALTER TABLE `teachers` DISABLE KEYS */;
INSERT INTO `teachers` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL),(2001,'刘一松','男',45,'计算机','软件工程','教授'),(2007,'liuyisong','male',45,'jisuanji','rjgc','js'),(2022,'liuyisong','male',45,'jsj','rjgc','js');
/*!40000 ALTER TABLE `teachers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `testers`
--

DROP TABLE IF EXISTS `testers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `testers` (
  `编号` bigint(20) NOT NULL,
  `姓名` varchar(255) DEFAULT NULL,
  `性别` varchar(255) DEFAULT NULL,
  `年龄` bigint(20) DEFAULT NULL,
  `所在实验室` varchar(255) DEFAULT NULL,
  `职务` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`编号`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `testers`
--

LOCK TABLES `testers` WRITE;
/*!40000 ALTER TABLE `testers` DISABLE KEYS */;
INSERT INTO `testers` VALUES (2002,'袁加仁','男',40,'物理实验室','教授');
/*!40000 ALTER TABLE `testers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-04 17:46:28
