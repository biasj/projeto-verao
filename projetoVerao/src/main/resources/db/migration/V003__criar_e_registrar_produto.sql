CREATE TABLE produto (
    codigo        BIGINT(20) primary key AUTO_INCREMENT,
    nome          VARCHAR(50) NOT NULL,
    descricao     VARCHAR(150) NOT NULL,
    valor         DECIMAL(10,2) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;