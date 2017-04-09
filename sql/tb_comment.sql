-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: db_teacher_judge
-- ------------------------------------------------------
-- Server version	5.7.17-0ubuntu0.16.04.1

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
-- Table structure for table `tb_comment`
--

DROP TABLE IF EXISTS `tb_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_id` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `content` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_comment`
--

LOCK TABLES `tb_comment` WRITE;
/*!40000 ALTER TABLE `tb_comment` DISABLE KEYS */;
INSERT INTO `tb_comment` VALUES (1,1,73,1,'好老师'),(2,1,83,1,'好老师啊'),(3,1,65,1,'这个那个\n另外一行\n又一行啦干一行爱一行，你说是吧，一行？'),(4,1,83,1,'哲哦个和我dhjfoiwefjodhofo大家我拉萨kjdhouiwhegoewdkjhiweodjioiew达科技回归打开后该哦额外大集合该哦我sldjfig看到结果哦我大集合该哦我的大集合该哦我哲哦个和我dhjfoiwefjodhofo大家我拉萨kjdhouiwhegoewdkjhiweodjioiew达科技回归打开后该哦额外大集合该哦我sldjfig看到结果哦我大集合该哦我的大集合该哦我哲哦个和我dhjfoiwefjodhofo大家我拉萨kjdhouiwhegoewdkjhiweodjioiew达科技回归打开后该哦额外大集合该哦我sldjfig看到结果哦我大集合该哦我的大集合该哦我'),(5,1,83,1,'哲哦个和我dhjfoiwefjodhofo大家我拉萨kjdhouiwhegoewdkjhiweodjioiew达科技回归打开后该哦额外大集合该哦我sldjfig看到结果哦我大集合该哦我的大集合该哦我哲哦个和我dhjfoiwefjodhofo大家我拉萨kjdhouiwhegoewdkjhiweodjioiew达科技回归打开后该哦额外大集合该哦我sldjfig看到结果哦我大集合该哦我的大集合该哦我哲哦个和我dhjfoiwefjodhofo大家我拉萨kjdhouiwhegoewdkjhiweodjioiew达科技回归打开后该哦额外大集合该哦我sldjfig看到结果哦我大集合该哦我的大集合该哦我'),(6,1,43,1,'非'),(7,1,43,1,'非'),(8,1,87,1,'该'),(9,1,43,1,'非'),(10,2,99,1,'好老师啊');
/*!40000 ALTER TABLE `tb_comment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-09 22:35:03
