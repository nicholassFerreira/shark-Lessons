create table Produto(

	id bigint NOT NULL PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(100) NOT NULL,
	descricao VARCHAR(100) NOT NULL,
	preco VARCHAR(8) NOT NULL, 
	prazo_entrega VARCHAR(75) NOT NULL

)