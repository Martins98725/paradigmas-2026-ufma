def consultar_saldo(saldo):
    print(f"Seu saldo atual e: R$ {saldo:.2f}")
    return saldo


def depositar(saldo):
    valor_operacao = float(input("Digite o valor do deposito: R$ "))

    if valor_operacao > 0:
        saldo = saldo + valor_operacao
        print(f"Deposito de R$ {valor_operacao:.2f} realizado com sucesso!")
        print(f"Saldo atual: R$ {saldo:.2f}")
    else:
        print("Valor de deposito invalido.")

    return saldo


def sacar(saldo):
    valor_operacao = float(input("Digite o valor do saque: R$ "))

    if valor_operacao <= 0:
        print("Valor de saque invalido.")
    elif valor_operacao > saldo:
        print(f"Saldo insuficiente! Saldo disponivel: R$ {saldo:.2f}")
    else:
        saldo = saldo - valor_operacao
        print(f"Saque de R$ {valor_operacao:.2f} realizado com sucesso!")
        print(f"Saldo atual: R$ {saldo:.2f}")

    return saldo


def encerrar(saldo):
    print("Obrigado! Sessao encerrada.")
    return saldo


def opcao_invalida(saldo):
    print("Opcao invalida! Tente novamente.")
    return saldo


def main():
    saldo = 1000.00
    sistema_ativo = 1

    print("=== CAIXA ELETRONICO PDV ===")

    while sistema_ativo == 1:
        print("\n--- MENU PRINCIPAL ---")
        print("1 - Consultar Saldo")
        print("2 - Depositar")
        print("3 - Sacar")
        print("4 - Encerrar")
        opcao_menu = int(input("Escolha a operacao desejada: "))

        if opcao_menu == 1:
            saldo = consultar_saldo(saldo)
        elif opcao_menu == 2:
            saldo = depositar(saldo)
        elif opcao_menu == 3:
            saldo = sacar(saldo)
        elif opcao_menu == 4:
            saldo = encerrar(saldo)
            sistema_ativo = 0
        else:
            saldo = opcao_invalida(saldo)


main()