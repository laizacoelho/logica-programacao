package aula03;

//Faça um programa que leia um número inteiro diferente de zero e mostre uma
// mensagem indicando se este número é positivo ou negativo. Pare a execução
// do programa quando o usuário requisitar (O programa deve parar quando o
// usuário escolher 0).


import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        do {
            System.out.println("Digite um número para saber se ele é positivo ou negativo, se deseja encerra digite 0:");
            numero =  scanner.nextDouble();
            if(numero > 0) {
                System.out.println("Este número é positivo");
            } else if (numero < 0) {
                System.out.println("Este número é negativo");
            }
        } while(numero != 0);

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
