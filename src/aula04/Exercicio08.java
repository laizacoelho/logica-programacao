package aula04;

//aça um programa para receber um conjunto de 10 valores até 100, e insira em uma matriz,
// em seguida você deverá receber um outro valor e verificar se o elemento existe no
// conjunto de 10 valores da matriz. Caso exista você deve imprimir uma mensagem: "O valor
// existe no conjunto", caso contrário deverá exibir: "--

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz =  new int[2][5];
        for (int i=0; i<2; i++) {
            for (int j=0; j<5; j++) {
                System.out.printf("Informe um número inteiro até 100 para a posição (%d,%d) da matriz: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();
        boolean isExisteValor = false;
        for (int i=0; i<2; i++) {
            for (int j=0; j<5; j++) {
                if(numero == matriz[i][j]) {
                    System.out.println("O valor existe no conjunto.");
                    isExisteValor = true;
                    i=2;
                    j=5;
                }
            }
        }
        if(!isExisteValor) {
            System.out.println("O valor não existe no conjunto.");
        }
    }
}
