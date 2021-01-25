/*------------------CATEGORIAS------------------*/

INSERT INTO categoria(tipo)  VALUES('camiseta polo');
INSERT INTO categoria(tipo)  VALUES('camiseta manga longa');
INSERT INTO categoria(tipo)  VALUES('regata');
INSERT INTO categoria(tipo)  VALUES('casaco');
INSERT INTO categoria(tipo)  VALUES('moletom');
INSERT INTO categoria(tipo)  VALUES('camisa manga longa');
INSERT INTO categoria(tipo)  VALUES('camisa manga curta');


/*------------------CLIENTE------------------*/

INSERT INTO cliente(nome,cpf,logradouro,numero,bairro,cep,estado)  
	VALUES('Gustavo','123123112,02','rua exeemplo 1',12,'IAPI','124568,22','São Paulo');

INSERT INTO cliente(nome,cpf,logradouro,numero,bairro,cep,estado)  
	VALUES('Miguel','123123112,02','rua exeemplo 1',12,'IAPI','124568,22','São Paulo');

INSERT INTO cliente(nome,cpf,logradouro,numero,bairro,cep,estado)  
	VALUES('Marcelo ','123123112,02','rua exeemplo 1',12,'IAPI','124568,22','São Paulo');		

INSERT INTO cliente(nome,cpf,logradouro,numero,bairro,cep,estado)  
	VALUES('Pedro','123123112,02','rua exeemplo 1',12,'IAPI','124568,22','São Paulo');
	
INSERT INTO cliente(nome,cpf,logradouro,numero,bairro,cep,estado)  
	VALUES('Bia','123123112,02','rua exeemplo 1',12,'IAPI','124568,22','São Paulo');	
	
/*------------------PRODUTO------------------*/
	
INSERT INTO produto(nome,descricao,valor)  
	VALUES('Camiseta lord','feita em inspiração ao jogo WORD WARCRAFT',99.00);	

INSERT INTO produto(nome,descricao,valor)  
	VALUES('Camiseta COD','feita em inspiração ao jogo CALL OF DUTY',289.00);	

INSERT INTO produto(nome,descricao,valor)  
	VALUES('Camiseta FIFA 2021','feita em inspiração ao jogo FIFA 2021',199.00);
	
	
/*------------------ESTOQUE------------------*/	

INSERT INTO estoque(tamanho,quantidade,cor,codigo_categoria,codigo_produto)  
	VALUES('M',15,'vermelha',1,2);	
	
INSERT INTO estoque(tamanho,quantidade,cor,codigo_categoria,codigo_produto)  
	VALUES('P',10,'preta',1,3);	

INSERT INTO estoque(tamanho,quantidade,cor,codigo_categoria,codigo_produto)  
	VALUES('GG',1,'branca',2,2);

INSERT INTO estoque(tamanho,quantidade,cor,codigo_categoria,codigo_produto)  
	VALUES('GG',55,'verde',3,1);				
	
	
	

