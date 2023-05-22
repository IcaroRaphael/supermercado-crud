CREATE TABLE venda_produto (
    venda_id BIGINT,
    produto_id BIGINT,
    PRIMARY KEY (venda_id, produto_id),
    FOREIGN KEY (venda_id) REFERENCES venda(id),
    FOREIGN KEY (produto_id) REFERENCES produto(id)
) engine=InnoDB default charset=utf8;