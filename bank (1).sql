-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 23, 2022 at 01:05 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `zohaibdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE `bank` (
  `Accountno` varchar(11) NOT NULL,
  `Fname` varchar(30) DEFAULT NULL,
  `Lname` varchar(30) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `City` varchar(50) DEFAULT NULL,
  `Pincode` varchar(10) DEFAULT NULL,
  `Mobileno` varchar(10) DEFAULT NULL,
  `Regdate` date DEFAULT NULL,
  `currentstatus` varchar(10) DEFAULT NULL CHECK (`currentstatus` in ('active','close'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bank`
--

INSERT INTO `bank` (`Accountno`, `Fname`, `Lname`, `Gender`, `Address`, `City`, `Pincode`, `Mobileno`, `Regdate`, `currentstatus`) VALUES
('1', 'Zainab', 'Amer', 'female', 'bara', 'HYderabad', '4344', '898765497', '2008-07-16', 'active'),
('100', 'ajay', 'sharma', 'male', 'Sector 10', 'bhopal', '2332', '1212', '2000-12-23', 'active'),
('1000', 'abhay', 'narang', 'male', 'idgah', 'bhopal', '345345', '234', '2000-12-23', 'active'),
('1002', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '3455', '234', '2000-12-23', 'active'),
('10023', 'zia', 'khan', 'female', 'Banjara hilss', 'Mumbai', '46311', '5674392', '2021-11-22', 'active'),
('1003', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '23434', '234', '2000-12-23', 'active'),
('1004', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '2344', '234', '1999-12-23', 'active'),
('1005', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '234', '234', '2003-12-23', 'Close'),
('1006', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '21432', '234', '2004-12-23', 'active'),
('1007', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '234', '234', '2007-12-23', 'active'),
('1008', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '234', '234', '2008-12-23', 'active'),
('1009', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '234', '234', '2009-12-23', 'active'),
('101', 'zohaib ', 'khan', 'male', 'idgah hils', 'Bhopal', '462001', '774593910', '2022-10-17', 'active'),
('1010', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '234', '234', '2011-12-23', 'Close'),
('1011', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '234', '2344', '2012-12-23', 'active'),
('1012', 'ajay', 'narang', 'male', 'bhopal', 'bhopal', '234', '234', '2009-12-23', 'active'),
('102', 'shszeb', 'khan', 'male', 'kohefiza', 'bhopal', '462001', '34455788', '2022-12-02', 'active'),
('1020', 'sara', 'kham', 'male', 'Nyle colony', 'Bhopal', '462001', '9837466128', '2022-12-12', 'active'),
('1023', 'furquan', 'khan', 'male', 'idgah', 'Delho', '32322', '12345', '0199-12-12', 'active'),
('10233', 'Srishti', 'thakur', 'female', 'height', 'Pune', '46323', '8956043', '2019-09-23', 'active'),
('102342', 'Aisha', 'khan', 'female', 'Banjara hilss', 'Pune', '462001', '345674328', '2022-12-22', 'active'),
('103', 'mujeeb', 'khan', 'male', 'idgah hills', 'bhopal', '462001', '8871457899', '2022-10-17', 'active'),
('104', 'ajay', 'nagar', 'male', 'Park hills', 'Mumbai', '6478', '5674036593', '2021-04-23', 'active'),
('105', 'moiz', 'khan', 'male', 'ghar', 'Bhopal', '462001', '7585813486', '2022-03-28', 'active'),
('106', 'vijay', 'sharma', 'male', 'zone 2', 'Dheli', '4537', '353849375', '2021-02-12', 'active'),
('107', 'priya', 'singh', 'female', 'arera hills', 'pune', '0000', '9876543216', '2021-12-22', 'active'),
('108', 'shahzeb', 'khan', 'on', 'Sector 7', 'Delhi', '0000', '7745938910', '2022-12-20', 'Close'),
('109', 'riya', 'sharma', 'on', 'Sector 7', 'Delhi', '0000', '7745938910', '2022-12-20', 'active'),
('110', 'riya', 'sharma', 'on', 'Sector 7', 'Delhi', '0000', '7745938910', '2022-12-20', 'Close'),
('111', 'hasseeb', 'khan', 'on', 'Sector 7', 'Bhopal', '0000', '7745938910', '2022-12-20', 'active'),
('115', 'Iqra', 'khan', 'on', 'Sector 7', 'Delhi', '0000', '7745938910', '2022-12-20', 'active'),
('116', 'haseeb', 'khan', 'male', 'F-01 TEHSEEM APT IDGAH HILLS', 'Bhopal', '462001', '9876543210', '2022-12-21', 'Close'),
('117', 'Maria ', 'George', 'female', 'bridge', 'London', '7662', '98744556', '2022-12-21', 'active'),
('120', 'Peter', 'Parker', 'male', 'Bruklin', 'Queens', '3242', '634262', '1997-12-22', 'active'),
('129171', 'Harry', 'Stark', 'female', 'street 7', 'New York', '24261', '98769352', '2022-12-20', 'active'),
('200', 'Saniya', 'Sharma', 'female', 'kohefiza', 'Indore', '4243', '9845032', '1992-08-21', 'active'),
('2926', 'Rahin', 'khan', 'female', 'PARK hills', 'Kanpur', '4383', '628933', '2007-11-02', 'active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bank`
--
ALTER TABLE `bank`
  ADD PRIMARY KEY (`Accountno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
