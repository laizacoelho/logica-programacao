package aula01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantia em reais que deseja converter:");
        double valorEmReais = scanner.nextDouble();
        System.out.println("Digite a cotação de hoje do dólar:");
        double cotacaoDolar = scanner.nextDouble();
        System.out.println("Digite a cotação de hoje do euro:");
        double cotacaoEuro = scanner.nextDouble();
        System.out.println("Digite a cotação de hoje da libra:");
        double cotacaoLibra = scanner.nextDouble();

        double valorEmDolar = valorEmReais * cotacaoDolar;
        double valorEmEuro = valorEmReais * cotacaoEuro;
        double valorEmLibra = valorEmReais * cotacaoLibra;
        System.out.printf("Valor convertido: \n USD %.2f \n EUR %.2f \n GBP %.2f",
                valorEmDolar, valorEmEuro, valorEmLibra);
    }
}
