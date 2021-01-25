CREATE TABLE cliente (
    codigo 			BIGINT(20) primary key AUTO_INCREMENT,
    nome   			VARCHAR(50) NOT NULL,
    cpf   			VARCHAR(50) NOT NULL,
    logradouro 		VARCHAR(50) NOT NULL,
    numero     		TINYINT	    NOT NULL,
    complemento 	VARCHAR(50),
    bairro 			VARCHAR(50) NOT NULL,
    cep    			VARCHAR(50) NOT NULL,
    estado 			VARCHAR(50) NOT NULL	
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
     