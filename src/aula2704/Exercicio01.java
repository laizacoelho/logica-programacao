package aula2704;

//https://docs.google.com/document/d/1uXKq8SXXZoGRUjr5tZZ8G3nTnAQNSO4w3gsEHrIj_RQ/view
//Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
// No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados.
// O seu resultado fica sendo a média dos três valores restantes. Você deve fazer um programa
// que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois
// informe a média dos saltos conforme a descrição acima informada (retirar o melhor e o pior
// salto e depois calcular a média). Faça uso de uma lista para armazenar os saltos. Os saltos
// são informados na ordem da execução, portanto não são ordenados.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] saltos = new double[5];
        double maiorSalto = 0;
        double menorSalto = 0;

        for (int i=0; i<5; i++) {
            System.out.printf("Informe o resultado do salto %d: ", (i+1));
            saltos[i] = scanner.nextDouble();
            if(i==0) {
                maiorSalto = saltos[0];
                menorSalto = saltos[0];
            } else {
                if (maiorSalto < saltos[i]) {
                    maiorSalto = saltos[i];
                }
                if (menorSalto > saltos[i]) {
                    menorSalto = saltos[i];
                }
            }
        }
        scanner.close();
        double somaSaltos = 0;
        for (int i=0; i<5; i++){
            if (saltos[i] != maiorSalto && saltos[i] != menorSalto) {
                somaSaltos += saltos[i];
            }
        }
        System.out.printf("Melhor salto: %.2f\n", maiorSalto);
        System.out.printf("Pior salto: %.2f\n", menorSalto);
        System.out.printf("Média dos demais saltos: %.2f", (somaSaltos/3));
    }
}
