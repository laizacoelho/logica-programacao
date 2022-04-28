package aula01;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor total da compra:");
        double valor = scanner.nextDouble();
        double parcela = valor / 5;
        System.out.printf("O valor da parcela é R$ %.2f.", parcela);
        scanner.close();
    }
}
