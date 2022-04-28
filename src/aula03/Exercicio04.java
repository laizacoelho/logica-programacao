package aula03;

//Escreva um programa que receba 5 números inteiros, armazene-os em um array,
//e imprima na tela os valores em ordem decrescente.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[5];

        for(int j=0; j<5; j++) {
            System.out.println("Digite um número:");
            numero[j] = scanner.nextInt();
        }
        scanner.close();

        int aux = numero[0];
        int i = 0;
        while(i < 5) {
            if(numero[i] < aux) {
                aux = numero[i];
                if (i != 0) {
                    numero[i] = numero[i-1];
                    numero[i-1] = aux;
                    i=0;
                } else {
                    i++;
                }
            } else {
                aux = numero[i];
                i++;
            }
        }

        System.out.println("Números em ordem decrescente:");
        for (int j=4; j>=0; j--){
            System.out.println(numero[j]);
        }
    }
}
