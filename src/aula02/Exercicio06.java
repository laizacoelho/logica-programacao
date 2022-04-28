package aula02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        double numero01 = scanner.nextDouble();
        System.out.println("Informe outro número:");
        double numero02 = scanner.nextDouble();
        System.out.println("Informe outro número:");
        double numero03 = scanner.nextDouble();
        System.out.println("Informe outro número:");
        double numero04 = scanner.nextDouble();

        double somaDosQuadrados =  (numero01*numero01) + (numero02*numero02) + (numero03*numero03) + (numero04*numero04);
        System.out.printf("A soma dos quadrados destes números é %.2f", somaDosQuadrados);
    }
}
