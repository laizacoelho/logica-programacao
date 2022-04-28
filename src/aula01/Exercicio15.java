package aula01;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de cavlor comprados:");
        int quantidadeCavalos = scanner.nextInt();
        int quantidadeFerraduras = quantidadeCavalos * 4;
        System.out.printf("Será necessário comprar %d ferraduras", quantidadeFerraduras);
        scanner.close();
    }
}
