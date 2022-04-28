package aula03;

//Escreva um programa que recebe um número inteiro maior que zero e calcula o seu valor fatorial.
//Exemplo: Entrada usuário: 6, saída do programa: 720
//Explicação: 6 x 5 x 4 x 3 x 2 x 1 = 720

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        scanner.close();

        int fatorial = 1;
        for(int i = numero; i>0; i--){
            fatorial = fatorial * i;
        }

        System.out.printf("O fatorial de %d número é %d.", numero, fatorial);
    }
}
