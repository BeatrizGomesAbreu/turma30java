CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;

CREATE TABLE tb_categoria (
    id INT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(25) NOT NULL,
    corte BOOLEAN NOT NULL,
    PRIMARY KEY (id)
)  ENGINE=INNODB;

INSERT INTO tb_categoria(tipo, corte) 
	VALUES ("Aves", false),("Suina", true),("Bovinas", true),("Outros", false),("Doces", false);

CREATE TABLE tb_produto (
    id INT NOT NULL AUTO_INCREMENT,
    valor DECIMAL(4 , 2 ) NOT NULL,
    nome VARCHAR(20) NOT NULL,
    estoque INT NOT NULL,
    id_categoria INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria)
        REFERENCES tb_categoria (id)
)  ENGINE=INNODB;

INSERT INTO tb_produto(valor, nome, estoque, id_categoria)
	VALUES (15.50, "File de Frango", 40, 1),(20.00, "Linguiça", 40, 2),(25.00, "Bacon", 40, 2),(8.50, "Sal Grosso", 40, 3),
	(3.50, "Pé de moça", 40, 5),(9.00, "Farofa", 40, 4),(19.70, "Coração de Galinha", 40, 1),(20.50, "Barriga", 40, 2);
    
SELECT * FROM tb_produto 
    WHERE valor > 50;

SELECT * FROM tb_produto 
    WHERE valor between 3 AND 60;

SELECT * FROM tb_produto 
    WHERE nome LIKE "%c%";
    
SELECT * FROM tb_produto 
    INNER JOIN tb_categoria 
        ON tb_produto.id_categoria = tb_categoria.id;

SELECT * FROM tb_produto 
    INNER JOIN tb_categoria 
        ON tb_produto.id_categoria = tb_categoria.id
            WHERE tb_produto.id_categoria = 1;