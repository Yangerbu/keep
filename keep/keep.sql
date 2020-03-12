/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.1.49-community : Database - db_keep
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_keep` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_keep`;

/*Table structure for table `tb_class` */

DROP TABLE IF EXISTS `tb_class`;

CREATE TABLE `tb_class` (
  `id` int(11) NOT NULL,
  `class_name` varchar(50) DEFAULT NULL,
  `teacher` varchar(50) DEFAULT NULL,
  `class_time` int(11) DEFAULT NULL,
  `nums` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_class` */

insert  into `tb_class`(`id`,`class_name`,`teacher`,`class_time`,`nums`,`price`) values (1,'初级','刘刘',50,5,100),(2,'中级','老四',40,3,50),(3,'高级','四哥',38,5,77),(4,'肚皮舞','张生',24,8,38),(5,'拉丁舞','老纪',20,7,55),(6,'瑜伽','赵本',13,7,78),(7,'搏击操','张草',16,9,87),(8,'爵士','朗诵',24,6,78),(9,'动感单车','不总',35,4,25),(10,'健美操','小高',10,3,34);

/*Table structure for table `tb_material` */

DROP TABLE IF EXISTS `tb_material`;

CREATE TABLE `tb_material` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `nums` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `in_time` date DEFAULT NULL,
  `fix_time` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_material` */

insert  into `tb_material`(`id`,`name`,`nums`,`price`,`in_time`,`fix_time`) values (1,'跑步机',5,599,NULL,NULL),(2,'单杠',2,999,NULL,NULL),(3,'哑铃',10,24,NULL,NULL),(4,'美腰机',3,1888,NULL,NULL),(5,'台阶机',4,7500,NULL,NULL),(6,'跳绳',20,15,NULL,NULL),(7,'划船器',6,3400,NULL,NULL),(8,'坐姿推胸机',4,4446,NULL,NULL);

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `super_admin` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`username`,`password`,`super_admin`) values (1,'irving','123456',1),(2,'yong','123123',0),(3,'perfue','456456',0),(4,'laozhang','789789',0),(5,'xiaobu','123789',0),(6,'buzong','456123',0),(7,'dage','789456',0),(8,'xiaogao','456852',0),(9,'buzhang','741852',0),(10,'yushen','963258',0),(11,'ruanjia','852741',0),(12,'dings','789231',0),(13,'sings','852136',0),(14,'adsin','842693',0),(15,'aisks','235668',0),(16,'qing','232566',0),(17,'songe','641234',0),(18,'zheng','354534',0),(19,'kang','345345',0),(20,'suns','435563',0),(21,'yangge','324343',0),(22,'nishi','334234',0),(23,'wuming','213455',0),(24,'mmmp','676655',0),(25,'banga','435545',0),(26,'qazxc','768688',0),(27,'sanga','434323',0),(28,'chang','678909',0),(29,'vers','343278',0),(30,'lige','566264',0),(31,'langa','325435',0),(32,'zhen','234354',0),(33,'lulang','322554',0);

/*Table structure for table `tb_user_info` */

DROP TABLE IF EXISTS `tb_user_info`;

CREATE TABLE `tb_user_info` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `addr` varchar(50) DEFAULT NULL,
  `created_time` date DEFAULT NULL,
  `modified_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_user_info` */

insert  into `tb_user_info`(`id`,`name`,`age`,`tel`,`addr`,`created_time`,`modified_time`) values (1,'irving',20,'111111','洛阳市洛龙区','2020-02-20','2020-02-21'),(2,'yong',21,'324231','洛阳市涧西区','2020-01-09','2020-02-10'),(3,'perfue',23,'334556','郑州市中原区','2020-02-07','2020-02-20'),(4,'laozhang',24,'213234','濮阳市华龙区','2020-02-07','2020-02-20'),(5,'xiaobu',23,'354346','濮阳市开发区','2020-02-07','2020-02-20'),(6,'buzong',35,'656565','郑州市金水区','2020-02-07','2020-02-20'),(7,'dage',23,'544341','洛阳市回族区','2020-02-07','2020-02-20'),(8,'xiaogao',12,'323344','郑州市巩义市','2020-02-07','2020-02-20'),(9,'buzhang',34,'121213','郑州市登封市','2020-02-07','2020-02-20'),(10,'yushen',33,'543433','河南省新乡市','2020-02-07','2020-02-20'),(11,'ruanjia',35,'345664','河南省鹤壁市','2020-02-07','2020-02-20'),(12,'dings',54,'453454','周口市淮阳县','2020-02-07','2020-02-20'),(13,'sings',34,'575443','河南省安阳市','2020-02-07','2020-02-20'),(14,'adsin',21,'778756','河南省商丘市','2020-02-07','2020-02-20'),(15,'aisks',22,'561988','濮阳市濮阳县','2020-02-11','2020-02-21'),(16,'qing',32,'651561','濮阳市濮水小镇','2020-02-11','2020-02-21'),(17,'songe',28,'451578','商丘市夏邑县','2020-02-11','2020-02-21'),(18,'zheng',23,'543448','新乡市长垣县','2020-02-11','2020-02-21'),(19,'kang',24,'543543','新乡市获嘉县','2020-02-11','2020-02-21'),(20,'suns',26,'655623','濮阳市庆祖镇','2020-02-11','2020-02-21'),(21,'yangge',28,'232323','洛阳市大学城','2020-02-11','2020-02-21'),(22,'nishi',28,'894512','郑州市高新区','2020-02-11','2020-02-21'),(23,'wuming',43,'546513','郑州市新郑市','2020-02-11','2020-02-21'),(24,'mmmp',52,'232313','濮阳市台前县','2020-02-11','2020-02-21'),(25,'banga',44,'564635','洛阳市开元大道','2020-02-11','2020-02-21'),(26,'qazxc',46,'646846','郑州市二七区','2020-02-24','2020-02-28'),(27,'sanga',22,'884618','郑州市高铁站','2020-02-24','2020-02-28'),(28,'chang',41,'561664','洛阳市龙翔街','2020-02-24','2020-02-28'),(29,'vers',33,'784166','洛阳市黄圃镇','2020-02-24','2020-02-28'),(30,'lige',55,'264982','郑州市三里屯','2020-02-24','2020-02-28'),(31,'langa',23,'249561','洛阳市二叉口','2020-02-24','2020-02-28'),(32,'zhen',25,'894998','濮阳市中心街','2020-02-24','2020-02-28'),(33,'lulang',34,'436322','洛阳市濮院三号楼','2020-02-24','2020-02-28');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
