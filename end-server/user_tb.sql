CREATE DATABASE `webpro_db`;


CREATE TABLE `user_tb` (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户名',
  `user_password` varchar(32) NOT NULL COMMENT '用户密码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COMMENT='用户表';


INSERT INTO webpro_db.user_tb (user_id, user_name, user_password) VALUES(1, 'admin', '123456');
INSERT INTO webpro_db.user_tb (user_id, user_name, user_password) VALUES(2, 'teacher', '12580');
INSERT INTO webpro_db.user_tb (user_id, user_name, user_password) VALUES(3, 'ads12', '12580');
INSERT INTO webpro_db.user_tb (user_id, user_name, user_password) VALUES(4, 'admin110', 'asd123456');
