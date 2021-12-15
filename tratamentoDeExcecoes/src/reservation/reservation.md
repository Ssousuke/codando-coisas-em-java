# Exercício de tratamento de execeções
# Problema: 
Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
novamente a reserva com os dados atualizados. O programa não deve aceitar dados
inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada

# Solução:
## _Solução 1 (muito ruim): lógica de validação no programa principal_
- **Lógica de validação não delegada à reserva**
## _Solução 2 (ruim): método retornando string_
- **A semântica da operação é prejudicada Retornar string não tem nada a ver com atualização de reserva
E se a operação tivesse que retornar um string?
Ainda não é possível tratar exceções em construtores
Ainda não há auxílio do compilador: o programador deve "lembrar" de verificar se houve
erro
A lógica fica estruturada em condicionais aninhadas.**
## _Solução 3 (boa): tratamento de exceções_
- **Cláusula throws: propaga a exceção ao invés de trata-la
Cláusula throw: lança a exceção / "corta" o método
Exception: compilador obriga a tratar ou propagar
RuntimeException: compilador não obriga
O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas
Vantagens:
Lógica delegada
Construtores podem ter tratamento de exceções
Possibilidade de auxílio do compilador (Exception)
Código mais simples. Não há aninhamento de condicionais: a qualquer momento que uma exceção for disparada, a execução é interrompida e cai no bloco catch correspondente.
É possível capturar inclusive outras exceções de sistema.**