package aula04;

//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//
//Álcool
//até 20 litros, desconto de 3% por litro
//acima de 20 litros, desconto de 5% por litro
//
//Gasolina
//até 20 litros, desconto de 4% por litro
//acima de 20 litros, desconto de 6% por litro
//
//	Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado
//	da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
//	sabendo-se que o preço do litro da gasolina é R$ 7,59 e o preço do litro do álcool é R$ 5,20.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char tipoCombustivel;

        do {
            System.out.println("Informe qual o tipo de combustível:");
            System.out.println("A - Álcool");
            System.out.println("G - Gasolina");
            tipoCombustivel = scanner.next().charAt(0);
            tipoCombustivel = Character.toUpperCase(tipoCombustivel);
        } while(tipoCombustivel != 65 && tipoCombustivel != 71);

        System.out.println("Digite a quantidade de combustível em litros: ");
        double quantidadeCombustivel = scanner.nextDouble();
        scanner.close();

        double alcoolDesconto = 0.03;
        double alcoolDescontoMaximo = 0.05;
        double precoAlcool = 5.20;

        double gasolinaDesconto = 0.04;
        double gasolinaDescontoMaximo = 0.06;
        double precoGasolina = 7.59;

        double desconto;
        double preco;
        if (tipoCombustivel == 65) {
            if (quantidadeCombustivel<=20) {
                desconto = quantidadeCombustivel * (1 - alcoolDesconto);
            } else {
                desconto = (20 * (1-alcoolDesconto)) + ((quantidadeCombustivel - 20) * ( 1 - alcoolDescontoMaximo));
            }
            preco = desconto * precoAlcool;
        } else {
            if (quantidadeCombustivel<=20) {
                desconto = quantidadeCombustivel * (1- gasolinaDesconto);
            } else {
                desconto = (20 * (1-gasolinaDesconto)) + ((quantidadeCombustivel - 20) * ( 1 - gasolinaDescontoMaximo));
            }
            preco = desconto * precoGasolina;
        }
        System.out.printf("Combustível selecionado %c, valor a ser pago com desconto é R$%.2f", tipoCombustivel, preco);
    }
}
