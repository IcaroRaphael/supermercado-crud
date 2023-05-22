create table produto (
	id bigint not null auto_increment,
    nome varchar(60) not null,
    descricao varchar(120) not null,
    preco_custo double not null,
	preco_venda double not null,
    quantidade_estoque int not null,
    
    primary key (id)
)engine=InnoDB default charset=utf8;