package aula03;

//Escreva um programa que exiba quantas pessoas possuem mais de 18 anos. O algoritmo deverá ler a idade de 10 pessoas.

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[10];
        int[] idade = new int[10];

        for(int i=0; i<10; i++) {
            System.out.println("Digite seu nome:");
            nome[i] = scanner.nextLine();
            System.out.println("Digite sua idade:");
            idade[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();

        int contador = 0;
        for(int i=0; i<10; i++) {
            if(idade[i] > 18) {
                contador++;
                System.out.printf("%s tem mais de 18 anos.\n", nome[i]);
            }
        }
        System.out.printf("São %d pessoas com mais de 18 anos.", contador);
    }
}
