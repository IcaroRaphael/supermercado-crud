insert into cliente(id, nome, cpf, data_nascimento) values (1,'Pedro da Silveira', '201.176.231-99', '1999-11-24');
insert into cliente(id, nome, cpf, data_nascimento) values (2,'Vinicius Cruz', '202.276.231-99', '1990-09-25');
insert into cliente(id, nome, cpf, data_nascimento) values (3,'Icaro Raphael', '203.376.231-99', '2000-06-26');
insert into cliente(id, nome, cpf, data_nascimento) values (4,'Vinicius Cruz', '204.476.231-99', '1988-07-17');
insert into cliente(id, nome, cpf, data_nascimento) values (5,'João Raphael', '205.576.231-99', '1997-03-12');


insert into profissao(id, nome, descricao, salario) values (1, 'Caixa', 'Realiza o atendimento da compra direto com o cliente', 1500);
insert into profissao(id, nome, descricao, salario) values (2, 'Contador', 'Realiza toda a contabilidade do supermercado', 2500);
insert into profissao(id, nome, descricao, salario) values (3, 'Gerente', 'Faz todo o gerenciamento do supermercado', 5000);
insert into profissao(id, nome, descricao, salario) values (4, 'Secretario', 'Auxilia o supermercado em diverças tarefas administrativas', 2000);


insert into funcionario(id, nome, telefone, cpf, data_nascimento, profissao_id) values (1, 'João da Silveira', '952147895', '211.176.231-99', '1996-06-27', 1);
insert into funcionario(id, nome, telefone, cpf, data_nascimento, profissao_id) values (2, 'Gabriel Santana', '942147895', '221.176.231-99', '1998-10-21', 2);
insert into funcionario(id, nome, telefone, cpf, data_nascimento, profissao_id) values (3, 'Luiz Arruda', '932147895', '231.176.231-99', '2001-03-10', 3);
insert into funcionario(id, nome, telefone, cpf, data_nascimento, profissao_id) values (4, 'Lucas Cruz', '922147895', '241.176.231-99', '2004-11-25', 4);
insert into funcionario(id, nome, telefone, cpf, data_nascimento, profissao_id) values (5, 'Iremar Nascimento', '912147895', '251.176.231-99', '1999-08-07', 1);


insert into forma_pagamento(id, nome, descricao) values (1, 'Pix', 'Método de transferência bancária instantânea');
insert into forma_pagamento(id, nome, descricao) values (2, 'Cartão de crédito', 'Método de pagamento através de maquineta');
insert into forma_pagamento(id, nome, descricao) values (3, 'Cartão de débito', 'Método de pagamento através de maquineta');
insert into forma_pagamento(id, nome, descricao) values (4, 'Dinheiro', 'Método de pagamento à vista');


insert into produto(id, nome, descricao, preco_custo, preco_venda, quantidade_estoque) values (1, 'Arroz', 'Arroz da marca São José', '4.5', '6.5', 105);
insert into produto(id, nome, descricao, preco_custo, preco_venda, quantidade_estoque) values (2, 'Feijão', 'Feijão da marca São José', '6.5', '7.5', 96);
insert into produto(id, nome, descricao, preco_custo, preco_venda, quantidade_estoque) values (3, 'Cuscuz', 'Cuscuz da marca São Rafael', '3.5', '5.0', 199);
insert into produto(id, nome, descricao, preco_custo, preco_venda, quantidade_estoque) values (4, 'Macarrão', 'Macarrão da marca São Rafael', '5.0', '6.5', 82);
insert into produto(id, nome, descricao, preco_custo, preco_venda, quantidade_estoque) values (5, 'Farofa', 'Farofa da marca Yoki', '3.5', '5.2', 155);


insert into venda(id, forma_pagamento_id, cliente_id, funcionario_id) values (1, 1, 1, 1);
insert into venda(id, forma_pagamento_id, cliente_id, funcionario_id) values (2, 4, 2, 1);
insert into venda(id, forma_pagamento_id, cliente_id, funcionario_id) values (3, 3, 3, 5);
insert into venda(id, forma_pagamento_id, cliente_id, funcionario_id) values (4, 2, 4, 1);
insert into venda(id, forma_pagamento_id, cliente_id, funcionario_id) values (5, 4, 5, 5);


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
