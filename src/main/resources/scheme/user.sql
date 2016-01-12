CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '사용자 고유번호',
  `name` varchar(100) NOT NULL COMMENT '사용자 이름',
  `create_date` datetime NOT NULL COMMENT '사용자 생성날짜',
  PRIMARY KEY (`user_id`) COMMENT '사용자 정보 테이블'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
