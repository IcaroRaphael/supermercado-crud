CREATE TABLE funcionario (
    id bigint NOT NULL AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    telefone varchar(255) NOT NULL,
    data_nascimento varchar(255) NOT NULL,
    cpf varchar(255),
    profissao_id bigint,

    PRIMARY KEY (id),
    CONSTRAINT fk_profissao
        FOREIGN KEY (profissao_id)
        REFERENCES profissao (id)
)engine=InnoDB default charset=utf8;