package aula02;
// https://docs.google.com/document/d/129SkruVme3Fidne9WoKDmlTu22grHZsGRcw6aBOQaD8/edit#

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Informe a turma deste aluno:");
        String turma = scanner.nextLine();
        System.out.println("Informe a nota da primeira prova:");
        double nota01 = scanner.nextDouble();
        System.out.println("Informe a nota da segunda prova:");
        double nota02 = scanner.nextDouble();
        System.out.println("Informe a nota da terceira prova:");
        double nota03 = scanner.nextDouble();
        double mediaNotas = (nota01 + nota02 + nota03) / 3;
        System.out.printf("%s da turma %s possui a nota média de %.2f.", nome, turma, mediaNotas);
        scanner.close();
    }
}
