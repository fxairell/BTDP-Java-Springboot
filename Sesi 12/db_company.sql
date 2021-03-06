-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `Department_Number` int(15) NOT NULL AUTO_INCREMENT,
  `Department_Name` varchar(50) NOT NULL,
  `Manager_Startdate` date NOT NULL,
  PRIMARY KEY (`Department_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `department` (`Department_Number`, `Department_Name`, `Manager_Startdate`) VALUES
(1,	'Human Resource',	'2021-06-13'),
(2,	'Accounting',	'2021-06-13'),
(3,	'Information Care',	'2021-06-13'),
(4,	'Technology Development',	'2021-06-13'),
(5,	'Sales',	'2021-06-13'),
(6,	'Digital Marketing',	'2021-06-13'),
(7,	'Archive',	'2021-06-13'),
(8,	'Warehouse',	'2021-06-13');

DROP TABLE IF EXISTS `dependent`;
CREATE TABLE `dependent` (
  `SSN` int(11) NOT NULL,
  `Dependent_Name` varchar(50) NOT NULL,
  `Sex` enum('Laki-Laki','Perempuan') NOT NULL,
  `Birthdate` date NOT NULL,
  `Relationship` enum('Suami','Istri','Anak','Orang Tua','Keluarga','Wali') NOT NULL,
  KEY `SSN` (`SSN`),
  CONSTRAINT `dependent_ibfk_2` FOREIGN KEY (`SSN`) REFERENCES `employee` (`SSN`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `dependent` (`SSN`, `Dependent_Name`, `Sex`, `Birthdate`, `Relationship`) VALUES
(1,	'Riyanto',	'Laki-Laki',	'1997-01-01',	'Suami'),
(2,	'Nabilah',	'Perempuan',	'2000-02-02',	'Istri'),
(2,	'Santri',	'Laki-Laki',	'2007-01-01',	'Anak'),
(2,	'Nyayu',	'Perempuan',	'2009-01-01',	'Anak'),
(8,	'Fany',	'Perempuan',	'2000-08-08',	'Istri'),
(8,	'Vinny',	'Perempuan',	'2007-08-08',	'Anak'),
(11,	'Vano',	'Laki-Laki',	'1979-11-11',	'Orang Tua'),
(12,	'Naruto',	'Laki-Laki',	'1996-12-12',	'Suami'),
(13,	'Korpal',	'Laki-Laki',	'1979-01-02',	'Orang Tua'),
(14,	'Nanda',	'Perempuan',	'2005-02-03',	'Anak'),
(15,	'Ambrosia',	'Perempuan',	'2000-03-04',	'Istri'),
(15,	'Nyx',	'Perempuan',	'2007-03-04',	'Anak');

DROP TABLE IF EXISTS `dept_location`;
CREATE TABLE `dept_location` (
  `Department_Number` int(15) NOT NULL,
  `Department_Location` varchar(50) NOT NULL,
  KEY `Department_Number` (`Department_Number`),
  CONSTRAINT `dept_location_ibfk_2` FOREIGN KEY (`Department_Number`) REFERENCES `department` (`Department_Number`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `dept_location` (`Department_Number`, `Department_Location`) VALUES
(1,	'Jakarta'),
(1,	'Bekasi'),
(1,	'Palembang'),
(1,	'Bali'),
(1,	'NTT'),
(2,	'Jakarta'),
(2,	'Bekasi'),
(2,	'Palembang'),
(3,	'Jakarta'),
(3,	'Bekasi'),
(3,	'Palembang'),
(4,	'Jakarta'),
(4,	'Bekasi'),
(5,	'Jakarta'),
(5,	'Bekasi'),
(5,	'Palembang'),
(5,	'Bali'),
(6,	'Jakarta'),
(6,	'Bekasi'),
(6,	'Palembang'),
(7,	'Jakarta'),
(7,	'Bekasi'),
(7,	'Palembang'),
(8,	'Jakarta'),
(8,	'Bekasi');

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `SSN` int(11) NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(20) NOT NULL,
  `Middle_Name` varchar(20) NOT NULL,
  `Last_Name` varchar(20) NOT NULL,
  `Birthdate` date NOT NULL,
  `Address` text NOT NULL,
  `Sex` enum('Laki-Laki','Perempuan') NOT NULL,
  `Salary` float NOT NULL,
  `Department_Number` int(15) NOT NULL,
  PRIMARY KEY (`SSN`),
  KEY `Department_Number` (`Department_Number`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`Department_Number`) REFERENCES `department` (`Department_Number`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `employee` (`SSN`, `First_Name`, `Middle_Name`, `Last_Name`, `Birthdate`, `Address`, `Sex`, `Salary`, `Department_Number`) VALUES
(1,	'Abigail',	'Bernanda',	'Cassie',	'1999-01-01',	'Bekasi',	'Perempuan',	10000000,	1),
(2,	'Dino',	'Emanuel',	'Farhan',	'1999-02-02',	'Jakarta',	'Laki-Laki',	15000000,	2),
(3,	'Greggory',	'Hamid',	'Ian',	'1999-03-03',	'Bekasi',	'Laki-Laki',	10000000,	1),
(4,	'Justin',	'Korpel',	'Leno',	'1999-04-04',	'Bekasi',	'Laki-Laki',	15000000,	3),
(5,	'Maria',	'Namida',	'Osial',	'1999-05-05',	'Jakarta',	'Perempuan',	20000000,	5),
(6,	'Primmy',	'Queen',	'Regina',	'1999-06-06',	'Bekasi',	'Perempuan',	20000000,	4),
(7,	'Starlight',	'Tia',	'Ursula',	'1999-07-07',	'Bekasi',	'Perempuan',	10000000,	8),
(8,	'Vino',	'Westernlight',	'Xavier',	'1999-08-08',	'Bekasi',	'Laki-Laki',	10000000,	8),
(9,	'Yugi',	'Zen',	'Andira',	'1999-09-09',	'Jakarta',	'Laki-Laki',	10000000,	1),
(10,	'Bertrand',	'Chuck',	'Donn',	'1999-10-10',	'Bekasi',	'Laki-Laki',	15000000,	7),
(11,	'Evanella',	'Fernanda',	'Gabriella',	'1999-11-11',	'Bekasi',	'Perempuan',	10000000,	1),
(12,	'Hinata',	'Indira',	'Jackie',	'1999-12-12',	'Jakarta',	'Perempuan',	20000000,	4),
(13,	'Kernel',	'Lossaga',	'Meen',	'1999-01-02',	'Jakarta',	'Laki-Laki',	20000000,	5),
(14,	'Nandito',	'Orama',	'Prestagio',	'1999-02-03',	'Bekasi',	'Laki-Laki',	25000000,	6),
(15,	'Quence',	'Rossario',	'Shawn',	'1999-03-04',	'Jakarta',	'Laki-Laki',	10000000,	1);

DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `Department_Number` int(15) NOT NULL,
  `SSN` int(11) NOT NULL,
  KEY `Department_Number` (`Department_Number`),
  KEY `SSN` (`SSN`),
  CONSTRAINT `manager_ibfk_3` FOREIGN KEY (`Department_Number`) REFERENCES `department` (`Department_Number`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `manager_ibfk_4` FOREIGN KEY (`SSN`) REFERENCES `employee` (`SSN`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `manager` (`Department_Number`, `SSN`) VALUES
(1,	11),
(2,	2),
(3,	4),
(4,	12),
(5,	5),
(6,	14),
(7,	10),
(8,	8);

DROP VIEW IF EXISTS `no_1`;
CREATE TABLE `no_1` (`First_Name` varchar(20), `Middle_Name` varchar(20), `Last_Name` varchar(20), `Dependent_Name` varchar(50), `Relationship` enum('Suami','Istri','Anak','Orang Tua','Keluarga','Wali'));


DROP VIEW IF EXISTS `no_10`;
CREATE TABLE `no_10` (`SSN` int(11), `First_Name` varchar(20), `Middle_Name` varchar(20), `Last_Name` varchar(20), `Total_Project` bigint(21));


DROP VIEW IF EXISTS `no_11`;
CREATE TABLE `no_11` (`SSN` int(11), `First_Name` varchar(20), `Middle_Name` varchar(20), `Last_Name` varchar(20), `Total_Project` bigint(21));


DROP VIEW IF EXISTS `no_12`;
CREATE TABLE `no_12` (`SSN` int(11), `First_Name` varchar(20), `Middle_Name` varchar(20), `Last_Name` varchar(20), `Total_Hours` decimal(32,0), `Total_Project` bigint(21));


DROP VIEW IF EXISTS `no_13`;
CREATE TABLE `no_13` (`SSN` int(11), `First_Name` varchar(20), `Middle_Name` varchar(20), `Last_Name` varchar(20), `Total_Dependent` bigint(21));


DROP VIEW IF EXISTS `no_14`;
CREATE TABLE `no_14` (`Department_Number` int(15), `Department_Name` varchar(50), `SSN` int(11), `First_Name` varchar(20), `Middle_Name` varchar(20), `Last_Name` varchar(20), `Days_Occupied` int(7));


DROP VIEW IF EXISTS `no_15a`;
CREATE TABLE `no_15a` (`Department_Location` varchar(50), `Total_Department` bigint(21));


DROP VIEW IF EXISTS `no_15b`;
CREATE TABLE `no_15b` (`Department_Location` varchar(50), `Total_Department` bigint(21));


DROP VIEW IF EXISTS `no_2`;
CREATE TABLE `no_2` (`Banyak_Employee` bigint(21));


DROP VIEW IF EXISTS `no_3`;
CREATE TABLE `no_3` (`Banyak_Employee` bigint(21));


DROP VIEW IF EXISTS `no_4`;
CREATE TABLE `no_4` (`Banyak_Project` bigint(21));


DROP VIEW IF EXISTS `no_5`;
CREATE TABLE `no_5` (`Department_Number` int(15), `Department_Name` varchar(50), `Total_Salary` double, `Average_Salary` double);


DROP VIEW IF EXISTS `no_6`;
CREATE TABLE `no_6` (`Department_Number` int(15), `Department_Name` varchar(50), `Total_Employee` bigint(21));


DROP VIEW IF EXISTS `no_7`;
CREATE TABLE `no_7` (`SSN` int(11), `First_Name` varchar(20), `Middle_Name` varchar(20), `Last_Name` varchar(20), `Total_Hours` decimal(32,0));


DROP VIEW IF EXISTS `no_8`;
CREATE TABLE `no_8` (`SSN` int(11), `First_Name` varchar(20), `Middle_Name` varchar(20), `Last_Name` varchar(20), `Total_Hours` decimal(32,0));


DROP VIEW IF EXISTS `no_9`;
CREATE TABLE `no_9` (`SSN` int(11), `First_Name` varchar(20), `Middle_Name` varchar(20), `Last_Name` varchar(20), `Total_Hours` decimal(32,0), `Percent_Bonus` int(2));


DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `Project_Number` int(11) NOT NULL AUTO_INCREMENT,
  `Project_Name` varchar(50) NOT NULL,
  `Project_Location` varchar(50) NOT NULL,
  `Department_Number` int(15) NOT NULL,
  PRIMARY KEY (`Project_Number`),
  KEY `Department_Number` (`Department_Number`),
  CONSTRAINT `project_ibfk_2` FOREIGN KEY (`Department_Number`) REFERENCES `department` (`Department_Number`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `project` (`Project_Number`, `Project_Name`, `Project_Location`, `Department_Number`) VALUES
(1,	'BFI Tech Development Program',	'Anywhere',	1),
(2,	'BFI Vlog',	'Anywhere',	1),
(3,	'Technotalk',	'Jakarta',	4),
(4,	'Infotalk',	'Jakarta',	3),
(5,	'Rekreasi Kantor',	'Bali',	1),
(6,	'Design Planning Bootcamp',	'Anywhere',	6);

DROP TABLE IF EXISTS `works_on`;
CREATE TABLE `works_on` (
  `SSN` int(11) NOT NULL,
  `Project_Number` int(11) NOT NULL,
  `Hours` int(11) NOT NULL,
  KEY `SSN` (`SSN`),
  KEY `Project_Number` (`Project_Number`),
  CONSTRAINT `works_on_ibfk_4` FOREIGN KEY (`SSN`) REFERENCES `employee` (`SSN`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `works_on_ibfk_5` FOREIGN KEY (`Project_Number`) REFERENCES `project` (`Project_Number`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `works_on` (`SSN`, `Project_Number`, `Hours`) VALUES
(11,	1,	210),
(1,	1,	210),
(3,	1,	210),
(9,	1,	210),
(15,	1,	210),
(11,	2,	10),
(12,	3,	20),
(6,	3,	20),
(3,	4,	20),
(11,	5,	50),
(2,	5,	50),
(4,	5,	50),
(12,	5,	50),
(5,	5,	50),
(14,	5,	50),
(10,	5,	50),
(8,	5,	50),
(14,	6,	40);

DROP TABLE IF EXISTS `no_1`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_1` AS select `employee`.`First_Name` AS `First_Name`,`employee`.`Middle_Name` AS `Middle_Name`,`employee`.`Last_Name` AS `Last_Name`,`dependent`.`Dependent_Name` AS `Dependent_Name`,`dependent`.`Relationship` AS `Relationship` from (`employee` join `dependent`) where `employee`.`First_Name` like 'R%';

DROP TABLE IF EXISTS `no_10`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_10` AS select `a`.`SSN` AS `SSN`,`a`.`First_Name` AS `First_Name`,`a`.`Middle_Name` AS `Middle_Name`,`a`.`Last_Name` AS `Last_Name`,count(`b`.`SSN`) AS `Total_Project` from (`employee` `a` join `works_on` `b`) where `a`.`SSN` = `b`.`SSN` group by `a`.`SSN` order by count(`b`.`SSN`) desc;

DROP TABLE IF EXISTS `no_11`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_11` AS select `no_10`.`SSN` AS `SSN`,`no_10`.`First_Name` AS `First_Name`,`no_10`.`Middle_Name` AS `Middle_Name`,`no_10`.`Last_Name` AS `Last_Name`,`no_10`.`Total_Project` AS `Total_Project` from `no_10` where `no_10`.`Total_Project` = 4;

DROP TABLE IF EXISTS `no_12`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_12` AS select `a`.`SSN` AS `SSN`,`a`.`First_Name` AS `First_Name`,`a`.`Middle_Name` AS `Middle_Name`,`a`.`Last_Name` AS `Last_Name`,`a`.`Total_Hours` AS `Total_Hours`,`b`.`Total_Project` AS `Total_Project` from (`no_7` `a` join `no_10` `b`) where `a`.`SSN` = `b`.`SSN` and `a`.`Total_Hours` = 70 and `b`.`Total_Project` = 2;

DROP TABLE IF EXISTS `no_13`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_13` AS select `a`.`SSN` AS `SSN`,`a`.`First_Name` AS `First_Name`,`a`.`Middle_Name` AS `Middle_Name`,`a`.`Last_Name` AS `Last_Name`,count(`b`.`SSN`) AS `Total_Dependent` from (`employee` `a` join `dependent` `b`) where `a`.`SSN` = `b`.`SSN` group by `a`.`SSN`;

DROP TABLE IF EXISTS `no_14`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_14` AS select `a`.`Department_Number` AS `Department_Number`,`a`.`Department_Name` AS `Department_Name`,`b`.`SSN` AS `SSN`,`c`.`First_Name` AS `First_Name`,`c`.`Middle_Name` AS `Middle_Name`,`c`.`Last_Name` AS `Last_Name`,to_days('2022-06-23') - to_days(`a`.`Manager_Startdate`) AS `Days_Occupied` from ((`department` `a` join `manager` `b`) join `employee` `c`) where `a`.`Department_Number` = `b`.`Department_Number` and `b`.`SSN` = `c`.`SSN`;

DROP TABLE IF EXISTS `no_15a`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_15a` AS select `dept_location`.`Department_Location` AS `Department_Location`,count(`dept_location`.`Department_Location`) AS `Total_Department` from `dept_location` group by `dept_location`.`Department_Location`;

DROP TABLE IF EXISTS `no_15b`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_15b` AS select `no_15a`.`Department_Location` AS `Department_Location`,`no_15a`.`Total_Department` AS `Total_Department` from `no_15a` where `no_15a`.`Total_Department` > 1;

DROP TABLE IF EXISTS `no_2`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_2` AS select count(`works_on`.`Project_Number`) AS `Banyak_Employee` from `works_on` where `works_on`.`Project_Number` = 1;

DROP TABLE IF EXISTS `no_3`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_3` AS select count(`employee`.`Salary`) AS `Banyak_Employee` from `employee` where `employee`.`Salary` > 3500000;

DROP TABLE IF EXISTS `no_4`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_4` AS select count(`project`.`Department_Number`) AS `Banyak_Project` from `project` where `project`.`Department_Number` = 2;

DROP TABLE IF EXISTS `no_5`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_5` AS select `a`.`Department_Number` AS `Department_Number`,`a`.`Department_Name` AS `Department_Name`,sum(`b`.`Salary`) AS `Total_Salary`,avg(`b`.`Salary`) AS `Average_Salary` from (`department` `a` join `employee` `b`) where `a`.`Department_Number` = `b`.`Department_Number` group by `a`.`Department_Number`;

DROP TABLE IF EXISTS `no_6`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_6` AS select `a`.`Department_Number` AS `Department_Number`,`a`.`Department_Name` AS `Department_Name`,count(`b`.`Department_Number`) AS `Total_Employee` from (`department` `a` join `employee` `b`) where `a`.`Department_Number` = `b`.`Department_Number` group by `a`.`Department_Number` order by count(`b`.`Department_Number`) desc;

DROP TABLE IF EXISTS `no_7`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_7` AS select `a`.`SSN` AS `SSN`,`a`.`First_Name` AS `First_Name`,`a`.`Middle_Name` AS `Middle_Name`,`a`.`Last_Name` AS `Last_Name`,sum(`b`.`Hours`) AS `Total_Hours` from (`employee` `a` join `works_on` `b`) where `a`.`SSN` = `b`.`SSN` group by `a`.`SSN`;

DROP TABLE IF EXISTS `no_8`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_8` AS select `no_7`.`SSN` AS `SSN`,`no_7`.`First_Name` AS `First_Name`,`no_7`.`Middle_Name` AS `Middle_Name`,`no_7`.`Last_Name` AS `Last_Name`,`no_7`.`Total_Hours` AS `Total_Hours` from `no_7` where `no_7`.`Total_Hours` > 140 order by `no_7`.`Total_Hours` desc;

DROP TABLE IF EXISTS `no_9`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `no_9` AS select `no_7`.`SSN` AS `SSN`,`no_7`.`First_Name` AS `First_Name`,`no_7`.`Middle_Name` AS `Middle_Name`,`no_7`.`Last_Name` AS `Last_Name`,`no_7`.`Total_Hours` AS `Total_Hours`,if(`no_7`.`Total_Hours` >= 200,50,if(`no_7`.`Total_Hours` >= 150,25,10)) AS `Percent_Bonus` from `no_7`;

-- 2022-06-24 00:13:14
