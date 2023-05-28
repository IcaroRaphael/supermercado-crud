create table cliente (
	id bigint not null AUTO_INCREMENT primary key,
    nome varchar(60) not null,
    data_nascimento varchar(12) not null,
    cpf varchar(20) not null
)engine=InnoDB default charset=utf8;