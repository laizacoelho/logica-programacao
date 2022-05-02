package aula04;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] number = new double[3][3];
        double biggestNumber;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.println("Digite um número:");
                number[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        biggestNumber = number[0][0];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(biggestNumber < number[i][j]) {
                    biggestNumber = number[i][j];
                }
            }
        }
        System.out.printf("O maior número desta matriz é %.2f", biggestNumber);
    }
}
