package aula04;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] number = new double[2][5];

        for(int i=0; i<2; i++) {
            for(int j=0; j<5; j++) {
                System.out.println("Digite um número:");
                number[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        for(int i=0; i<2; i++) {
            for(int j=0; j<5; j++) {
                System.out.printf("%.2f ", number[i][j]);
            }
            System.out.println();
        }
    }
}
