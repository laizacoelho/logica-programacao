package aula04;
//Crie um método que recebe uma matriz bidimensional inteira e um inteiro
// que indica uma de suas linhas, e retorna a média dos valores daquela linha

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas da matriz:");
        int linha = scanner.nextInt();
        System.out.println("Informe o número de colunhas da matriz");
        int coluna = scanner.nextInt();
        int[][] matriz = new int[linha][coluna];
        for(int i=0; i<linha; i++) {
            for(int j=0; j<coluna; j++) {
                System.out.printf("Informe um número inteiro para posição [%d,%d] da matriz: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz concluída.");
        for(int i=0; i<linha; i++) {
            for(int j=0; j<coluna; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Informe a linha que deseja escolher: ");
        int linhaSelecionada = scanner.nextInt();
        scanner.close();
        double somaLinha=0;
        for(int i=0; i<coluna; i++) {
            somaLinha = somaLinha + matriz[linhaSelecionada][i];
        }
        System.out.println("A média dos valores desta linha é " + (somaLinha/coluna));
    }
}
