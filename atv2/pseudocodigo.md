

leia menu de opções
    leia a entrada de dado: operação que será feita. 
    inteiro operação

se for consultar saldo
    leia saldo disponivel

Inicio
DEFINIR VARIAVEIS
    saldo -> 1000.00
    sistema_ativo -> Verdadeiro
    valor_operacao -> float

    Escreva("=== CAIXA ELETRÔNICO PDV ===")

    Enquanto sistema_ativo = Verdadeiro Faca
        Escreva("\n--- MENU PRINCIPAL ---")
        Escreva("1 - Consultar Saldo")
        Escreva("2 - Depositar")
        Escreva("3 - Sacar")
        Escreva("4 - Encerrar")
        Escreva("Escolha a operação desejada: ")
        Leia(opcao_menu)

        Escolha opcao_menu
            Caso 1:
                Escreva("Seu saldo atual é: R$ ", saldo)
                //VOLTAR AO MENU

            Caso 2:
                Escreva("Digite o valor do depósito: R$ ")
                Leia(valor_operacao)
                //ADICINAR A VARIAVEL COM SALDO A SER INSERINDO PARA ATUALIZAR SALDO ATUAL 
                Se valor_operacao > 0 Entao
                    saldo <- saldo + valor_operacao
                    Escreva("Depósito de R$ ", valor_operacao, " realizado com sucesso!")
                Senao
                    Escreva("Valor de depósito inválido.")
                FimSe

            Caso 3:
                Escreva("Digite o valor do saque: R$ ")
                Leia(valor_operacao)
                
                Se valor_operacao <= 0 Entao
                    Escreva("Valor de saque inválido.")
                Senao Se valor_operacao > saldo Entao
                    Escreva("Saldo insuficiente! Saldo disponível: R$ ", saldo)
                Senao
                    saldo <- saldo - valor_operacao
                    Escreva("Saque de R$ ", valor_operacao, " realizado com sucesso!")
                FimSe

            Caso 4:
                Escreva("Valeu! Sessão encerrada.")
                sistema_ativo <- Falso

            Padrao:
                Escreva("Opção inválida! Tente novamente.")
        FimEscolha
    

