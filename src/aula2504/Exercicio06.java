package aula2504;

//Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a
// idade de uma pessoa e diga se ela pode doar sangue ou não. Use alguns dos operadores
// lógicos OU (||) e E (&&).

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        scanner.close();

        if(idade >=18 && idade <=67) {
            System.out.println("Pode doar sangue.");
        } else {
            System.out.println("Não pode doar sangue");
        }
    }
}
