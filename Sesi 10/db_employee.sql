-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP VIEW IF EXISTS `data_gaji`;
CREATE TABLE `data_gaji` (`id_pegawai` int(11), `nama_pegawai` varchar(50), `jabatan` varchar(50), `gaji` float);


SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_gaji`;
CREATE TABLE `tb_gaji` (
  `id_gaji` int(11) NOT NULL,
  `id_pegawai` int(11) NOT NULL,
  `gaji` float NOT NULL,
  `tanggal_gaji` date NOT NULL,
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `tb_gaji_ibfk_2` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_gaji` (`id_gaji`, `id_pegawai`, `gaji`, `tanggal_gaji`) VALUES
(2001,	1,	2000000,	'2012-12-01'),
(2002,	2,	1800000,	'2012-12-01'),
(2003,	3,	1500000,	'2012-12-01'),
(2004,	4,	3500000,	'2012-12-01'),
(2005,	5,	4000000,	'2012-12-01'),
(2006,	6,	2500000,	'2012-12-01'),
(2007,	7,	1500000,	'2012-12-01'),
(2008,	8,	1000000,	'2012-12-01'),
(2009,	9,	3500000,	'2012-12-01'),
(2010,	10,	3500000,	'2012-12-01');

DROP TABLE IF EXISTS `tb_menu`;
CREATE TABLE `tb_menu` (
  `id_menu` int(11) NOT NULL AUTO_INCREMENT,
  `nama_menu` varchar(50) NOT NULL,
  `jenis` enum('Indonesian Food','Western Food','Beverage') NOT NULL,
  `harga` float NOT NULL,
  PRIMARY KEY (`id_menu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_menu` (`id_menu`, `nama_menu`, `jenis`, `harga`) VALUES
(111,	'Javanese Tofu',	'Indonesian Food',	50000),
(112,	'Sirloin Steak',	'Western Food',	70000),
(113,	'Tenderloin Steak',	'Western Food',	90000),
(114,	'Fish Ball Soup',	'Western Food',	75000),
(115,	'Mie Rebus',	'Indonesian Food',	15000),
(116,	'Macaroni Chicken Soup',	'Western Food',	80000),
(117,	'Fruit Punch',	'Beverage',	15000),
(118,	'Mocachino Ice',	'Beverage',	15000),
(119,	'Strawberry Juice',	'Beverage',	10000),
(120,	'Milkshake',	'Beverage',	12000);

DROP TABLE IF EXISTS `tb_pegawai`;
CREATE TABLE `tb_pegawai` (
  `id_pegawai` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pegawai` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `jenis_kelamin` enum('Laki-Laki','Perempuan') NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `status` enum('Lajang','Menikah') NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  PRIMARY KEY (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_pegawai` (`id_pegawai`, `nama_pegawai`, `alamat`, `jenis_kelamin`, `tanggal_lahir`, `status`, `no_telepon`, `jabatan`) VALUES
(1,	'Yeni',	'Salakan',	'Perempuan',	'1992-10-14',	'Lajang',	'5678094',	'Cook Assistant'),
(2,	'Ikri',	'Tamansiswa',	'Laki-Laki',	'1992-04-13',	'Lajang',	'677908',	'Supervisor'),
(3,	'Martini',	'Bengkulu',	'Perempuan',	'1989-05-09',	'Menikah',	'89345',	'Operation Manager'),
(4,	'Hartini',	'Bengkulu',	'Perempuan',	'1990-03-05',	'Menikah',	'12367',	'Manager'),
(5,	'Yuni',	'Bengkulu',	'Laki-Laki',	'1989-09-04',	'Lajang',	'98076',	'General Manager'),
(6,	'Santoso',	'Jogja',	'Laki-Laki',	'1989-09-08',	'Lajang',	'123480',	'Waiter'),
(7,	'Piniarty',	'Bengkulu',	'Perempuan',	'1992-04-09',	'Lajang',	'34467',	'Cleaning Service'),
(8,	'Astuti',	'Jogja',	'Perempuan',	'1991-03-06',	'Lajang',	'9876',	'Casheer'),
(9,	'Tumini',	'Bantul',	'Perempuan',	'1989-03-02',	'Lajang',	'945678',	'Casheer'),
(10,	'Yovi',	'Salakan',	'Perempuan',	'1991-07-25',	'Lajang',	'899981928',	'Head Chef');

DROP TABLE IF EXISTS `tb_pembeli`;
CREATE TABLE `tb_pembeli` (
  `id_pembeli` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pembeli` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `jenis_kelamin` enum('Laki-Laki','Perempuan') NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `status` enum('Lajang','Menikah') NOT NULL,
  `no_telepon` int(15) NOT NULL,
  `pekerjaan` varchar(50) NOT NULL,
  PRIMARY KEY (`id_pembeli`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_pembeli` (`id_pembeli`, `nama_pembeli`, `alamat`, `jenis_kelamin`, `tanggal_lahir`, `status`, `no_telepon`, `pekerjaan`) VALUES
(211,	'Wiwit',	'Bengkulu',	'Perempuan',	'1989-03-01',	'Lajang',	567890,	'Apoteker'),
(212,	'Ayu',	'Malang',	'Perempuan',	'1988-06-03',	'Menikah',	5690235,	'Dosen'),
(213,	'Nengsih',	'Solo',	'Perempuan',	'1980-07-09',	'Menikah',	765489,	'Asisten'),
(214,	'Albert',	'Australia',	'Perempuan',	'1989-09-08',	'Lajang',	346789,	'Analis'),
(215,	'Salmi',	'Bengkulu',	'Perempuan',	'1989-09-07',	'Menikah',	907654,	'Perawat'),
(216,	'Rahmat',	'Lombok',	'Laki-Laki',	'1988-08-06',	'Menikah',	987654,	'Kontraktor'),
(217,	'Budiana',	'Bali',	'Perempuan',	'1987-03-01',	'Menikah',	12468,	'Analis'),
(218,	'Wati',	'Bengkulu',	'Perempuan',	'1980-07-06',	'Menikah',	987766,	'Programmer'),
(219,	'Rayan Nazriel',	'Bangladesh',	'Laki-Laki',	'1989-09-10',	'Lajang',	6790007,	'Perawat'),
(220,	'Aleks',	'Papua',	'Laki-Laki',	'1990-03-04',	'Lajang',	9988664,	'Dokter');

DROP TABLE IF EXISTS `tb_transaksi`;
CREATE TABLE `tb_transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `id_pembeli` int(11) NOT NULL,
  `id_menu` int(11) NOT NULL,
  `id_pegawai` int(11) NOT NULL,
  `tanggal_transaksi` date NOT NULL,
  KEY `id_menu` (`id_menu`),
  KEY `id_pembeli` (`id_pembeli`),
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `tb_transaksi_ibfk_5` FOREIGN KEY (`id_menu`) REFERENCES `tb_menu` (`id_menu`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `tb_transaksi_ibfk_6` FOREIGN KEY (`id_pembeli`) REFERENCES `tb_pembeli` (`id_pembeli`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `tb_transaksi_ibfk_7` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_transaksi` (`id_transaksi`, `id_pembeli`, `id_menu`, `id_pegawai`, `tanggal_transaksi`) VALUES
(1001,	211,	111,	9,	'2012-09-09'),
(1002,	211,	111,	9,	'2012-11-08'),
(1003,	212,	111,	10,	'2012-11-10'),
(1004,	213,	111,	10,	'2012-11-28'),
(1005,	213,	111,	9,	'2012-11-28'),
(1006,	214,	111,	9,	'2012-11-29'),
(1007,	215,	111,	10,	'2012-12-08'),
(1008,	216,	111,	9,	'2012-12-08'),
(1009,	217,	111,	9,	'2012-12-18'),
(1010,	218,	111,	9,	'2012-12-18'),
(1011,	219,	111,	10,	'2012-12-28');

DROP TABLE IF EXISTS `data_gaji`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `data_gaji` AS select `a`.`id_pegawai` AS `id_pegawai`,`a`.`nama_pegawai` AS `nama_pegawai`,`a`.`jabatan` AS `jabatan`,`b`.`gaji` AS `gaji` from (`tb_pegawai` `a` join `tb_gaji` `b`) where `a`.`id_pegawai` = `b`.`id_pegawai`;

-- 2022-06-22 13:47:20
