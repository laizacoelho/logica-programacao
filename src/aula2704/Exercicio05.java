package aula2704;

//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//a) Para homens: (72.7*h) - 58
//b) Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sexo;
        do {
            System.out.println("Informe seu sexo: ");
            System.out.println("F - feminino");
            System.out.println("M - masculino");
            sexo = scanner.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
        } while (sexo != 70 && sexo != 77);

        System.out.println("Informe sua altura em metros");
        double altura = scanner.nextDouble();
        scanner.close();

        double pesoIdeal;
        if(sexo == 70) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            pesoIdeal = (72.7 * altura) - 58;
        }

        System.out.printf("O seu peso ideal é %.2f", pesoIdeal);
    }
}
