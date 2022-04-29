package aula2504;

//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//“Telefonou para a vítima? “
//“Esteve no local do crime?”
//“Mora perto da vítima? “
//“Devia para a vítima? “
//“Já trabalhou com a vítima? “
//Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
// entre 3 e 4 como “Cúmplice” e 5 como “Assassino”. Caso contrário, ela será classificada
// como “Inocente”.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        char resposta;

        System.out.println("Responda S para sim e N para Não");

        System.out.println("Você telefonou para a vítima?");
        resposta = scanner.next().charAt(0);
        resposta = Character.toUpperCase(resposta);
        if (resposta == 83) {
            count++;
        }

        System.out.println("Esteve no local do crime?");
        resposta = scanner.next().charAt(0);
        resposta = Character.toUpperCase(resposta);
        if (resposta == 83) {
            count++;
        }

        System.out.println("Mora perto da vítima?");
        resposta = scanner.next().charAt(0);
        resposta = Character.toUpperCase(resposta);
        if (resposta == 83) {
            count++;
        }

        System.out.println("Devia para a vítima?");
        resposta = scanner.next().charAt(0);
        resposta = Character.toUpperCase(resposta);
        if (resposta == 83) {
            count++;
        }

        System.out.println("Já trabalhou com a vítima?");
        resposta = scanner.next().charAt(0);
        resposta = Character.toUpperCase(resposta);
        if (resposta == 83) {
            count++;
        }

        if (count < 2 ) {
            System.out.println("Classificação: inocente.");
        } else if (count == 2) {
            System.out.println("Classificação: suspeito.");
        } else if (count < 5) {
            System.out.println("Classificação: cúmplice.");
        } else {
            System.out.println("Classificação: assassino.");
        }
    }
}
