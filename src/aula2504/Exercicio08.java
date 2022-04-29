package aula2504;

//Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
//1- A quantidade de pessoas com mais de 90 quilos;
//2- A média das idades das sete pessoas;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        int qtdMaisNoventa = 0;
        for (int i=0; i<7; i++) {
            System.out.println("Qual o seu peso em kg?");
            double peso = scanner.nextDouble();
            System.out.println("Qual a sua idade?");
            int idade = scanner.nextInt();

            somaIdades += idade;
            if (peso > 90) {
                qtdMaisNoventa++;
            }
        }
        scanner.close();
        double mediaIdades = (double)somaIdades/7;
        System.out.printf("%d pessoa(s) com mais de 90 quilos\n", qtdMaisNoventa);
        System.out.printf("A média das idades é %.2f", mediaIdades);
    }
}
