package aula03;
//Escreva um programa que receba dois números inteiros e imprima os números inteiros
//que estão no intervalo compreendido entre eles.


import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero01 = scanner.nextInt();
        System.out.println("Digite outro número inteiro:");
        int numero02 = scanner.nextInt();
        scanner.close();
        System.out.printf("Estes são os números compreendidos entre %d e %d\n", numero01, numero02);

        if(numero01 > numero02) {
            for(int i=numero02+1; i<numero01; i++) {
                System.out.println(i);
            }
        } else {
            for(int i=numero01+1; i<numero02; i++) {
                System.out.println(i);
            }
        }
    }
}
