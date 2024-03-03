-- 创建数据库
create database goods ;
-- 进入 goods数据库
use goods ;

CREATE TABLE `goods`  ( -- 商品表
                          `id` int NOT NULL AUTO_INCREMENT,
                          `goodsName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL,
                          `goodsPrice` decimal(10, 2) NULL DEFAULT NULL,
                          `goodsNum` int NULL DEFAULT NULL,
                          `goodsType` int NULL DEFAULT NULL,
                          `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL,
                          PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci ROW_FORMAT = Dynamic;
-- 添加数据
INSERT INTO `goods` VALUES (1, '华为手机', 2500.00, 8, 1, '手机质量好');
INSERT INTO `goods` VALUES (2, '苹果', 15.00, 5, 2, '品质优，水分多而甜');
INSERT INTO `goods` VALUES (3, '苹果手机', 18000.00, 1, 1, '价格贵');
INSERT INTO `goods` VALUES (4, '华硕电脑', 8000.00, 1, 3, '高配置，性能强');
INSERT INTO `goods` VALUES (5, '格力空调', 2500.00, 1, 4, '格力空调，好品质，值得信赖');

CREATE TABLE `type`  ( -- 类型表
                         `typeId` int NOT NULL AUTO_INCREMENT,
                         `typeName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL,
                         PRIMARY KEY (`typeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci ROW_FORMAT = Dynamic;
-- 添加数据
INSERT INTO `type` VALUES (1, '手机');
INSERT INTO `type` VALUES (2, '水果');
INSERT INTO `type` VALUES (3, '电脑');
INSERT INTO `type` VALUES (4, '电器');
