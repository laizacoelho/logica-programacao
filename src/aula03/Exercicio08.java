package aula03;

//Escreva um programa que leia 10 valores inteiros e positivos e encontre o maior valor,
// o menor valor e calcule a média dos números lidos e exiba essas informações.

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[10];

        double soma = 0;
        for(int i=0; i<10; i++) {
            System.out.println("Digite um número inteiro positivo:");
            numero[i] = scanner.nextInt();
            soma = soma + numero[i];
        }
        scanner.close();

        double media = soma/10;
        System.out.printf("A média destes números é %.2f\n", media);

        int maiorNumero = numero[0];
        int menorNumero = numero[0];
        for(int i=0; i<10; i++) {
            if(numero[i] > maiorNumero) {
                maiorNumero = numero[i];
            }
            if(numero[i] < menorNumero) {
                menorNumero =numero[i];
            }
        }
        System.out.printf("O maior número é %d e o menor número é %d.", maiorNumero, menorNumero);
    }
}
