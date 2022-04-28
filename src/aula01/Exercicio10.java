package aula01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor depositado na poupança:");
        double deposito = scanner.nextDouble();
        double valorDepositoAposUmMes = deposito * 1.007;
        System.out.printf("O valor atualizado após um mês na poupança é de R$ %.2f", valorDepositoAposUmMes);
        scanner.close();
    }
}
