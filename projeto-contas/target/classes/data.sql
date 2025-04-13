-- As instruções DML (insert, update e delete)
-- aqui serão executadas quando a aplicação iniciar

-- Inserindo dados na tabela conta (substitua 'conta' pelo nome real da sua tabela se for diferente)
INSERT INTO Contas (etiqueta, data_vencimento, url, pago, valor, comentario)
VALUES
('Aluguel', '2025-04-30', 'https://www.exemplo.com/aluguel', false, 1200.50, 'Referente ao mês de Abril'),
('Supermercado', '2025-04-15', 'https://www.exemplo.com/supermercado', false, 350.75, 'Compras da quinzena'),
('Salário', '2025-04-10', 'https://www.exemplo.com/salario', true, 3000.00, 'Pagamento mensal'),
('Conta de Luz', '2025-04-25', 'https://www.exemplo.com/energia', false, 150.20, 'Consumo de Março'),
('Internet', '2025-04-20', 'https://www.exemplo.com/provedor', true, 100.00, 'Mensalidade da internet');

INSERT INTO Contas (etiqueta, data_vencimento, url, pago, valor, comentario)
VALUES
('Parcela Carro', '2025-05-05', 'https://www.exemplo.com/financiamento', false, 850.00, 'Parcela 3/60'),
('Investimento', '2025-05-10', 'https://www.exemplo.com/corretora', true, 500.00, 'Aporte mensal'),
('Mensalidade Escola', '2025-05-15', 'https://www.exemplo.com/escola', false, 600.00, 'Mensalidade de Maio');