package aula2704;

//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
// rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior
// que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
// deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça
// um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar
// na variável excesso a quantidade de quilos além do limite e na variável multa o
// valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens
// adequadas.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double MULTA_POR_QUILO = 4;
        System.out.println("Sr. João, informe a quantidade de peixe pescado em quilos: ");
        double peso = scanner.nextDouble();

        if(peso <= 50) {
            System.out.println("Não há multa a pagar!");
        } else {
            double excesso = peso - 50;
            double multa = excesso * MULTA_POR_QUILO;
            System.out.printf("Execesso pescado: %.2f\n", excesso);
            System.out.printf("Multa por excesso: R$%.2f", multa);
        }
    }
}
