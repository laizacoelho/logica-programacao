package aula2504;

//Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a
// sua opinião em relação ao filme:
//
//3 - ótimo,
//2 - bom,
//1 - regular
//
// Faça um programa que receba a idade e a opinião de 5 espectadores e que calcule e mostre:
//
//A média das idades das pessoas que responderam ótimo;
//A quantidade de pessoas que respondeu regular;
//A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notaFilme;
        int idade;
        int somaIdadeNota3 = 0;
        int qtdNota1 = 0;
        int qtdNota2 = 0;
        int qtdNota3 = 0;

        for (int i=0; i<5; i++) {
            System.out.println("Questionário");
            System.out.println("Qual a sua idade");
            idade = scanner.nextInt();

            do {
                System.out.println("Qual a sua nota sobre o filme?");
                System.out.println("Digite");
                System.out.println("1 para regular");
                System.out.println("2 para bom");
                System.out.println("3 para ótimo");
                notaFilme = scanner.nextInt();
                switch (notaFilme) {
                    case 1 -> qtdNota1++;
                    case 2 -> qtdNota2++;
                    case 3 -> {
                        qtdNota3++;
                        somaIdadeNota3 += idade;
                    }
                }
            } while (notaFilme != 1 && notaFilme != 2 && notaFilme !=3);
        }
        scanner.close();

        double mediaIdadeNota3 = (double)somaIdadeNota3 / qtdNota3;
        double percentual2 = (double)qtdNota2 / 5;

        System.out.printf("O total de votos em 'regular' é %d\n", qtdNota1);
        System.out.printf("A porcentagem de votos em bom é %.2f%%\n", (percentual2*100));
        System.out.printf("A média das idades das pessoas que responderam 'ótimo' é %.2f", mediaIdadeNota3);
    }
}
