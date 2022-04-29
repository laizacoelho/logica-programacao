package aula2504;

//https://docs.google.com/document/d/1FWk8q7Swif9nEVW2ekxUZm24y4Fr8H7SouK1tK8EhtA/edit
//Calcular a quantidade de dinheiro gasta por um fumante.
//Dados: o número de anos que ele fuma, o nº de cigarros
// fumados por dia e o preço de uma carteira com 20 cigarros.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de cigarros fumados por dia: ");
        int qntdCigarro = scanner.nextInt();

        System.out.println("Quantos anos você fuma? ");
        double anosDeFumante = scanner.nextDouble();
        double diasDeFumante = anosDeFumante * 365;

        System.out.println("Qual o preço da carteira com 20 cigarro? ");
        double precoCarteiraCigarro = scanner.nextDouble();
        double precoUnitarioCigarro = precoCarteiraCigarro/20;
        scanner.close();

        double valorGastoComCigarro = qntdCigarro * diasDeFumante * precoUnitarioCigarro;
        System.out.printf("Você já gastou R$%.2f com cigarro", valorGastoComCigarro);
    }
}
