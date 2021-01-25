CREATE TABLE estoque (
    codigo 				BIGINT(20) primary key AUTO_INCREMENT,
    tamanho   			VARCHAR(50) NOT NULL,
    quantidade      	BIGINT      NOT NULL,
    cor             	VARCHAR(50)	NOT NULL,
    codigo_categoria    BIGINT(20),     
    codigo_produto		BIGINT(20),
    FOREIGN KEY (codigo_categoria) 	REFERENCES 	categoria(codigo),
	FOREIGN KEY (codigo_produto) 	REFERENCES 	produto(codigo)	
)ENGINE=InnoDB DEFAULT CHARSET=utf8;