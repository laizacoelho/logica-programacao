package aula2504;

//Faça um programa que apresente o menu de opções a seguir:
//Menu de opções:
//	1. Média aritmética
//	2. Média ponderada
//Digite a opção desejada:
//	Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
//	Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
//Verifique a possibilidade de opção inválida, mostrando uma mensagem.

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte menu;
        do {
            System.out.printf("%15s\n","Menu");
            System.out.println("Digite a opção desejada");
            System.out.println("1- Média aritmética");
            System.out.println("2- Média ponderada");
            System.out.println("3- Encerrar");
            menu = scanner.nextByte();

            if (menu == 1 || menu == 2) {
                System.out.println("Informe a primeira nota");
                double nota01 = scanner.nextDouble();
                System.out.println("Informe a segunda nota");
                double nota02 = scanner.nextDouble();
                if (menu == 1) {
                    double mediaAritmetica = (nota01 + nota02) / 2;
                    System.out.printf("A média aritmética desta notas é %.2f\n", mediaAritmetica);
                } else {
                    System.out.println("Informe a terceira nota");
                    double nota03 = scanner.nextDouble();
                    System.out.println("Informe o peso da primeira nota");
                    double peso01 = scanner.nextDouble();
                    System.out.println("Informe o peso da segunda nota");
                    double peso02 = scanner.nextDouble();
                    System.out.println("Informe o peso da terceira nota");
                    double peso03 = scanner.nextDouble();
                    double mediaPonderada = ((nota01*peso01) + (nota02*peso02) + (nota03*peso03)) / (peso01+peso02+peso03);
                    System.out.printf("A média ponderada destas notas é %.2f\n", mediaPonderada);
                }
            } else if (menu != 3 ){
                System.out.println("Opção inválida.");
            }
        } while (menu != 3);
        scanner.close();
        System.out.println("Programa encerrado");

    }
}
