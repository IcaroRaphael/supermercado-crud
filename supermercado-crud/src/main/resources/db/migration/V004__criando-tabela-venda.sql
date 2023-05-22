CREATE TABLE venda (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    forma_pagamento VARCHAR(255) NOT NULL,
    cliente_id BIGINT,
    funcionario_id BIGINT,
    FOREIGN KEY (cliente_id) REFERENCES cliente(id),
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(id)
) engine=InnoDB default charset=utf8;