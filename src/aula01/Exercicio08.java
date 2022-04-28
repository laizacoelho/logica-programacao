package aula01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância total percorrida em quilômetros:");
        double distancia = scanner.nextDouble();
        System.out.println("Digite o consumo de combustível para esta distância:");
        double consumoCombustivel = scanner.nextDouble();
        double consumoMedio = distancia / consumoCombustivel;
        System.out.printf("O consumo médio de combustível deste veículo é %.2f km/l.", consumoMedio);
        scanner.close();
    }
}
