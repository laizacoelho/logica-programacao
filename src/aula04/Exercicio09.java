package aula04;
//Crie um programa que preencha uma matriz de 3x5 com números inteiros. Em seguida faça:
//some cada uma das linhas armazenando o resultado em um vetor;
//some cada uma das colunas armazenando o resultado em um vetor;
//imprima o resultado da soma das linhas;
//imprima o resultado da soma das coluna;
//imprima a matriz completa

import java.util.Random;

public class Exercicio09 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][5];
        int[] somaLinhas = {0, 0, 0};
        int[] somaColunas = {0, 0, 0, 0, 0};
        System.out.println("Matriz:");
        for (int i=0; i<3; i++) {
            for (int j=0; j<5; j++) {
                matriz[i][j] = random.nextInt(101);
                System.out.printf("%d ", matriz[i][j]);
                somaLinhas[i] = somaLinhas[i] + matriz[i][j];
                somaColunas[j] = somaColunas[j] + matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("\nVetor da soma das linhas:");
        for (int i=0; i<3; i++) {
            System.out.printf("%d ", somaLinhas[i]);
        }


        System.out.println("\n\nVetor da soma das colunas:");
        for (int i=0; i<5; i++) {
            System.out.printf("%d ", somaColunas[i]);
        }
    }
}
