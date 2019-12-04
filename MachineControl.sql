-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Dec 04, 2019 at 02:49 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `MachineMaintenance`
--

-- --------------------------------------------------------

--
-- Table structure for table `Engineers`
--

CREATE TABLE `Engineers` (
  `engineerID` int(11) NOT NULL,
  `engineerName` varchar(255) DEFAULT NULL,
  `engineerRate` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Machines`
--

CREATE TABLE `Machines` (
  `machineID` int(11) NOT NULL,
  `machineName` varchar(255) NOT NULL,
  `machineDescription` varchar(255) DEFAULT NULL,
  `purchaseDate` date DEFAULT NULL,
  `isActive` tinyint(1) DEFAULT NULL,
  `serviceFrequency` int(2) DEFAULT NULL,
  `flagSeverity` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Services`
--

CREATE TABLE `Services` (
  `serviceID` int(11) NOT NULL,
  `machineID` int(11) NOT NULL,
  `engineerID` int(11) NOT NULL,
  `serviceDate` date DEFAULT NULL,
  `serviceComments` varchar(255) DEFAULT NULL,
  `dayOfService` varchar(20) DEFAULT NULL,
  `serviceDueDate` date DEFAULT NULL,
  `timeSpentOnService` time DEFAULT NULL,
  `ItemsUsed` varchar(255) DEFAULT NULL,
  `wasCritical` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Engineers`
--
ALTER TABLE `Engineers`
  ADD PRIMARY KEY (`engineerID`);

--
-- Indexes for table `Machines`
--
ALTER TABLE `Machines`
  ADD PRIMARY KEY (`machineID`);

--
-- Indexes for table `Services`
--
ALTER TABLE `Services`
  ADD PRIMARY KEY (`serviceID`),
  ADD KEY `machineID` (`machineID`),
  ADD KEY `engineerID` (`engineerID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Engineers`
--
ALTER TABLE `Engineers`
  MODIFY `engineerID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Machines`
--
ALTER TABLE `Machines`
  MODIFY `machineID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `Services`
--
ALTER TABLE `Services`
  MODIFY `serviceID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Services`
--
ALTER TABLE `Services`
  ADD CONSTRAINT `services_ibfk_1` FOREIGN KEY (`machineID`) REFERENCES `Machines` (`machineID`),
  ADD CONSTRAINT `services_ibfk_2` FOREIGN KEY (`engineerID`) REFERENCES `Engineers` (`engineerID`);