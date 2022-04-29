package aula2504;

//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são
// do imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o
// Sindicato e que o FGTS corresponde a 11% do salário bruto, mas não é descontado (é a
// empresa que deposita.)
//
//O salário líquido corresponde ao salário bruto menos os descontos. O programa deverá pedir
// ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
//
//a. Desconto do IR;
//b. Salário Bruto até R$900,00 (inclusive) – Isento;
//c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
//d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
//e. Salário bruto acima de 2500 – Desconto de 20%.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da sua hora trabalhada:");
        double salarioHora = scanner.nextDouble();

        System.out.println("Informe quantas horas trabalha por mês: ");
        double qtdHoraMes = scanner.nextDouble();
        scanner.close();

        double salarioMes = salarioHora * qtdHoraMes;
        double descontoSindicato = salarioMes * 0.03;
        double fgts = salarioMes * 0.11;
        double descontoIr;

        if (salarioMes <= 900) {
            descontoIr = 0;
        } else if (salarioMes <= 1500) {
            descontoIr = salarioMes * 0.05;
        } else if (salarioMes <= 2500) {
            descontoIr = salarioMes * 0.10;
        } else {
            descontoIr = salarioMes * 0.2;
        }

        double salarioLiquido = salarioMes - descontoSindicato - descontoIr;
        System.out.printf("O seu salário líquido é R$%.2f.\n", salarioLiquido);
        System.out.printf("O seu FGTS é de R$%.2f", fgts);
    }
}
