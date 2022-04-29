package aula04;

//Escreva um programa que leia um vetor de 13 elementos inteiros, que é o Gabarito
// de um teste da loteria esportiva, contendo os valores 1(coluna 1), 2 (coluna 2)
// e 3 (coluna 3). Leia, a seguir, para cada apostador, o número do seu cartão e
// um vetor de Respostas de 13 posições. Verifique para cada apostador o números
// de acertos, comparando o vetor de Gabarito com o vetor de Respostas. Escreva o
// número do apostador e o número de acertos. Se o apostador tiver 13 acertos,
// mostrar a mensagem "Ganhador".

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Use 1, 2 ou 3 para preencher o gabarito");
        int[] aposta = new int[13];
        int[] gabarito = new int[13];
        boolean ganhou = true;
        int count = 0;
        for (int i=0; i<13; i++) {
            System.out.printf("Informe a resposta do jogo %d: ", (i+1));
            aposta[i] = scanner.nextInt();
            gabarito[i] = rand.nextInt(3) + 1;
            if(aposta[i] != gabarito[i]) {
                ganhou = false;
            } else {
                count++;
            }
        }
        scanner.close();

        System.out.println("Gabarito:");
        for (int i=0; i<13; i++) {
            System.out.printf("%d ", gabarito[i]);
        }
        System.out.printf("\nQuantidade de acertos: %d", count);

        if(ganhou) {
            System.out.printf("\nGANHADOR!!");
        } else {
            System.out.println("\nVocê não ganhou, tente outra vez!");
        }
    }
}
