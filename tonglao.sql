/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50712
 Source Host           : localhost:3306
 Source Schema         : tonglao

 Target Server Type    : MySQL
 Target Server Version : 50712
 File Encoding         : 65001

 Date: 19/11/2020 20:22:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sandal_lao
-- ----------------------------
DROP TABLE IF EXISTS `sandal_lao`;
CREATE TABLE `sandal_lao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `content` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `picture` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sandal_lao
-- ----------------------------
BEGIN;
INSERT INTO `sandal_lao` VALUES (1, 'Sandal1', NULL, NULL, 'https://cf.shopee.vn/file/e2da42f58a69beb421400abb025f9ca0');
INSERT INTO `sandal_lao` VALUES (2, 'Sahdal2 ', 100.00, 'Tông lào loại 2', 'https://cf.shopee.vn/file/e2da42f58a69beb421400abb025f9ca0');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
