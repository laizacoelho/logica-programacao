package aula03;

//Escreva um programa que receba o peso e a altura de uma pessoa e calcule o seu IMC,
// o resultado irá dizer se a pessoa está: abaixo do peso (IMC inferior a 18,5), com peso
// normal (IMC entre 18,5 a 24,9), com excesso de peso (IMC entre 25,0 a 29,9) ou
// obesa (30 ou mais de IMC), informe cada um deles com uma mensagem.
//Use a fórmula: IMC = Peso / (Altura × Altura)

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em quilogramas:");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura em metros:");
        double altura = scanner.nextDouble();
        scanner.close();

        double imc = peso / (altura * altura);

        if(imc < 18.5) {
            System.out.printf("Você está abaixo do peso ideal. IMC de %.2f", imc);
        } else if(imc < 24.9) {
            System.out.printf("Você está na faixa de peso ideal. IMC de %.2f", imc);
        } else {
            System.out.printf("Você está acima do peso ideal. IMC de %.2f", imc);
        }
    }
}
