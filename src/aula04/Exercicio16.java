package aula04;

//Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armazenar
// os nomes lidos em um vetor. Após isto, o algoritmo deve permitir a leitura de
// mais 1 nome qualquer de pessoa e depois escrever a mensagem ACHEI, se o nome
// estiver entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI
// caso contrário

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]  nomes = new String[10];

        for (int i=0; i<10; i++) {
            System.out.println("Informe um nome para agenda: ");
            nomes[i] = scanner.nextLine();
            nomes[i] = nomes[i].toUpperCase();
        }

        System.out.println("Digite um nome para procurar na agenda: ");
        String nomeProcurado = scanner.nextLine();
        scanner.close();
        nomeProcurado = nomeProcurado.toUpperCase();

        boolean isNomeProcuradoNaAgenda = false;
        for (int i=0; i<10; i++) {
            if (nomeProcurado.equals(nomes[i])) {
                System.out.println("Achei!");
                isNomeProcuradoNaAgenda = true;
            }
        }
        if (!isNomeProcuradoNaAgenda) {
            System.out.println("Não achei!");
        }
    }
}
