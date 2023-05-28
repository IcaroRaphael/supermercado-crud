create table profissao (
	id bigint not null auto_increment,
    nome varchar(60) not null,
    descricao varchar(120) not null,
    salario double not null,
    
    primary key (id)
)engine=InnoDB default charset=utf8;