package aula01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário atual:");
        double salarioAtual = scanner.nextDouble();
        double reajuste = 1.07;
        double salarioReajustado = reajuste * salarioAtual;
        System.out.printf("Seu salário reajustado é R$ %.2f, o seu salário antes do reajuste era de R$ %.2f.", salarioReajustado, salarioAtual);
    }
}
