package aula03;
//https://docs.google.com/document/d/11kFX2SMWDTUeP69gi0Ir3CxPoWemQeaxCjDViJC3Yc8/edit

//Escreva um programa que leia quatro notas escolares de um aluno e apresenta uma mensagem
// informando se o aluno foi aprovado caso apresente o valor da média escolar maior ou
// igual a 7. Caso contrário, apresente uma mensagem informando que ele está de recuperação.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;
        double[] nota = new double[4];
        for(int i=0; i<4; i++) {
            System.out.println("Digita a nota da prova " + i + ":");
            nota[i] = scanner.nextDouble();
            somaNotas = somaNotas + nota[i];
        }
        scanner.close();

        double mediaNotas =  somaNotas / 4;
        if(mediaNotas >= 7){
            System.out.printf("Aprovado, sua média é de %.2f.", mediaNotas);
        } else {
            System.out.printf("Recuperação, sua média é de %.2f.", mediaNotas);
        }
    }
}
