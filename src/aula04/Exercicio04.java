package aula04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas de sua matriz:");
        int row = scanner.nextInt();
        System.out.println("Digite o número de colunas de sua matriz:");
        int column = scanner.nextInt();
        int[][] numbers = new int[row][column];
        int matrixSum = 0;

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                System.out.println("Digite um número inteiro:");
                numbers[i][j] = scanner.nextInt();
                matrixSum = matrixSum + numbers[i][j];
            }
        }
        scanner.close();
        System.out.printf("A soma dos elementos da sua matriz é %d", matrixSum);
    }
}
