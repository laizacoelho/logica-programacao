package aula2704;

//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
// quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para
// cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
// Informe ao usuário a quantidade de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAMANHO_LATA_DE_TINTA = 18;
        final double TAXA_CONVERSAO_LITRO_METRO = 3;
        System.out.println("Informe a área a ser pintada em m²:");
        double areaPintura = scanner.nextDouble();
        scanner.close();

        double conversaoMetroLitro = areaPintura / TAXA_CONVERSAO_LITRO_METRO;
        double qtdLatas = conversaoMetroLitro / TAMANHO_LATA_DE_TINTA;
        if ((qtdLatas % TAMANHO_LATA_DE_TINTA) != 0 ) {
            qtdLatas = qtdLatas + 1;
            qtdLatas = Math.round(qtdLatas);
        }
        System.out.printf("Quantidade de latas de tinta: %.1f\n", qtdLatas);

        double precoLata = 80;
        System.out.printf("Preço total: R$%.2f", (qtdLatas*precoLata));
    }
}
