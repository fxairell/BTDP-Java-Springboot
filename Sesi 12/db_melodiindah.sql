-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP VIEW IF EXISTS `album_lagu`;
CREATE TABLE `album_lagu` (`ID_Lagu` int(11), `Judul` varchar(50), `Album` varchar(50));


DROP VIEW IF EXISTS `album_produser`;
CREATE TABLE `album_produser` (`ID_Album` int(11), `Judul` varchar(50), `Tanggal_Copyright` date, `Produser` varchar(50));


DROP VIEW IF EXISTS `lagu_butterfly`;
CREATE TABLE `lagu_butterfly` (`Judul` varchar(50), `Musisi` varchar(50));


DROP VIEW IF EXISTS `lagu_girlfront`;
CREATE TABLE `lagu_girlfront` (`Judul` varchar(50), `Musisi` varchar(50));


DROP VIEW IF EXISTS `lagu_love4eva`;
CREATE TABLE `lagu_love4eva` (`Judul` varchar(50), `Musisi` varchar(50));


DROP VIEW IF EXISTS `lagu_loveandlive`;
CREATE TABLE `lagu_loveandlive` (`Judul` varchar(50), `Musisi` varchar(50));


DROP VIEW IF EXISTS `musisi_instrument`;
CREATE TABLE `musisi_instrument` (`Musisi` varchar(50), `Instrument` varchar(20), `Kunci` char(5));


SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tabelc_lagumus`;
CREATE TABLE `tabelc_lagumus` (
  `ID_Lagu` int(11) NOT NULL,
  `ID_Musisi` int(11) NOT NULL,
  KEY `ID_Lagu` (`ID_Lagu`),
  KEY `ID_Musisi` (`ID_Musisi`),
  CONSTRAINT `tabelc_lagumus_ibfk_4` FOREIGN KEY (`ID_Lagu`) REFERENCES `tabel_lagu` (`ID_Lagu`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `tabelc_lagumus_ibfk_5` FOREIGN KEY (`ID_Musisi`) REFERENCES `tabel_musisi` (`ID_Musisi`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tabelc_lagumus` (`ID_Lagu`, `ID_Musisi`) VALUES
(1,	12),
(1,	11),
(1,	10),
(1,	8),
(2,	12),
(2,	11),
(2,	10),
(2,	8),
(3,	7),
(3,	6),
(3,	5),
(4,	7),
(4,	6),
(4,	5),
(5,	1),
(5,	2),
(5,	3),
(5,	4),
(6,	1),
(6,	2),
(6,	3),
(6,	4),
(7,	1),
(7,	2),
(7,	3),
(7,	4),
(7,	5),
(7,	6),
(7,	7),
(7,	8),
(7,	9),
(7,	10),
(7,	11),
(7,	12),
(8,	1),
(8,	2),
(8,	3),
(8,	4),
(8,	5),
(8,	6),
(8,	7),
(8,	8),
(8,	9),
(8,	10),
(8,	11),
(8,	12),
(9,	1),
(9,	2),
(9,	3),
(9,	4),
(9,	5),
(9,	6),
(9,	7),
(9,	8),
(9,	9),
(9,	10),
(9,	11),
(9,	12),
(10,	1),
(10,	2),
(10,	3),
(10,	4),
(10,	5),
(10,	6),
(10,	7),
(10,	8),
(10,	9),
(10,	10),
(10,	11),
(10,	12),
(11,	1),
(11,	2),
(11,	3),
(11,	4),
(11,	5),
(11,	6),
(11,	7),
(11,	8),
(11,	9),
(11,	10),
(11,	11),
(11,	12),
(12,	1),
(12,	2),
(12,	3),
(12,	4),
(12,	5),
(12,	6),
(12,	7),
(12,	8),
(12,	9),
(12,	10),
(12,	11),
(12,	12),
(13,	1),
(13,	2),
(13,	3),
(13,	4),
(13,	5),
(13,	6),
(13,	7),
(13,	8),
(13,	9),
(13,	10),
(13,	11),
(13,	12);

DROP TABLE IF EXISTS `tabelc_musinst`;
CREATE TABLE `tabelc_musinst` (
  `ID_Musisi` int(11) NOT NULL,
  `ID_Instrument` int(11) NOT NULL,
  KEY `ID_Musisi` (`ID_Musisi`),
  KEY `ID_Instrument` (`ID_Instrument`),
  CONSTRAINT `tabelc_musinst_ibfk_1` FOREIGN KEY (`ID_Musisi`) REFERENCES `tabel_musisi` (`ID_Musisi`) ON DELETE NO ACTION,
  CONSTRAINT `tabelc_musinst_ibfk_2` FOREIGN KEY (`ID_Instrument`) REFERENCES `tabel_instrument` (`ID_Instrument`) ON DELETE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tabelc_musinst` (`ID_Musisi`, `ID_Instrument`) VALUES
(1,	1),
(1,	2),
(4,	5),
(4,	6),
(4,	7),
(4,	8),
(4,	9),
(4,	10),
(4,	11),
(4,	5),
(5,	2),
(5,	7),
(5,	12),
(12,	14);

DROP TABLE IF EXISTS `tabel_album`;
CREATE TABLE `tabel_album` (
  `ID_Album` int(11) NOT NULL AUTO_INCREMENT,
  `Judul` varchar(50) NOT NULL,
  `Tanggal_Copyright` date NOT NULL,
  `Format` enum('CD','DA','DS') NOT NULL,
  `Produser` int(11) NOT NULL,
  PRIMARY KEY (`ID_Album`),
  KEY `Produser` (`Produser`),
  CONSTRAINT `tabel_album_ibfk_2` FOREIGN KEY (`Produser`) REFERENCES `tabel_musisi` (`ID_Musisi`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tabel_album` (`ID_Album`, `Judul`, `Tanggal_Copyright`, `Format`, `Produser`) VALUES
(1,	'Love&Live',	'2017-03-13',	'CD',	12),
(2,	'Girl Front',	'2017-03-13',	'CD',	7),
(3,	'Love4Eva',	'2017-09-21',	'CD',	4),
(4,	'+ +',	'2018-08-20',	'CD',	1),
(5,	'x x',	'2019-02-19',	'CD',	2),
(6,	'#',	'2020-02-05',	'CD',	3),
(7,	'12.00',	'2020-10-19',	'CD',	4),
(8,	'&',	'2021-06-28',	'CD',	5),
(9,	'Flip That',	'2022-06-20',	'CD',	6);

DROP TABLE IF EXISTS `tabel_instrument`;
CREATE TABLE `tabel_instrument` (
  `ID_Instrument` int(11) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(20) NOT NULL,
  `Kunci` char(5) NOT NULL,
  PRIMARY KEY (`ID_Instrument`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tabel_instrument` (`ID_Instrument`, `Nama`, `Kunci`) VALUES
(1,	'Guitar',	'A'),
(2,	'Guitar',	'C'),
(3,	'Bass',	'D'),
(4,	'Bass',	'F'),
(5,	'Piano',	'A'),
(6,	'Piano',	'B'),
(7,	'Piano',	'C'),
(8,	'Piano',	'D'),
(9,	'Piano',	'E'),
(10,	'Piano',	'F'),
(11,	'Piano',	'G'),
(12,	'Digital Sound',	''),
(13,	'Drum',	''),
(14,	'Saxophone',	'D'),
(15,	'Flute',	'E');

DROP TABLE IF EXISTS `tabel_lagu`;
CREATE TABLE `tabel_lagu` (
  `ID_Lagu` int(11) NOT NULL AUTO_INCREMENT,
  `Judul` varchar(50) NOT NULL,
  `Album` int(11) NOT NULL,
  PRIMARY KEY (`ID_Lagu`),
  KEY `Album` (`Album`),
  CONSTRAINT `tabel_lagu_ibfk_4` FOREIGN KEY (`Album`) REFERENCES `tabel_album` (`ID_Album`) ON DELETE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tabel_lagu` (`ID_Lagu`, `Judul`, `Album`) VALUES
(1,	'Love&Live',	1),
(2,	'Sonatine',	1),
(3,	'Girl Front',	2),
(4,	'Sweet Crazy Love',	2),
(5,	'Love4Eva',	3),
(6,	'Favourite',	4),
(7,	'Hi High',	4),
(8,	'Butterfly',	5),
(9,	'Satelite',	5),
(10,	'So What',	6),
(11,	'Why Not',	7),
(12,	'Paint The Town',	8),
(13,	'Flip That',	9);

DROP TABLE IF EXISTS `tabel_musisi`;
CREATE TABLE `tabel_musisi` (
  `ID_Musisi` int(11) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(50) NOT NULL,
  `NIK` int(20) NOT NULL,
  `Alamat` text NOT NULL,
  `No_Telepon` int(15) NOT NULL,
  PRIMARY KEY (`ID_Musisi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tabel_musisi` (`ID_Musisi`, `Nama`, `NIK`, `Alamat`, `No_Telepon`) VALUES
(1,	'Olivia Hye',	12345,	'Eden',	6212345),
(2,	'Chuu',	12346,	'Eden',	6212346),
(3,	'Gowon',	12347,	'Eden',	6212347),
(4,	'Yves',	12348,	'Eden',	6212348),
(5,	'Choerry',	12349,	'',	6212349),
(6,	'Jinsoul',	12340,	'',	6212340),
(7,	'Kim Lip',	12341,	'',	6212341),
(8,	'Vivi',	12342,	'Korea',	6212342),
(9,	'Yeojin',	12343,	'Korea',	6212343),
(10,	'Haseul',	12344,	'Korea',	6212344),
(11,	'Hyunjin',	123455,	'Korea',	62123455),
(12,	'Heejin',	123456,	'Korea',	62123456);

DROP TABLE IF EXISTS `album_lagu`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `album_lagu` AS select `a`.`ID_Lagu` AS `ID_Lagu`,`a`.`Judul` AS `Judul`,`b`.`Judul` AS `Album` from (`tabel_lagu` `a` join `tabel_album` `b`) where `a`.`Album` = `b`.`ID_Album`;

DROP TABLE IF EXISTS `album_produser`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `album_produser` AS select `a`.`ID_Album` AS `ID_Album`,`a`.`Judul` AS `Judul`,`a`.`Tanggal_Copyright` AS `Tanggal_Copyright`,`b`.`Nama` AS `Produser` from (`tabel_album` `a` join `tabel_musisi` `b`) where `a`.`Produser` = `b`.`ID_Musisi`;

DROP TABLE IF EXISTS `lagu_butterfly`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `lagu_butterfly` AS select `b`.`Judul` AS `Judul`,`c`.`Nama` AS `Musisi` from ((`tabelc_lagumus` `a` join `tabel_lagu` `b`) join `tabel_musisi` `c`) where `a`.`ID_Lagu` = 8 and `a`.`ID_Lagu` = `b`.`ID_Lagu` and `a`.`ID_Musisi` = `c`.`ID_Musisi`;

DROP TABLE IF EXISTS `lagu_girlfront`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `lagu_girlfront` AS select `b`.`Judul` AS `Judul`,`c`.`Nama` AS `Musisi` from ((`tabelc_lagumus` `a` join `tabel_lagu` `b`) join `tabel_musisi` `c`) where `a`.`ID_Lagu` = 3 and `a`.`ID_Lagu` = `b`.`ID_Lagu` and `a`.`ID_Musisi` = `c`.`ID_Musisi`;

DROP TABLE IF EXISTS `lagu_love4eva`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `lagu_love4eva` AS select `b`.`Judul` AS `Judul`,`c`.`Nama` AS `Musisi` from ((`tabelc_lagumus` `a` join `tabel_lagu` `b`) join `tabel_musisi` `c`) where `a`.`ID_Lagu` = 5 and `a`.`ID_Lagu` = `b`.`ID_Lagu` and `a`.`ID_Musisi` = `c`.`ID_Musisi`;

DROP TABLE IF EXISTS `lagu_loveandlive`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `lagu_loveandlive` AS select `b`.`Judul` AS `Judul`,`c`.`Nama` AS `Musisi` from ((`tabelc_lagumus` `a` join `tabel_lagu` `b`) join `tabel_musisi` `c`) where `a`.`ID_Lagu` = 1 and `a`.`ID_Lagu` = `b`.`ID_Lagu` and `a`.`ID_Musisi` = `c`.`ID_Musisi`;

DROP TABLE IF EXISTS `musisi_instrument`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `musisi_instrument` AS select `a`.`Nama` AS `Musisi`,`b`.`Nama` AS `Instrument`,`b`.`Kunci` AS `Kunci` from ((`tabel_musisi` `a` join `tabel_instrument` `b`) join `tabelc_musinst` `c`) where `c`.`ID_Musisi` = `a`.`ID_Musisi` and `c`.`ID_Instrument` = `b`.`ID_Instrument`;

-- 2022-06-22 14:51:17
