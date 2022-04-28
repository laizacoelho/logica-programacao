package aula01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double massa;
        double altura;
        double tempo;
        double potenciaEmCavalos;
        System.out.println("Digite a massa do objeto em quilogramas:");
        massa = scanner.nextDouble();
        System.out.println("Digite a altura em metros que deseja levantar este objeto:");
        altura = scanner.nextDouble();
        System.out.println("Digite o tempo em segundos que deseja levantar este objeto:");
        tempo = scanner.nextDouble();
        potenciaEmCavalos = (massa * altura / tempo)/745.6999;
        System.out.printf("Serão necessários %.4f cavalos para levantar %.2f quilos a %.2f metros em %.2f segundos \n", potenciaEmCavalos, massa, altura, tempo);
    }
}
