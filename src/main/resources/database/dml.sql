-- MySQL Script generated by MySQL Workbench
-- Wed Oct 12 14:28:08 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema navigators_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema navigators_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `navigators_db` DEFAULT CHARACTER SET utf8 ;
USE `navigators_db` ;

-- -----------------------------------------------------
-- Table `navigators_db`.`navigators`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `navigators_db`.`navigators` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `navigators_db`.`points`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `navigators_db`.`points` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `city` VARCHAR(50) NOT NULL,
  `indx` BIGINT NOT NULL,
  `value` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `index_UNIQUE` (`indx` ASC) VISIBLE,
  UNIQUE INDEX `city_UNIQUE` (`city` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `navigators_db`.`trips`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `navigators_db`.`trips` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `navigator_id` BIGINT UNSIGNED NOT NULL,
  `point_start_id` BIGINT UNSIGNED NOT NULL,
  `point_end_id` BIGINT UNSIGNED NOT NULL,
  `travel_type` ENUM('BUS', 'CAR', 'ON_FOOT') NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_trips_navigators_idx` (`navigator_id` ASC) VISIBLE,
  INDEX `fk_trips_points1_idx` (`point_start_id` ASC) VISIBLE,
  INDEX `fk_trips_points2_idx` (`point_end_id` ASC) VISIBLE,
  CONSTRAINT `fk_trips_navigators`
    FOREIGN KEY (`navigator_id`)
    REFERENCES `navigators_db`.`navigators` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_trips_points1`
    FOREIGN KEY (`point_start_id`)
    REFERENCES `navigators_db`.`points` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_trips_points2`
    FOREIGN KEY (`point_end_id`)
    REFERENCES `navigators_db`.`points` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `navigators_db`.`routes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `navigators_db`.`routes` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `trip_id` BIGINT UNSIGNED NOT NULL,
  `distance` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_routes_trips1_idx` (`trip_id` ASC) VISIBLE,
  CONSTRAINT `fk_routes_trips1`
    FOREIGN KEY (`trip_id`)
    REFERENCES `navigators_db`.`trips` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `navigators_db`.`route_points`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `navigators_db`.`route_points` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `route_id` BIGINT UNSIGNED NOT NULL,
  `point_id` BIGINT UNSIGNED NOT NULL,
  INDEX `fk_routes_has_points_points1_idx` (`point_id` ASC) VISIBLE,
  INDEX `fk_routes_has_points_routes1_idx` (`route_id` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_routes_has_points_routes1`
    FOREIGN KEY (`route_id`)
    REFERENCES `navigators_db`.`routes` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_routes_has_points_points1`
    FOREIGN KEY (`point_id`)
    REFERENCES `navigators_db`.`points` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `navigators_db`.`segments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `navigators_db`.`segments` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `length` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `navigators_db`.`route_segments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `navigators_db`.`route_segments` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `distance_id` BIGINT UNSIGNED NOT NULL,
  `route_id` BIGINT UNSIGNED NOT NULL,
  INDEX `fk_distances_has_routes_routes1_idx` (`route_id` ASC) VISIBLE,
  INDEX `fk_distances_has_routes_distances1_idx` (`distance_id` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_distances_has_routes_distances1`
    FOREIGN KEY (`distance_id`)
    REFERENCES `navigators_db`.`segments` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_distances_has_routes_routes1`
    FOREIGN KEY (`route_id`)
    REFERENCES `navigators_db`.`routes` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `navigators_db`.`segment_points`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `navigators_db`.`segment_points` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `point_id` BIGINT UNSIGNED NOT NULL,
  `segment_id` BIGINT UNSIGNED NOT NULL,
  INDEX `fk_points_has_segments_segments1_idx` (`segment_id` ASC) VISIBLE,
  INDEX `fk_points_has_segments_points1_idx` (`point_id` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_points_has_segments_points1`
    FOREIGN KEY (`point_id`)
    REFERENCES `navigators_db`.`points` (`id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_points_has_segments_segments1`
    FOREIGN KEY (`segment_id`)
    REFERENCES `navigators_db`.`segments` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `navigators_db`.`bus_routes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `navigators_db`.`bus_routes` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `navigators_db`.`bus_route_points`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `navigators_db`.`bus_route_points` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `points_id` BIGINT UNSIGNED NOT NULL,
  `bus_routes_id` BIGINT UNSIGNED NOT NULL,
  INDEX `fk_points_has_bus_routes_bus_routes1_idx` (`bus_routes_id` ASC) VISIBLE,
  INDEX `fk_points_has_bus_routes_points1_idx` (`points_id` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_points_has_bus_routes_points1`
    FOREIGN KEY (`points_id`)
    REFERENCES `navigators_db`.`points` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_points_has_bus_routes_bus_routes1`
    FOREIGN KEY (`bus_routes_id`)
    REFERENCES `navigators_db`.`bus_routes` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
