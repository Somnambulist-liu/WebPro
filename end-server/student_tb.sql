CREATE DATABASE `webpro_db`;

CREATE TABLE `student_tb` (
  `student_id` int NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `student_name` varchar(32) NOT NULL COMMENT '学生名称',
  `student_gender` varchar(5) DEFAULT NULL COMMENT '学生性别',
  `student_class_name` varchar(32) DEFAULT NULL COMMENT '学生班级',
  `student_major` varchar(32) DEFAULT NULL COMMENT '学生专业',
  `student_num` varchar(16) NOT NULL COMMENT '学号',
  `student_phone` varchar(11) NOT NULL COMMENT '学生电话',
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb3 COMMENT='学生表';

INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(2, '张图', '男', '2019级7班', '软件工程', '2021914826', '151****1456');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(3, '王大神', '女', '2020级10班', '区块链技术', '2020616677', '181****9231');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(4, '李阿达', '男', '2021级12班', '物联网技术', '2021316567', '152****9546');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(5, '吴阿斯', '女', '2020级06班', '信息安全技术', '2020316447', '133****5632');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(6, '阿萨德', '女', '2020级02班', '人工智能', '2020232316', '135****1258');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(7, '亚德客', '男', '2023级10班', '大数据技术', '2023499316', '157****4995');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(8, '东方红', '男', '2020级11班', '云计算技术', '2020116158', '157****4896');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(9, '商水大', '女', '2018级08班', '智能产品开发', '2018317466', '131****1148');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(10, '捷爱士', '男', '2020级01班', '网络工程技术', '20202632323', '135****1899');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(11, '捷爱士', '男', '2010级01班', '网络工程技术', '20202634848', '195****1899');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(12, '谁打的就', '女', '2017级08班', '物联网工程', '20202632323', '135****1878');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(13, '捷爱士', '男', '2020级01班', '网络工程技术', '20589899894', '125****1959');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(14, '亚试了', '男', '2015级01班', '网络工程技术', '20202634848', '135****1899');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(15, '韩国复古', '女 ', '2020级07班', '网络工程技术', '20202624803', '195****1855');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(16, '萨达', '男', '2018级01班', '网络工程技术', '20202632323', '135****1899');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(17, '捷爱士', '男', '2020级05班', '网络工程技术', '20159632323', '132****1878');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(18, '是哒哒哒', '男', '2022级01班', '网络工程技术', '20123322323', '135****1899');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(19, '捷爱士', '女 ', '2023级01班', '网络工程技术', '20204956261', '135****1482');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(20, '傻掉了', '男', '2020级08班', '网络工程技术', '24856262323', '135****5599');
INSERT INTO webpro_db.student_tb (student_id, student_name, student_gender, student_class_name, student_major, student_num, student_phone) VALUES(21, '张古', '男', '2022级06班', '软件工程', '2235644821', '13912344125');