CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria (
    id INT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(25) NOT NULL,
    peso VARCHAR(25) NOT NULL,
    PRIMARY KEY (id)
)  ENGINE=INNODB;

INSERT INTO tb_categoria(tipo, peso) 
	VALUES ("Ferragem","Médio/Pesado"),("Eletrica", "Leve/Médio"),("Hidraulica", "Leve/Médio");

CREATE TABLE tb_produto (
    id INT NOT NULL AUTO_INCREMENT,
    valor DECIMAL(5,2) NOT NULL,
    nome VARCHAR(20) NOT NULL,
    estoque INT NOT NULL,
    id_categoria INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria)
        REFERENCES tb_categoria (id)
)  ENGINE=INNODB;

INSERT INTO tb_produto(valor, nome, estoque, id_categoria)
	VALUES (30.00, "Sapata", 50, 1), (69.00, "Coluna", 50, 1),(42.00, "Conduite", 50, 2),
        (258.00, "Rolo de Fio", 50, 2),(14.00, "Luva", 50, 3);
    
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