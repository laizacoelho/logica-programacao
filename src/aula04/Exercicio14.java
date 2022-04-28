package aula04;
//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as
// idades dos homens serão sempre diferentes entre si, bem como as das mulheres).
//Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o
// produto das idades do homem mais novo com a mulher mais velha.

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idadeMulher = new int[2];
        int[] idadeHomem = new int[2];

        for (int i=0; i<2; i++) {
            System.out.printf("Informe a idade da mulher %d: ", (i+1));
            idadeMulher[i] = scanner.nextInt();
            System.out.printf("Informe a idade do homem %d: ", (i+1));
            idadeHomem[i] = scanner.nextInt();
        }
        scanner.close();

        int idadeMulherMaisVelha = idadeMulher[0];
        int idadeMulherMaisNova = idadeMulher[0];
        if (idadeMulherMaisVelha < idadeMulher[1]) {
            idadeMulherMaisVelha = idadeMulher[1];
        } else {
            idadeMulherMaisNova = idadeMulher[1];
        }

        int idadeHomemMaisVelho = idadeHomem[0];
        int idadeHomemMaisNovo = idadeHomem[0];
        if (idadeHomemMaisVelho < idadeHomem[1]) {
            idadeHomemMaisVelho = idadeHomem[1];
        } else {
            idadeHomemMaisNovo = idadeHomem[1];
        }

        System.out.printf("A soma das idades o homem mais velho com a mulher mais nova é %d\n",
                (idadeHomemMaisVelho + idadeMulherMaisNova));
        System.out.printf("O produto das idades do homem mais novo com a mulher mais velha é %d\n",
                (idadeHomemMaisNovo * idadeMulherMaisVelha));
    }
}
