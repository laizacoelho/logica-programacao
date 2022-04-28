package aula04;

//Escreva um código que leia um vetor G de 10 elementos do tipo caracter que
// representa o gabarito de uma prova. A seguir, para cada um dos 10 alunos
// da turma, leia o vetor de respostas (R) do aluno e conte o número de acertos.
// Mostre o número de acertos do aluno e uma mensagem APROVADO, se a nota for
// maior ou igual a 6; e mostre uma mensagem de REPROVADO, caso contrário.

import java.util.Random;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char[] respostas = new char[10];
        char[] gabarito = new char[10];
        int contadorAcertos = 0;

        System.out.println("Use A, B, C, D e E para responder as questões");
        for (int i=0; i<10; i++) {
           gabarito[i] = (char)(random.nextInt(5) + 65);

            System.out.printf("Informe a resposta da questão %d: ", (i+1));
            respostas[i] = scanner.next().charAt(0);
            respostas[i] = Character.toUpperCase(respostas[i]);

            if(respostas[i] == gabarito[i]) {
                contadorAcertos++;
            }
        }
        scanner.close();

        System.out.println("Gabarito: ");
        for (int i=0; i<10; i++) {
            System.out.printf(" %c", gabarito[i]);
        }
        if(contadorAcertos>=6) {
            System.out.printf("\nVocê está aprovado(a). Obteve %d acerto(s)", contadorAcertos);
        } else {
            System.out.printf("\nVocê está reprovado(a). Obteve %d acerto(s)", contadorAcertos);
        }
    }
}
