package aula2704;

//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
// metros quadrados da área a ser pintada. Considere que a cobertura da tinta é
// de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de
// 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
// Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
// preços em 2 situações:
//1. comprar apenas latas de 18 litros;
//2. comprar apenas galões de 3,6 litros;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAMANHO_LATA_DE_TINTA_01 = 18;
        final double TAMANHO_LATA_DE_TINTA_02 = 3.6;
        final double TAXA_CONVERSAO_LITRO_METRO = 6;
        System.out.println("Informe a área a ser pintada em m²:");
        double areaPintura = scanner.nextDouble();
        scanner.close();

        double conversaoMetroLitro = areaPintura / TAXA_CONVERSAO_LITRO_METRO;

        double qtdLatas = conversaoMetroLitro / TAMANHO_LATA_DE_TINTA_01;
        if ((qtdLatas % TAMANHO_LATA_DE_TINTA_01) != 0 ) {
            qtdLatas = qtdLatas + 1;
            qtdLatas = Math.round(qtdLatas);
        }
        System.out.printf("Quantidade de latas de tinta de 18 litros: %.1f\n", qtdLatas);

        double precoLata01 = 80;
        System.out.printf("Preço total para esta lata: R$%.2f\n", (qtdLatas*precoLata01));

        qtdLatas = conversaoMetroLitro / TAMANHO_LATA_DE_TINTA_02;
        if ((qtdLatas % TAMANHO_LATA_DE_TINTA_02) != 0 ) {
            qtdLatas = qtdLatas + 1;
            qtdLatas = Math.round(qtdLatas);
        }
        System.out.printf("Quantidade de latas de tinta de 3,6 litros: %.1f\n", qtdLatas);

        double precoLata02 = 25;
        System.out.printf("Preço total para esta lata: R$%.2f", (qtdLatas*precoLata02));
    }
}
