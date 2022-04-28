package aula01;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o preço de custo do produto:");
        double custo = scanner.nextDouble();
        System.out.println("Informe o percentual de lucro:");
        double lucro = scanner.nextDouble()/100;
        double valorVenda = custo * (lucro + 1);
        System.out.printf("O valo de venda deste produto é de R$ %.2f", valorVenda);
        scanner.close();
    }
}
