CREATE TABLE produto (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    preco_custo DOUBLE NOT NULL,
    preco_venda DOUBLE NOT NULL,
    quantidade_estoque INT NOT NULL,

    PRIMARY KEY (id)
);
