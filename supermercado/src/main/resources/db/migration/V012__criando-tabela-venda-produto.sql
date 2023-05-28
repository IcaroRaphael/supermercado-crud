CREATE TABLE venda_produtos (
    venda_id BIGINT,
    produtos_id BIGINT,
    CONSTRAINT fk_venda
        FOREIGN KEY (venda_id)
        REFERENCES venda (id),
    CONSTRAINT fk_produtos
        FOREIGN KEY (produtos_id)
        REFERENCES produto (id)
);
