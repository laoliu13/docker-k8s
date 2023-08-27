CREATE DATABASE `docker_example_db` CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_unicode_ci';

use docker_example_db;
-- ----------------------------
-- Table structure for t_channel
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL,
  `name` VARCHAR(36) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

insert into user values (1, '小张', 10);
insert into user values (2, '小王', 11);
insert into user values (3, '小刘', 14);
insert into user values (4, '小李', 11);
insert into user values (5, '小宋', 12);
insert into user values (6, '小陈', 9);
insert into user values (7, '小欧', 10);
