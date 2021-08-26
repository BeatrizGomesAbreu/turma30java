CREATE DATABASE Livraria_cultura;
USE Livraria_cultura;

CREATE TABLE tb_cliente (
    id int AUTO_INCREMENT,
    Nome VARCHAR(25) NOT NULL,
    compras VARCHAR(60) NOT NULL,
    PRIMARY KEY (id) 
)ENGINE = INNODB;

INSERT INTO tb_cliente(id, nome, compras) 
    VALUES(32, "Maria", "O Pequeno Principe"),(45, "José", "Stoner"),(67, "Talita", "Afetos Ferozes"),(96, "Isabelle", "O Som e a Fúria"),(26, "Mariane", "O Som e a Fúria");

    
  CREATE TABLE tb_Livros (
    id int AUTO_INCREMENT, 
    nome varchar (60) not null,
    editora varchar (20),
    edicao varchar (20),
    preco decimal (10, 2),
    estoque int NOT NULL,
    PRIMARY KEY(id)
)ENGINE = INNODB;

insert into tb_Livros(id, nome, editora, edicao, preco, estoque)

values(01, "Pequeno principe", "Companhia das letras", "05", 15.00, 10),
(02, "Afetos Ferozes", "Editora Rocco", "07", 38.00, 10),
(03, "A Vida Pela Frente", "Editora Arqueiro", "12", 45.00, 10),
(04, "Stoner", "Companhia das letras", "07", 67.00, 10),
(05, "O Som e a Fúria", "Editora Rocco", "06", 87.00, 10),
(06, "Distância de Resgate", "Editora Rocco", "05", 34.00, 10);

select * from tb_livros
select * from tb_livros where preco > 20.00
select * from tb_livros where preco < 20.00