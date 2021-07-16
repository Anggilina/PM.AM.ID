-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 26, 2020 at 07:33 PM
-- Server version: 5.5.28
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pm_am_id`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `nama_akunA` varchar(35) NOT NULL,
  `email` varchar(35) NOT NULL,
  `kata_sandi` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`nama_akunA`, `email`, `kata_sandi`) VALUES
('anggilina', 'anggilina@gmail.com', '1234567890'),
('devi_yanti', 'devi@gmail.com', '12345678'),
('yenny_d', 'yenny@gmail.com', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `konfirmasi`
--

CREATE TABLE `konfirmasi` (
  `id_konfirmasi` int(255) NOT NULL,
  `nama_akunM` varchar(35) DEFAULT NULL,
  `nama_akunA` varchar(35) DEFAULT NULL,
  `pertanyaan` varchar(800) NOT NULL,
  `jawaban` varchar(800) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `konfirmasi`
--

INSERT INTO `konfirmasi` (`id_konfirmasi`, `nama_akunM`, `nama_akunA`, `pertanyaan`, `jawaban`) VALUES
(1, 'lina1', 'anggilina', 'null', 'PM.AM.ID berada di Jalan Serayu Pekanbaru tepatnya di Moustache Barbershop Pekanbaru.'),
(3, 'lina1', NULL, 'Kapan PM.AM.ID buka?', 'PM.AM.ID buka mulai pukul 10:00 hingga 21:00 WIB.'),
(4, 'lina1', NULL, 'Apakah tersedia Wifi Gratis?', 'Kami menyediakan layanan wifi gratis bagi smeua pelanggan selama PM.AM.ID buka.'),
(5, 'lina1', 'anggilina', 'Dimana kami membeli kopi?', 'Kopi yang digunakan pada coffe shop kami adalah kopi local terbaik yang kami pilih dan olah dengan hati hati agar tidak menghilangkan cita rasa nya.'),
(7, 'lina1', NULL, 'Bagaimana cara memesan?', ' Saat anda mengunjungi halaman beranda kami, anda dapat melakukan login untuk melakukan pemesanan. Lalu dapat menuju halaman Minuman untuk memilih produk.'),
(8, 'lina1', NULL, 'Bisakah saya memesan produk yang terjual habis?', 'Sayangnya tidak bisa, Anda tidak dapat memesan item yang terjual habis. Anda harus menunggu sampai barang yang anda inginkan tersedia kembali.'),
(9, 'devi', 'anggilina', 'Bagaimana Konfirmasi pesanan saya?', 'Setelah pesanan anda terdaftar, staff kami akan menghubungi anda untuk konfirmasi sebelum pesanan dibuat.'),
(10, 'lina97', 'anggilina', 'Kapan saya harus menjemput Pesanan?', 'Pesanan dapat dijemput 15-20 menit setelah konfirmasi pesanan oleh staff kami.');

-- --------------------------------------------------------

--
-- Stand-in structure for view `max_pesan`
-- (See below for the actual view)
--
CREATE TABLE `max_pesan` (
`nama_akunM` varchar(35)
,`email` varchar(35)
,`jenis_kelamin` varchar(1)
,`no_hp` varchar(25)
,`kata_sandi` varchar(35)
);

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `nama_akunM` varchar(35) NOT NULL,
  `email` varchar(35) NOT NULL,
  `jenis_kelamin` varchar(1) NOT NULL,
  `no_hp` varchar(25) NOT NULL,
  `kata_sandi` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`nama_akunM`, `email`, `jenis_kelamin`, `no_hp`, `kata_sandi`) VALUES
('devi', 'devi@gmail.com', 'P', '085278290902', 'devi12345678'),
('lina1', 'lina@gmail.com', 'P', '0367893883', '1234567'),
('lina97', 'lina97@gmail.com', 'P', '0378939837', '1234567898'),
('yenny', 'yenny@gmail.com', 'P', '0814637489492', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `minuman`
--

CREATE TABLE `minuman` (
  `id_minuman` varchar(11) NOT NULL,
  `nama_minuman` varchar(35) NOT NULL,
  `gambar_minuman` varchar(225) NOT NULL,
  `harga` int(255) NOT NULL,
  `descripsi` varchar(255) NOT NULL,
  `status` varchar(29) NOT NULL,
  `jenis_minuman` varchar(29) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `minuman`
--

INSERT INTO `minuman` (`id_minuman`, `nama_minuman`, `gambar_minuman`, `harga`, `descripsi`, `status`, `jenis_minuman`) VALUES
('M001', 'Mix Lemonade', 'gambar14.jpg', 22000, 'Dibuat dari perasan air lemon segar dengan tambahan garam laut yang dapat membangkitkan kesegaran anda.', 'Tersedia', 'Yang Terbaru'),
('M003', 'Matcho Latte', 'gambar9.jpg', 25000, 'Dibuat dengan pencampuran antara matcha coklat dengan latte dilengkapi dengan topping susu coklat.', 'Tersedia', 'Yang Terbaru'),
('M004', 'Avocado Coffee', 'gambar11.jpg', 22000, 'Dibuat dengan kombinasi dari buah apulkat dengan kopi dilengkapi dengan topping susu coklat.', 'Tersedia', 'Yang Terbaru'),
('M005', 'Creamy Oreo', 'gambar15.jpg', 30000, 'Dibuat dari susu dengan kombinasi bubuk biskut oreo yang disertai topping ice cream dan biskut oreo.', 'Tersedia', 'Yang Terlaku'),
('M006', 'Matcha Soi', 'gambar13.jpg', 30000, 'Dibuat dari teh matcha yaitu berupa green tea yang dipadu dengan susu kental manis.', 'Tidak Tersedia', 'Yang Terlaku'),
('M007', 'Brown sugar', 'gambar18.jpg', 28000, 'Dibuat dari gula merah yang dipadu dengan susu dilengkapi dengan topping bubble.', 'Tersedia', 'Yang Terlaku'),
('M008', 'Avocado Latte', 'gambar16.jpg', 25000, 'Dibuat dari percampuran antara alpukat dengan latte dilengkapi dengan topping  susu.', 'Tersedia', 'Yang Terlaku'),
('M009', 'Taro Latte', 'gambar10.jpg', 22000, 'Dibuat dari percampuran antara taro dengan latte dilengkapi dengan topping  susu.', 'Tidak Tersedia', 'Yang Terlaku'),
('M010', 'Chocolate Latte', 'gambar12.jpg', 25000, 'Dibuat dengan pencampuran antara latte dan coklat dilengkapi dengan topping susu coklat.', 'Tersedia', 'Yang Terlaku'),
('M011', 'ube coffee', 'gambar7.PNG', 25000, 'Dibuat dengan pencampuran antara kopi dan susu dilengkapi dengan topping biskuit.', 'Tidak Tersedia', 'Yang Terlaku'),
('M012', 'Chorcoal Latte ', 'gambar17.jpg', 22000, 'Dibuat dengan pencampuran antara charcoal dengan latte dengan tambahan susu manis.', 'Tersedia', 'Yang Terpopuler'),
('M013', 'Cookies and Cream', 'gambar1.jpg', 30000, 'Dibuat dengan pencampuran antara bubuk biskut beng-beng dengan creamy dengan topping biskuit beng-beng.', 'Tersedia', 'Yang Terpopuler'),
('M014', 'Creamy Choco', 'gambar4.PNG', 30000, 'Dibuat dengan pencampuran antara bubuk choco dan creamy dengan topping corn.', 'Tidak Tersedia', 'Yang Terpopuler'),
('M015', 'Chorcoal Lemonade ', 'gambar3.jpg', 30000, 'Dibuat dengan perpaduan charcoal dengan perasan air lemon dengan topping buah lemon.', 'Tidak Tersedia', 'Yang Terpopuler'),
('M016', 'Red Velvet', 'gambar5.PNG', 20000, 'Dibuat dengan dari bubuk red velvet dengan campuran air soda.', 'Tersedia', 'Yang Terpopuler'),
('M017', 'Creamy Green', 'gambar19.PNG', 30000, 'Dibuat dari creamy dengan campuran matcha green tea dengan topping corn dan biskuit.', 'Tersedia', 'Yang Terpopuler'),
('M018', 'Creamy Mix Two', 'gambar6.PNG', 30000, 'Dibuat dari creamy dengan campuran bubuk coklat dengan tambahan biskuit oreo.', 'Tersedia', 'Yang Terpopuler'),
('M020', 'Kopi', 'gambar6.PNG', 80000, 'kopi yang dibuat dari moakjdh', 'Tersedia', 'Yang Terpopuler'),
('M021', 'g', 'c2.jpg', 100000, 'hjkjl', 'Tersedia', 'Yang Terlaku');

-- --------------------------------------------------------

--
-- Stand-in structure for view `min_pesan`
-- (See below for the actual view)
--
CREATE TABLE `min_pesan` (
`nama_akunM` varchar(35)
,`email` varchar(35)
,`jenis_kelamin` varchar(1)
,`no_hp` varchar(25)
,`kata_sandi` varchar(35)
);

-- --------------------------------------------------------

--
-- Table structure for table `pesan`
--

CREATE TABLE `pesan` (
  `id_pesan` int(225) NOT NULL,
  `nama_akunM` varchar(35) NOT NULL,
  `id_minuman` varchar(11) NOT NULL,
  `jam_pengambilan` varchar(60) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `jumlah` int(225) NOT NULL,
  `total` int(255) NOT NULL,
  `keterangan` varchar(225) DEFAULT NULL,
  `status` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pesan`
--

INSERT INTO `pesan` (`id_pesan`, `nama_akunM`, `id_minuman`, `jam_pengambilan`, `tanggal`, `jumlah`, `total`, `keterangan`, `status`) VALUES
(11, 'lina1', 'M003', '00:00 ', '2020-01-26', 1, 25000, '', 'selesai'),
(12, 'lina1', 'M005', '00:00 ', '2020-01-26', 2, 60000, 'banyak coklat', 'proses');

-- --------------------------------------------------------

--
-- Table structure for table `tentang`
--

CREATE TABLE `tentang` (
  `id_pemilik` int(11) NOT NULL,
  `pemilik` varchar(35) NOT NULL,
  `lokasi` varchar(50) NOT NULL,
  `hari_buka` varchar(29) NOT NULL,
  `jam_oprasional` varchar(29) NOT NULL,
  `jam_tutup` varchar(29) NOT NULL,
  `deskripsi` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tentang`
--

INSERT INTO `tentang` (`id_pemilik`, `pemilik`, `lokasi`, `hari_buka`, `jam_oprasional`, `jam_tutup`, `deskripsi`) VALUES
(1, 'Jimmy', 'Jl. Serayu No. 55, Pekanbaru', 'Senin s/d Minggu', '10:00', '21:00', 'Coffe Shop PM.AM.ID sebuah website yang melayani penjualan berbagai jenis minuman kopi yang dikelompokan berdasarkan kategori. Pada website ini di tampilkan berbagai pilihan minuman kopi berdasarkan kategori minuman kopi terbaru, minuman kopi terlaku dan minuman kopi terpopuler.');

-- --------------------------------------------------------

--
-- Structure for view `max_pesan`
--
DROP TABLE IF EXISTS `max_pesan`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `max_pesan`  AS  select `m`.`nama_akunM` AS `nama_akunM`,`m`.`email` AS `email`,`m`.`jenis_kelamin` AS `jenis_kelamin`,`m`.`no_hp` AS `no_hp`,`m`.`kata_sandi` AS `kata_sandi` from `member` `m` where `m`.`nama_akunM` in (select `p`.`nama_akunM` from `pesan` `p` where (`p`.`tanggal` = (select max(`p2`.`tanggal`) from `pesan` `p2`))) ;

-- --------------------------------------------------------

--
-- Structure for view `min_pesan`
--
DROP TABLE IF EXISTS `min_pesan`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `min_pesan`  AS  select `m`.`nama_akunM` AS `nama_akunM`,`m`.`email` AS `email`,`m`.`jenis_kelamin` AS `jenis_kelamin`,`m`.`no_hp` AS `no_hp`,`m`.`kata_sandi` AS `kata_sandi` from `member` `m` where `m`.`nama_akunM` in (select `p`.`nama_akunM` from `pesan` `p` where (`p`.`tanggal` = (select min(`p2`.`tanggal`) from `pesan` `p2`))) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`nama_akunA`);

--
-- Indexes for table `konfirmasi`
--
ALTER TABLE `konfirmasi`
  ADD PRIMARY KEY (`id_konfirmasi`),
  ADD KEY `nama_akunM1` (`nama_akunM`),
  ADD KEY `nama_akunA2` (`nama_akunA`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`nama_akunM`);

--
-- Indexes for table `minuman`
--
ALTER TABLE `minuman`
  ADD PRIMARY KEY (`id_minuman`);

--
-- Indexes for table `pesan`
--
ALTER TABLE `pesan`
  ADD PRIMARY KEY (`id_pesan`),
  ADD KEY `nama_akunM` (`nama_akunM`),
  ADD KEY `id_minuman` (`id_minuman`);

--
-- Indexes for table `tentang`
--
ALTER TABLE `tentang`
  ADD PRIMARY KEY (`id_pemilik`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `konfirmasi`
--
ALTER TABLE `konfirmasi`
  MODIFY `id_konfirmasi` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `pesan`
--
ALTER TABLE `pesan`
  MODIFY `id_pesan` int(225) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `tentang`
--
ALTER TABLE `tentang`
  MODIFY `id_pemilik` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `konfirmasi`
--
ALTER TABLE `konfirmasi`
  ADD CONSTRAINT `nama_akunA2` FOREIGN KEY (`nama_akunA`) REFERENCES `admin` (`nama_akunA`),
  ADD CONSTRAINT `nama_akunM1` FOREIGN KEY (`nama_akunM`) REFERENCES `member` (`nama_akunM`);

--
-- Constraints for table `pesan`
--
ALTER TABLE `pesan`
  ADD CONSTRAINT `id_minuman` FOREIGN KEY (`id_minuman`) REFERENCES `minuman` (`id_minuman`),
  ADD CONSTRAINT `nama_akunM` FOREIGN KEY (`nama_akunM`) REFERENCES `member` (`nama_akunM`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
