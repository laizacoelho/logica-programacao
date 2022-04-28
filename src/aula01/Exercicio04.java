package aula01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade em anos:");
        double idadeEmAnos = scanner.nextDouble();
        double idadeEmDias = idadeEmAnos * 365;
        System.out.printf("Você já viveu %.2f dias", idadeEmDias);
    }
}
