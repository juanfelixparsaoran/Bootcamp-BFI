-- Adminer 4.8.1 MySQL 10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `gaji`;
CREATE TABLE `gaji` (
  `id_gaji` int(11) NOT NULL AUTO_INCREMENT,
  `id_pegawai` int(11) NOT NULL,
  `gaji` int(11) NOT NULL,
  `tgl_gaji` date NOT NULL,
  PRIMARY KEY (`id_gaji`),
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `gaji_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `gaji` (`id_gaji`, `id_pegawai`, `gaji`, `tgl_gaji`) VALUES
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

DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id_menu` int(11) NOT NULL AUTO_INCREMENT,
  `nama_menu` varchar(255) NOT NULL,
  `jenis` varchar(255) NOT NULL,
  `harga` int(12) NOT NULL,
  PRIMARY KEY (`id_menu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `menu` (`id_menu`, `nama_menu`, `jenis`, `harga`) VALUES
(111,	'es cendol',	'beverage',	3000),
(112,	'es buah',	'beverage',	15000),
(113,	'fish ball soup',	'western food',	50000),
(114,	'indomie',	'indonesian food',	50000),
(115,	'sirloin steak',	'western food',	50000),
(116,	'sushi',	'japannese food',	50000),
(117,	'nasi goreng',	'indonesian food',	50000),
(118,	'ketoprak',	'indonesian food',	50000),
(119,	'gado gado',	'indonesian food',	50000),
(120,	'mie ayam',	'indonesian food',	50000);

DROP TABLE IF EXISTS `pegawai`;
CREATE TABLE `pegawai` (
  `id_pegawai` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pegawai` varchar(255) NOT NULL,
  `jenis_kelamin` enum('male','female') NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `status` varchar(255) NOT NULL,
  `no_telp` varchar(255) NOT NULL,
  `jabatan` varchar(255) NOT NULL,
  PRIMARY KEY (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `pegawai` (`id_pegawai`, `nama_pegawai`, `jenis_kelamin`, `alamat`, `tgl_lahir`, `status`, `no_telp`, `jabatan`) VALUES
(1,	'sanji',	'male',	'jakarta',	'1992-10-14',	'lajang',	'32234',	'chef'),
(2,	'zoro',	'male',	'medan',	'1992-04-13',	'menikah',	'23749',	'cleaning service'),
(3,	'chopper',	'male',	'bandung',	'1989-05-09',	'lajang',	'89764',	'doctor'),
(4,	'luffy',	'male',	'papua',	'1990-03-05',	'lajang',	'29537',	'ceo'),
(5,	'nami',	'female',	'tanggerang',	'1989-01-02',	'lajang',	'12341',	'branch manager'),
(6,	'usop',	'male',	'jambi',	'1989-01-09',	'lajang',	'64528',	'assistant manager'),
(7,	'brook',	'male',	'semarang',	'1820-12-05',	'lajang',	'72348',	'sales manager'),
(8,	'franky',	'male',	'jogja',	'1999-09-13',	'lajang',	'12343',	'technical architect'),
(9,	'jinbe',	'male',	'banjarmasin',	'1899-09-09',	'menikah',	'88773',	'marketing manager'),
(10,	'robin',	'female',	'kendari',	'2001-10-07',	'lajang',	'2342',	'hrd manager');

DROP TABLE IF EXISTS `pembeli`;
CREATE TABLE `pembeli` (
  `id_pembeli` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `jenis_kelamin` enum('P,L') NOT NULL,
  `status` varchar(255) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `no_tlp` varchar(255) NOT NULL,
  `pekerjaan` varchar(255) NOT NULL,
  PRIMARY KEY (`id_pembeli`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `pembeli` (`id_pembeli`, `nama`, `alamat`, `jenis_kelamin`, `status`, `tgl_lahir`, `no_tlp`, `pekerjaan`) VALUES
(211,	'wiwit',	'bengkulu',	'',	'1983-03-01',	'0000-00-00',	'567890',	'apoteker'),
(212,	'ayu',	'malang',	'',	'1982-06-10',	'0000-00-00',	'123424',	'dosen'),
(213,	'nengsih',	'solo',	'',	'1981-05-01',	'0000-00-00',	'46784',	'asisten'),
(214,	'mamat',	'austria',	'',	'1980-03-12',	'0000-00-00',	'47892',	'analis'),
(215,	'cecep',	'bengkulu',	'',	'1979-01-01',	'0000-00-00',	'134245',	'kontraktor'),
(216,	'adam',	'lombok',	'',	'1978-02-02',	'0000-00-00',	'769053',	'analis'),
(217,	'vivi',	'bali',	'',	'1999-02-09',	'0000-00-00',	'56225',	'programmer'),
(218,	'violet',	'palembang',	'',	'1998-07-03',	'0000-00-00',	'57823',	'perawat'),
(219,	'rebecca',	'papua',	'',	'2001-08-10',	'0000-00-00',	'13456',	'dokter'),
(220,	'kureha',	'bengkulu',	'',	'1800-08-11',	'0000-00-00',	'83456',	'dokter');

DROP TABLE IF EXISTS `transaksi`;
CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `id_pembeli` int(11) NOT NULL,
  `id_menu` int(11) NOT NULL,
  `id_pegawai` int(11) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  PRIMARY KEY (`id_transaksi`),
  KEY `id_pegawai` (`id_pegawai`),
  KEY `id_pembeli` (`id_pembeli`),
  KEY `id_menu` (`id_menu`),
  CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`),
  CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`id_pembeli`) REFERENCES `pembeli` (`id_pembeli`),
  CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`id_menu`) REFERENCES `menu` (`id_menu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `transaksi` (`id_transaksi`, `id_pembeli`, `id_menu`, `id_pegawai`, `tgl_transaksi`) VALUES
(1001,	211,	111,	9,	'2012-09-09'),
(1002,	211,	112,	9,	'2012-11-08'),
(1003,	212,	113,	10,	'2012-11-10'),
(1004,	213,	114,	10,	'2012-11-28'),
(1005,	213,	115,	9,	'2012-11-28'),
(1006,	214,	116,	9,	'2012-11-29'),
(1007,	215,	117,	10,	'2012-12-08'),
(1008,	216,	118,	9,	'2012-12-08'),
(1009,	217,	119,	9,	'2012-12-18'),
(1010,	218,	119,	9,	'2012-12-18'),
(1011,	219,	120,	10,	'2012-12-28'),
(1012,	220,	120,	10,	'2012-12-29');

-- 2022-06-22 01:38:07