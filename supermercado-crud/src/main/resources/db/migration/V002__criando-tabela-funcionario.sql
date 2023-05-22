create table funcionario (
	id bigint not null auto_increment,
    nome varchar(60) not null,
    data varchar(12) not null,
    cpf varchar(20) not null,
    salario double not null,
    funcao varchar(15) not null,
    telefone varchar (15) not null,
    
    primary key (id)
)engine=InnoDB default charset=utf8;