/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : wx

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-04-20 14:17:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for area
-- ----------------------------
DROP TABLE IF EXISTS `area`;
CREATE TABLE `area` (
  `area_id` int(11) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(200) NOT NULL,
  `priority` int(11) NOT NULL DEFAULT '0' COMMENT '权值',
  `create_time` date DEFAULT NULL COMMENT '创建时间戳',
  `last_edit_time` date DEFAULT NULL COMMENT '最后修改时间戳',
  PRIMARY KEY (`area_id`),
  UNIQUE KEY `name` (`area_name`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of area
-- ----------------------------
INSERT INTO `area` VALUES ('1', '广州', '1', '2019-04-03', '2019-04-20');
INSERT INTO `area` VALUES ('2', '北京', '2', '2019-04-16', '2019-04-28');
INSERT INTO `area` VALUES ('3', '湖北', '3', '2019-04-03', '2019-04-20');
INSERT INTO `area` VALUES ('4', '吉林', '6', '2019-04-02', '2019-04-20');
INSERT INTO `area` VALUES ('5', '江西', '2', '2019-04-20', '2019-04-20');
INSERT INTO `area` VALUES ('6', '海南', '2', '2019-04-20', '2019-04-20');
