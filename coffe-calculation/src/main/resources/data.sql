INSERT INTO dispenser (id_dispenser, name, address) VALUES ('1', 'dispenser1', 'address 1');
INSERT INTO dispenser (id_dispenser, name, address) VALUES ('2', 'dispenser 2', 'address 2');

INSERT INTO ingredient (id_ingredient, name) VALUES ('1', 'COFFEE');
INSERT INTO ingredient (id_ingredient, name) VALUES ('2', 'MILK');
INSERT INTO ingredient (id_ingredient, name) VALUES ('3', 'WATER');
INSERT INTO ingredient (id_ingredient, name) VALUES ('4', 'CHOCOLATE');

INSERT INTO supplies (id_ingredient, id_dispenser, quantity) VALUES ('1', '1', '10');
INSERT INTO supplies (id_ingredient, id_dispenser, quantity) VALUES ('2', '1', '10');
INSERT INTO supplies (id_ingredient, id_dispenser, quantity) VALUES ('3', '1', '10');
INSERT INTO supplies (id_ingredient, id_dispenser, quantity) VALUES ('4', '1', '10');


INSERT INTO product (id_product, name) VALUES ('1', 'classic');
INSERT INTO product (id_product, name) VALUES ('2', 'Latte');
INSERT INTO product (id_product, name) VALUES ('3', 'Mocka');


INSERT INTO recipe_detail (id_recipe_dtl, id_product_fk, id_ingredient_fk, quantity, id_recipe_fk) VALUES ('1', '1', '1', '1', '1');
INSERT INTO recipe_detail (id_recipe_dtl, id_product_fk, id_ingredient_fk, quantity, id_recipe_fk) VALUES ('2', '1', '3', '3', '1');
INSERT INTO recipe_detail (id_recipe_dtl, id_product_fk, id_ingredient_fk, quantity, id_recipe_fk) VALUES ('3', '1', '1', '3', '2');
INSERT INTO recipe_detail (id_recipe_dtl, id_product_fk, id_ingredient_fk, quantity, id_recipe_fk) VALUES ('4', '1', '3', '5', '2');
INSERT INTO recipe_detail (id_recipe_dtl, id_product_fk, id_ingredient_fk, quantity, id_recipe_fk) VALUES ('5', '1', '1', '4', '3');
INSERT INTO recipe_detail (id_recipe_dtl, id_product_fk, id_ingredient_fk, quantity, id_recipe_fk) VALUES ('6', '1', '3', '7', '3');
