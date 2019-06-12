CREATE TABLE dispenser (
  id_dispenser INT NOT NULL,
  name VARCHAR(45) NULL,
  address VARCHAR(255) NULL,
  PRIMARY KEY (id_dispenser));

CREATE TABLE ingredient (
  id_ingredient INT NOT NULL,
  name VARCHAR(45) NULL,
  PRIMARY KEY (id_ingredient));

CREATE TABLE supplies (
  id_ingredient INT NOT NULL,
  id_dispenser INT NOT NULL,
  quantity INT NULL,
  PRIMARY KEY (id_ingredient, id_dispenser));

CREATE TABLE product (
  id_product INT NOT NULL,
  name VARCHAR(45) NULL,
  PRIMARY KEY (id_product));

CREATE TABLE recipe (
  id_recipe INT NOT NULL,
  name VARCHAR(45) NULL,
  PRIMARY KEY (id_recipe));

CREATE TABLE recipe_detail (
  id_recipe_dtl INT NOT NULL,
  id_product_fk INT NULL,
  id_ingredient_fk INT NULL,
  quantity INT NULL,
  id_recipe_fk INT NULL,
  PRIMARY KEY (id_recipe_dtl));
