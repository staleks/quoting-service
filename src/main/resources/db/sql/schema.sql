SET MODE MySQL;

--
-- Table structure for table `tbl_quoting`
--

DROP TABLE IF EXISTS `tbl_quoting`;

CREATE TABLE `tbl_quoting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `destination_id` bigint(20) NOT NULL,
  `pricing_date` DATE NOT NULL,
  `price` decimal(10, 2) NOT NULL,
  PRIMARY KEY (`id`)
);
