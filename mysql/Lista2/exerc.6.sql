CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria (
    id INT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(25) NOT NULL,
    linguagem VARCHAR(25) NOT NULL,
    PRIMARY KEY (id)
)  ENGINE=INNODB;

INSERT INTO tb_categoria(tipo, linguagem) 
	VALUES ("EAD", "SQL"),("PRESENCIAL", "Back-end"),("PRESENCIAL/EAD", "JAVA"),("EAD", "Metodologia Agil"),
    ("EAD", "FRONT-END");

CREATE TABLE tb_curso (
    id INT NOT NULL AUTO_INCREMENT,
    valor DECIMAL(5,2) NOT NULL,
    nome VARCHAR(35) NOT NULL,
    periodo VARCHAR(11) NOT NULL,
    id_categoria INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria)
        REFERENCES tb_categoria (id)
)  ENGINE=INNODB;

INSERT INTO tb_curso(valor, nome, periodo, id_categoria)
	VALUES (297.90, "Java Básico", "Manhã", 1), (34.90, "Front-ende", "Noite", 2),(546.90, "Java Avançado", "Dia", 3),
        (74.90, "SQL Avançado", "Tarde", 4),(124.00, "Angular Avançado", "Manhã", 5)
        ,(349.00, "Beck-end Avançado", "Manhã", 2),(154.00, "HTML/CSS Basico", "Manhã", 5);
    
SELECT * FROM tb_curso 
    WHERE valor > 50;

SELECT * FROM tb_curso 
    WHERE valor between 3 AND 60;

SELECT * FROM tb_curso 
    WHERE nome LIKE "%j%";
    
SELECT * FROM tb_curso 
    INNER JOIN tb_categoria 
        ON tb_curso.id_categoria = tb_categoria.id;

SELECT * FROM tb_curso 
    INNER JOIN tb_categoria 
        ON tb_curso.id_categoria = tb_categoria.id
            WHERE tb_categoria.linguagem = "JAVA";