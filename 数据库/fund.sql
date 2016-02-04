# Host: localhost  (Version: 5.5.11)
# Date: 2016-02-04 17:28:44
# Generator: MySQL-Front 5.3  (Build 4.271)

/*!40101 SET NAMES gb2312 */;

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL DEFAULT '' COMMENT '用户名',
  `userpassword` varchar(255) NOT NULL DEFAULT '' COMMENT '密码',
  `usermail` varchar(255) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`Id`),
  UNIQUE KEY `username` (`username`) COMMENT '用户名'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "user"
#

