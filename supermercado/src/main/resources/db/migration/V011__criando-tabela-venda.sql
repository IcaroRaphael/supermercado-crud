CREATE TABLE venda (
    id BIGINT NOT NULL AUTO_INCREMENT,
    cliente_id BIGINT,
    forma_pagamento_id BIGINT,
    funcionario_id BIGINT,
    PRIMARY KEY (id),
    CONSTRAINT fk_cliente
        FOREIGN KEY (cliente_id)
        REFERENCES cliente (id),
    CONSTRAINT fk_forma_pagamento
        FOREIGN KEY (forma_pagamento_id)
        REFERENCES forma_pagamento (id),
    CONSTRAINT fk_funcionario
        FOREIGN KEY (funcionario_id)
        REFERENCES funcionario (id)
);
