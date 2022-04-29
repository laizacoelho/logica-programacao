package aula2504;

//Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa
// que receba código e valor de 15 transações usando laços de repetição. Calcule e mostre:
// - O valor total das compras à vista
// - O valor total das compras a prazo.
// - O valor total das compras efetuadas
//O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char tipoOperacao;
        double totalAVista = 0;
        double totalPrazo = 0;
        double totalCompras = 0;
        int i = 0;
        while (i < 15) {
            System.out.println("Informe o código da operação:");
            System.out.println("V - à vista");
            System.out.println("P - prazo");
            tipoOperacao = scanner.next().charAt(0);
            tipoOperacao = Character.toUpperCase(tipoOperacao);
            if (tipoOperacao == 86 || tipoOperacao == 80) {
                System.out.println("Qual o valor da compra?");
                double valorCompra = scanner.nextDouble();
                if (tipoOperacao == 86) {
                    totalAVista += valorCompra;
                } else {
                    totalPrazo += valorCompra;
                    System.out.printf("O valor da primeira prestação é R$%.2f\n", (valorCompra/3));
                }
                totalCompras += valorCompra;
                i++;
            }
        }
        scanner.close();
        System.out.printf("O valor todal de compras foi de R$%.2f\n", totalCompras);
        System.out.printf("Sendo R$%.2f o total à vista ", totalAVista);
        System.out.printf("e R$%.2f o total à prazo.", totalPrazo);
    }
}
