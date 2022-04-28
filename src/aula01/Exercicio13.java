package aula01;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o preço de custo do carro:");
        double custo = scanner.nextDouble();
        double valorDistribuidor = custo * 0.28;
        double valorImpostos = custo * 0.45;
        double valorVenda = custo + valorImpostos + valorDistribuidor;
        System.out.printf("O valor de venda deste veículo é R$ %.2f", valorVenda);
        scanner.close();
    }
}
