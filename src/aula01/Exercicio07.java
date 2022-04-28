package aula01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero01 = scanner.nextDouble();
        System.out.println("Digite outro número:");
        double numero02 = scanner.nextDouble();
        double soma = numero01 + numero02;
        double subtracao = numero01 - numero02;
        double multiplicacao = numero01 * numero02;
        double divisao = numero01 /numero02;
        System.out.printf(" Soma: %.2f \n Subtração: %.2f \n Multiplicação: %.2f \n Divisão: %.2f",
                soma, subtracao, multiplicacao, divisao);
    }
}
