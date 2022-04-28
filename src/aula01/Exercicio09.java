package aula01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String aluno = scanner.nextLine();
        System.out.println("Digite a nota da primeira prova:");
        double nota01 = scanner.nextDouble();
        System.out.println("Digite a nota da segunda prova:");
        double nota02 = scanner.nextDouble();
        System.out.println("Digite a nota da terceira prova:");
        double nota03 = scanner.nextDouble();
        double notaMedia = (nota01 + nota02 + nota03) / 3;
        System.out.printf("A nota média de %s é %.2f", aluno, notaMedia);
        scanner.close();
    }
}
