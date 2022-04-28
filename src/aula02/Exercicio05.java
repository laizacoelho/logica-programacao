package aula02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        final int CONSUMO_MEDIO = 12;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a velocidade média para sua viagem em km/h:");
        double velocidade = scanner.nextDouble();
        System.out.println("Informe o tempo da viagem em minutos:");
        double tempoMinutos = scanner.nextDouble();
        scanner.close();

        double distancia = (tempoMinutos/60) * velocidade;
        double consumoCombustivel = distancia / CONSUMO_MEDIO;
        System.out.printf("Serão necessários %.2f litros para esta viagem", consumoCombustivel);
    }
}
