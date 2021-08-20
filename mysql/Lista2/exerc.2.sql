CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
    id INT AUTO_INCREMENT,
    tipo VARCHAR(20) NOT NULL,
    tamanho CHAR(1) NOT NULL,
    PRIMARY KEY (id)
)  ENGINE=INNODB;

CREATE TABLE tb_pizza (
    id INT AUTO_INCREMENT,
    id_categoria INT NOT NULL,
    preco decimal(4,2) NOT NULL,
    catupiry BOOLEAN NOT NULL,
    chedar BOOLEAN NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria)
        REFERENCES tb_categoria (id)
)  ENGINE=INNODB;

INSERT INTO tb_categoria(tipo, tamanho) VALUES("Chocolate", 'P'),
	("Frango", 'G'),
	("Calabresa", 'M'),
    ("Bauru", 'P'),
    ("Atum", 'G');

INSERT INTO tb_pizza(id_categoria, preco, mostarda, ketchup) VALUES(1, 30.50, false, true),
	(2, 35.50, true, false),
    (3, 39.50, true, true),
    (4, 27.50, false, true),
    (5, 37.50, true, false),
    (4, 40.50, false, false),
    (3, 29.50, false, true),
    (2, 32.50, true, false);

SELECT * FROM tb_pizza WHERE preco > 45.00;

SELECT * FROM tb_pizza WHERE preco between 29 and 60;

SELECT * FROM tb_pizza INNER JOIN tb_categoria on tb_pizza.id_categoria = tb_categoria.id 
	WHERE tb_categoria.tipo LIKE '%c%';

SELECT * FROM tb_pizza INNER JOIN tb_categoria on tb_pizza.id_categoria = tb_categoria.id;

SELECT * FROM tb_pizza INNER JOIN tb_categoria on tb_pizza.id_categoria = tb_categoria.id 
	WHERE tb_pizza.id_categoria = 1;
