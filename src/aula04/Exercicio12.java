package aula04;

// Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
// Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até
// R$1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
// salário total.

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAXA_COMISSAO = 0.03;
        final double TAXA_COMISSAO_EXTRA = 0.05;
        System.out.println("Informe o seu salário: ");
        double salario = scanner.nextDouble();
        System.out.println("Informe o valor de das vendas efetuadas no mês: ");
        double valorVendas = scanner.nextDouble();
        scanner.close();

        double comissao;
        if (valorVendas > 1500) {
            comissao = ((valorVendas - 1500) * TAXA_COMISSAO_EXTRA) + (1500 * TAXA_COMISSAO);
        } else {
            comissao = valorVendas * TAXA_COMISSAO;
        }
        System.out.printf("O seu salário total é %f", (comissao+salario));
    }
}
