package aula04;

//A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmos
// para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
//a) Média de salário da população
//b) Média do número de filhos
//c) Maior salário dos habitantes
//d) Percentual de pessoas com salário menor que R$ 150,00
//
//Obs: O final da leitura dos dados se dará com a entrada de um “salário negativo”.

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;
        double somaSalario = 0;
        double qtdFilhos;
        double totalFilhos = 0;
        int contador = 0;
        double maiorSalario = 0;
        do {
            System.out.println("Cadastrar novo habitante");
            System.out.println("Para encerrar digite um salário negativo");
            System.out.println();

            System.out.println("Informe seu salário atual: ");
            salario = scanner.nextDouble();
            if (salario < 0) {
                break;
            }

            somaSalario += salario;
            if (maiorSalario < salario) {
                maiorSalario = salario;
            }

            System.out.println("Informe a quantidade de filhos: ");
            qtdFilhos = scanner.nextDouble();
            totalFilhos += qtdFilhos;

            contador++;
        } while(true);

        double mediaSalario = somaSalario / contador;
        double mediaFilhos = totalFilhos / contador;
        System.out.printf("A média de salário desta população é R$%.2f.\n", mediaSalario);
        System.out.printf("O maior salário é de R$%.2f.\n", maiorSalario);
        System.out.printf("A média de filhos por habitantes é %.2f", mediaFilhos);
    }
}
