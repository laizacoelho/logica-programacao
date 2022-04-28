package aula01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        final double TAXA_DE_JUROS = 0.02;
        Scanner scanner = new Scanner(System.in);
        double valorEmprestimo;
        double tempoEmMeses;
        System.out.println("Digite o valor que deseja efetuar o empréstimo:");
        valorEmprestimo = scanner.nextDouble();
        System.out.println("Digite em quantos meses irá pagar o empréstimo:");
        tempoEmMeses = scanner.nextDouble();
        double montante = valorEmprestimo * Math.pow(1+TAXA_DE_JUROS, tempoEmMeses);
        System.out.printf("O motante final do seu empréstimo é R$ %.2f", montante);
    }
}
