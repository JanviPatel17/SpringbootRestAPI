-- -----------------------------------------------------
-- Schema spring-boot-restaurant
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `spring-boot-restaurant`;

CREATE SCHEMA `spring-boot-restaurant`;
USE `spring-boot-restaurant` ;

-- -----------------------------------------------------
-- Table `spring-boot-restaurant`.`restaurant`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spring-boot-restaurant`.`restaurant` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) DEFAULT NULL,
  `cuisine` VARCHAR(255) DEFAULT NULL,
  `star` INT(5) DEFAULT NULL,
  `phone` BIGINT(10) DEFAULT NULL,
  `address` VARCHAR(255) DEFAULT NULL,
  `image_url` VARCHAR(255) DEFAULT NULL,
  `active` BIT DEFAULT 1,
   `date_created` DATETIME(6) DEFAULT NULL,
  `last_updated` DATETIME(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 
AUTO_INCREMENT = 1;


-- -----------------------------------------------------
-- Add sample data
-- -----------------------------------------------------

INSERT INTO restaurant (name, cuisine, star, phone, address, image_url, active, date_created) VALUES 
('Broken Plate Kitchen & Bar', 'Greek', 4 , 4032259650, '10816 Macleod Trail SE, AB T2J5N8','https://getbento.imgix.net/accounts/609f6bd59bd2d3016fa23ec3755a3331/media/images/logo_resized_white.png?w=1000&fit=max&auto=compress,format&h=1000' ,1, NOW());

INSERT INTO restaurant (name, cuisine, star, phone, address, image_url, active, date_created) VALUES 
('Butcher and the Baker', 'Italian Bakery', 4 , 4032259650, '250 6 Ave SW, Calgary, AB T2P3H7','https://butcherbakeryyc.com/wp-content/uploads/2018/02/bb_logo_black_horizontal-r1.png' ,1, NOW());

INSERT INTO restaurant (name, cuisine, star, phone, address, image_url, active, date_created) VALUES 
('Tubby Dog', 'Japenese', 4 , 4032440694, '103-1022 17 Ave SW, Calgary, AB T2T0A5','https://images.squarespace-cdn.com/content/v1/588b7c15e3df28d363629351/1621618154218-KZW0XWQ57XEWJRDKA3HE/tubby_new_homepage.png?format=1500w' ,1, NOW());

INSERT INTO restaurant (name, cuisine, star, phone, address, image_url, active, date_created) VALUES 
('Lulu Bar', 'Asian', 4 , 4039305707, '510 17 Ave SW, Calgary, AB T2S0B1','https://images.squarespace-cdn.com/content/5bd341fbf4755a2ecec7fb5e/1556161355316-N4BDECGLZQM6VSOYIWJT/lulu_bar_Main_900.png?content-type=image%2Fpng' ,1, NOW());

INSERT INTO restaurant (name, cuisine, star, phone, address, image_url, active, date_created) VALUES 
('La Casa Latina Restaurant', 'Mexican', 4 , 4034754620, '1324 11 Ave SW #101, Calgary, AB T3C0M6','https://static.wixstatic.com/media/0ac5e9_c622f0cbcd07422cab2183f7378e8c2a~mv2.png/v1/fill/w_290,h_100,al_c,q_85,usm_0.66_1.00_0.01/LCL%20logo%20icon_edited_edited.webp' ,1, NOW());

