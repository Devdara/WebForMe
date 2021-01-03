-- --------------------------------------------------------
-- 호스트:                          58.79.19.99
-- 서버 버전:                        5.7.32 - MySQL Community Server (GPL)
-- 서버 OS:                        Linux
-- HeidiSQL 버전:                  10.3.0.5771
-- --------------------------------------------------------

-- 테이블 forme.user 구조 내보내기
CREATE TABLE IF NOT EXISTS `user` (
  `u_idx` int(11) NOT NULL AUTO_INCREMENT,
  `user_email` varchar(50) DEFAULT NULL,
  `user_pw` varchar(50) DEFAULT NULL,
  `user_nm` varchar(50) DEFAULT NULL,
  `cdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `use_yn` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`u_idx`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='회원 테이블';