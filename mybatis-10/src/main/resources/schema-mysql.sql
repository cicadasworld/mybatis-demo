CREATE DATABASE IF NOT EXISTS `smbms`;
USE `smbms`;

CREATE TABLE IF NOT EXISTS `smbms_bill`(
	`id` INT(20) NOT NULL,
    `billCode` VARCHAR(30) DEFAULT NULL,
    `productName` VARCHAR(30) DEFAULT NULL,
    `productDesc` VARCHAR(30) DEFAULT NULL,
    `productUnit` VARCHAR(30) DEFAULT NULL,
    `productCount` DECIMAL DEFAULT NULL,
    `totalPrice` DECIMAL DEFAULT NULL,
    `isPayment` INT(20) DEFAULT NULL,
    `createdBy` INT(20) DEFAULT NULL,
    `creationDate` DATETIME DEFAULT NULL,
    `modifyBy` INT(20) DEFAULT NULL,
    `modifyDate` DATETIME DEFAULT NULL,
    `providerId` INT(20) DEFAULT NULL,
    PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `smbms_provider`(
	`id` INT(20) NOT NULL,
    `proCode` VARCHAR(30) DEFAULT NULL,
    `proName` VARCHAR(30) DEFAULT NULL,
    `proDesc` VARCHAR(30) DEFAULT NULL,
    `proContact` VARCHAR(30) DEFAULT NULL,
    `proPhone` DECIMAL DEFAULT NULL,
    `proAddress` DECIMAL DEFAULT NULL,
    `proFax` INT(20) DEFAULT NULL,
    `createdBy` INT(20) DEFAULT NULL,
    `creationDate` DATETIME DEFAULT NULL,
    `modifyDate` DATETIME DEFAULT NULL,
    `modifyBy` INT(20) DEFAULT NULL,
    PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `smbms_user`(
	`id` INT(20) NOT NULL,
    `userCode` VARCHAR(30) DEFAULT NULL,
    `userName` VARCHAR(30) DEFAULT NULL,
    `userPassword` VARCHAR(30) DEFAULT NULL,
    `gender` INT(20) DEFAULT NULL,
    `birthday` DATETIME DEFAULT NULL,
    `phone` VARCHAR(30) DEFAULT NULL,
    `address` VARCHAR(30) DEFAULT NULL,
    `userRole` INT(20) DEFAULT NULL,
    `createdBy` INT(20) DEFAULT NULL,
    `createDate` DATETIME DEFAULT NULL,
    `modifyBy` INT(20) DEFAULT NULL,
    `modifyDate` DATETIME DEFAULT NULL,
    PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `smbms_role`(
	`id` INT(20) NOT NULL,
    `roleCode` VARCHAR(30) DEFAULT NULL,
    `roleName` VARCHAR(30) DEFAULT NULL,
    `createdBy` DATETIME DEFAULT NULL,
    `createDate` DATETIME DEFAULT NULL,
    `modifyBy` INT(20) DEFAULT NULL,
    `modifyDate` DATETIME DEFAULT NULL,
    PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
