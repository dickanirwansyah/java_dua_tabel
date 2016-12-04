-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema java_dua
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `java_dua` ;

-- -----------------------------------------------------
-- Schema java_dua
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `java_dua` DEFAULT CHARACTER SET utf8 ;
USE `java_dua` ;

-- -----------------------------------------------------
-- Table `java_dua`.`kategori`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java_dua`.`kategori` ;

CREATE TABLE IF NOT EXISTS `java_dua`.`kategori` (
  `kd_kategori` INT NOT NULL AUTO_INCREMENT,
  `kategori` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`kd_kategori`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java_dua`.`barang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java_dua`.`barang` ;

CREATE TABLE IF NOT EXISTS `java_dua`.`barang` (
  `kd_barang` INT NOT NULL AUTO_INCREMENT,
  `nama` VARCHAR(45) NOT NULL,
  `kd_kategori` INT NOT NULL,
  PRIMARY KEY (`kd_barang`),
  INDEX `fk_barang_kategori_idx` (`kd_kategori` ASC),
  CONSTRAINT `fk_barang_kategori`
    FOREIGN KEY (`kd_kategori`)
    REFERENCES `java_dua`.`kategori` (`kd_kategori`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
