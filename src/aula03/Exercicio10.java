package aula03;
//Escreva um programa que gera um número inteiro aleatório entre 1 e 10 e peça que o
// usuário informe o número correto, você deve dar dicas caso o palpite esteja errado,
// informando se o número correto é maior ou menor do que o informado,  caso ele erre
// três vezes o programa se encerra e imprime uma mensagem informando que ele perdeu.


import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tries = 1;
        int number = rand.nextInt(10) + 1;

        int guessNumber;
        boolean isRight = false;
        while(tries <= 3) {
            System.out.println("Adivinhe o número (1 a 10):");
            guessNumber = scanner.nextInt();
            if(number == guessNumber) {
                System.out.println("Parabéns, você acertou!");
                isRight = true;
                break;
            } else if( number < guessNumber) {
                System.out.printf("O número secreto é menor que %d.\n", guessNumber);
            } else {
                System.out.printf("O número secreto é maior que %d.\n", guessNumber);
            }
            tries++;
        }
        scanner.close();

        if(!isRight) {
            System.out.println("Você perdeu!");
        }
    }
}
