insert into cliente(id, nome, cpf, data) values (1,'Pedro da Silveira', '201.176.231-99', '24-11-1999');
insert into cliente(id, nome, cpf, data) values (2,'Vinicius Cruz', '202.276.231-99', '25-09-1990');
insert into cliente(id, nome, cpf, data) values (3,'Icaro Raphael', '203.376.231-99', '26-06-2000');
insert into cliente(id, nome, cpf, data) values (4,'Vinicius Cruz', '204.476.231-99', '17-07-1988');
insert into cliente(id, nome, cpf, data) values (5,'João Raphael', '205.576.231-99', '12-03-1997');

insert into funcionario(id, nome, telefone, salario, funcao, cpf, data) values (1, 'João da Silveira', '952147895', 1500, 'Caixa','211.176.231-99', '27-06-1996');
insert into funcionario(id, nome, telefone, salario, funcao, cpf, data) values (2, 'Gabriel Santana', '942147895', 2500, 'Secretário','221.176.231-99', '21-10-1998');
insert into funcionario(id, nome, telefone, salario, funcao, cpf, data) values (3, 'Luiz Arruda', '932147895', 1500, 'Caixa','231.176.231-99', '10-03-2001');
insert into funcionario(id, nome, telefone, salario, funcao, cpf, data) values (4, 'Lucas Cruz', '922147895', 3500, 'Contador','241.176.231-99', '25-11-2004');
insert into funcionario(id, nome, telefone, salario, funcao, cpf, data) values (5, 'Iremar Nascimento', '912147895', 5000, 'Gerente','251.176.231-99', '07-08-1999');

insert into produto(id, nome, descricao, preco_custo, preco_venda, quantidade_estoque) values (1, 'Arroz', 'Arroz da marca São José', '4.5', '6.5', 105);
insert into produto(id, nome, descricao, preco_custo, preco_venda, quantidade_estoque) values (2, 'Feijão', 'Feijão da marca São José', '6.5', '7.5', 96);
insert into produto(id, nome, descricao, preco_custo, preco_venda, quantidade_estoque) values (3, 'Cuscuz', 'Cuscuz da marca São Rafael', '3.5', '5.0', 199);
insert into produto(id, nome, descricao, preco_custo, preco_venda, quantidade_estoque) values (4, 'Macarrão', 'Macarrão da marca São Rafael', '5.0', '6.5', 82);
insert into produto(id, nome, descricao, preco_custo, preco_venda, quantidade_estoque) values (5, 'Farofa', 'Farofa da marca Yoki', '3.5', '5.2', 155);

insert into venda(id, forma_pagamento, cliente_id, funcionario_id) values (1, 'PIX', 1, 5);
insert into venda(id, forma_pagamento, cliente_id, funcionario_id) values (2, 'DINHEIRO', 2, 4);
insert into venda(id, forma_pagamento, cliente_id, funcionario_id) values (3, 'CARTAO_DEBITO', 3, 3);
insert into venda(id, forma_pagamento, cliente_id, funcionario_id) values (4, 'CARTAO_CREDITO', 4, 2);
insert into venda(id, forma_pagamento, cliente_id, funcionario_id) values (5, 'DINHEIRO', 5, 1);

insert into venda_produtos(venda_id, produtos_id) values (1, 1);
insert into venda_produtos(venda_id, produtos_id) values (1, 2);
insert into venda_produtos(venda_id, produtos_id) values (1, 3);

insert into venda_produtos(venda_id, produtos_id) values (2, 4);
insert into venda_produtos(venda_id, produtos_id) values (2, 5);
insert into venda_produtos(venda_id, produtos_id) values (2, 1);

insert into venda_produtos(venda_id, produtos_id) values (3, 5);
insert into venda_produtos(venda_id, produtos_id) values (3, 3);
insert into venda_produtos(venda_id, produtos_id) values (3, 1);

insert into venda_produtos(venda_id, produtos_id) values (4, 2);
insert into venda_produtos(venda_id, produtos_id) values (4, 4);
insert into venda_produtos(venda_id, produtos_id) values (4, 5);

insert into venda_produtos(venda_id, produtos_id) values (5, 1);
insert into venda_produtos(venda_id, produtos_id) values (5, 2);
insert into venda_produtos(venda_id, produtos_id) values (5, 5);