package aula04;

//Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas)
//onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
//Na sequência mostra o valor lido e a relação de notas necessárias.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe qual o valor deseja sacar: ");
        int valorSaque = scanner.nextInt();
        scanner.close();

        int[] quantidadeNotas = {0, 0, 0, 0, 0, 0, 0};
        int resto;

        quantidadeNotas[0] = valorSaque / 100;
        resto = valorSaque % 100;
        if( resto != 0) {
            quantidadeNotas[1] = resto / 50;
            resto = resto % 50;
            if (resto!=0) {
               quantidadeNotas[2] = resto / 20;
               resto = resto % 20;
               if (resto != 0) {
                   quantidadeNotas[3] = resto / 10;
                   resto = resto % 10;
                   if (resto != 0) {
                       quantidadeNotas[4] = resto / 5;
                       resto = resto % 5;
                       if (resto!=0) {
                           quantidadeNotas[5] = resto / 2;
                           resto = resto % 2;
                           if (resto != 0) {
                               quantidadeNotas[6] = resto;
                           }
                       }
                   }
               }
            }
        }
        System.out.printf("Saque solicitado de R$%d\n", valorSaque);
        System.out.println("Para o menor número de notas é necessário sacar:");
        for (int i=0; i<7; i++) {
            if(quantidadeNotas[i] != 0){
                switch (i) {
                    case 0 -> System.out.printf("%d nota(s) de cem reais.\n", quantidadeNotas[i]);
                    case 1 -> System.out.printf("%d nota(s) de cinquenta reais.\n", quantidadeNotas[i]);
                    case 2 -> System.out.printf("%d nota(s) de vinte reais.\n", quantidadeNotas[i]);
                    case 3 -> System.out.printf("%d nota(s) de dez reais.\n", quantidadeNotas[i]);
                    case 4 -> System.out.printf("%d nota(s) de cinco reais.\n", quantidadeNotas[i]);
                    case 5 -> System.out.printf("%d nota(s) de dois reais.\n", quantidadeNotas[i]);
                    case 6 -> System.out.printf("%d nota de um real.\n", quantidadeNotas[i]);
                }
            }
        }
    }
}
