#include <stdio.h>

int main() {
    // Definição das variáveis
    float saldo = 1000.00;
    float valor_operacao;
    int opcao_menu;
    int sistema_ativo = 1; // 1 = verdadeiro, 0 = falso

    printf("=== CAIXA ELETRONICO PDV ===\n");

    while (sistema_ativo == 1) {

        printf("\n--- MENU PRINCIPAL ---\n");
        printf("1 - Consultar Saldo\n");
        printf("2 - Depositar\n");
        printf("3 - Sacar\n");
        printf("4 - Encerrar\n");
        printf("Escolha a operacao desejada: ");
        scanf("%d", &opcao_menu);

        switch (opcao_menu) {

            case 1:
                printf("Seu saldo atual e: R$ %.2f\n", saldo);
                break;

            case 2:
                printf("Digite o valor do deposito: R$ ");
                scanf("%f", &valor_operacao);

                if (valor_operacao > 0) {
                    saldo = saldo + valor_operacao;
                    printf("Deposito de R$ %.2f realizado com sucesso!\n", valor_operacao);
                } else {
                    printf("Valor de deposito invalido.\n");
                }
                break;

            case 3:
                printf("Digite o valor do saque: R$ ");
                scanf("%f", &valor_operacao);

                if (valor_operacao <= 0) {
                    printf("Valor de saque invalido.\n");
                } else if (valor_operacao > saldo) {
                    printf("Saldo insuficiente! Saldo disponivel: R$ %.2f\n", saldo);
                } else {
                    saldo = saldo - valor_operacao;
                    printf("Saque de R$ %.2f realizado com sucesso!\n", valor_operacao);
                }
                break;

            case 4:
                printf("Valeu! Sessao encerrada.\n");
                sistema_ativo = 0;
                break;

            default:
                printf("Opcao invalida! Tente novamente.\n");
        }
    }

    return 0;
}
