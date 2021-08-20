CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
    id int AUTO_INCREMENT,
    tipo VARCHAR(25) NOT NULL,
    prescricao BOOLEAN NOT NULL,
    PRIMARY KEY (id) 
)ENGINE = INNODB;

CREATE TABLE tb_produto (
    id int AUTO_INCREMENT,
    valor decimal(10,2) NOT NULL,
    nome VARCHAR(20) NOT NULL,
    id_categoria int NOT NULL,
    estoque int NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id)
)ENGINE = INNODB;

INSERT INTO tb_categoria(tipo, prescricao) 
    VALUES("TARJA PRETA", true), ("LIVRE", true), ("INFANTIL", false), ("TARJA VERMELHA", true), 
    ("COMESTICOS", false);

INSERT INTO tb_produto(valor, nome, id_categoria, estoque) 
    VALUES( 100.00, "Orlistat", 1, 50), ( 80.00, "Anfepramona", 2, 50), ( 60, "Dipirona", 3, 50), ( 85.00, "Microfenolato", 4, 50),
    ( 4.00, "Sabonete", 5, 50), ( 90.00, "Propanolou", 4, 50), ( 70.00, "Creme para Pele", 5, 50), ( 27.00, "Enalapril", 1, 50);

SELECT * FROM tb_produto 
    WHERE valor > 50;

SELECT * FROM tb_produto 
    WHERE valor between 3 AND 60;

SELECT * FROM tb_produto 
    WHERE nome LIKE "%b%";

SELECT * FROM tb_produto 
    INNER JOIN tb_categoria 
        ON tb_produto.id_categoria = tb_categoria.id;

SELECT * FROM tb_produto 
    INNER JOIN tb_categoria 
        ON tb_produto.id_categoria = tb_categoria.id
            WHERE tb_produto.id_categoria = 5;