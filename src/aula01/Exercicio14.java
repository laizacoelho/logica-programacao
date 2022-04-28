package aula01;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o raio da circunferência:");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área desta circunferência é %.2f", area);
        scanner.close();
    }

}
