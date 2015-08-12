/*
Navicat MySQL Data Transfer

Source Server         : storm
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : storm

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2015-08-12 13:58:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT '18' COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('100', 'jkl', '23');
INSERT INTO `user_info` VALUES ('102', 'asdf', '12');
INSERT INTO `user_info` VALUES ('103', 'asdf', '12');
INSERT INTO `user_info` VALUES ('104', 'asdf', '12');
INSERT INTO `user_info` VALUES ('105', 'asdf', '12');
INSERT INTO `user_info` VALUES ('106', 'asdf', '12');
