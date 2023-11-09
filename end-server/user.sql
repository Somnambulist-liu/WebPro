CREATE DATABASE `webpro_db`;
-- webpro_db.user_tb definition
CREATE TABLE `user_tb` (
                           `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
                           `userName` varchar(32) NOT NULL COMMENT '用户名',
                           `passWord` varchar(100) NOT NULL COMMENT '密码',
                           `createTime` datetime NOT NULL COMMENT '创建记录时间',
                           `updateTime` datetime NOT NULL COMMENT '更新记录时间',
                           PRIMARY KEY (`id`),
                           UNIQUE KEY `user_tb_un` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;