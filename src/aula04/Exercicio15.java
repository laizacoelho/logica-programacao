package aula04;

//Uma loja está levantando o valor total de todas as mercadorias em estoque.
//Escreva um algoritmo que permita a entrada das seguintes informações:
//a) a quantidade de produtos que irá cadastrar
//b) para cada produto:
//      o nome do produto
//      o número total de mercadorias no estoque;
//c) o valor unitário da mercadoria.
//d) Imprimir o valor total em estoque e a média de valor das mercadorias.

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos produtos serão cadastrados agora: ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();

        String [] nomeProduto = new String[quantidadeProdutos];
        double qtdEstoque;
        double qtdTotalEstoque = 0;
        double valorMercadoria;
        double valorEstoque = 0;
        double mediaValorMercadorias;

        for (int i=0; i<quantidadeProdutos; i++) {

            System.out.printf("Informe o nome do produto %d: ", (i+1));
            nomeProduto[i] = scanner.nextLine();

            System.out.println("Informe a quantidade total desta mercadoria no estoque: ");
            qtdEstoque = scanner.nextDouble();
            qtdTotalEstoque += qtdEstoque;

            System.out.println("Informe o valor unitario desta mercadoria: ");
            valorMercadoria = scanner.nextDouble();
            scanner.nextLine();

            valorEstoque += (qtdEstoque * valorMercadoria);
        }
        scanner.close();

        mediaValorMercadorias = valorEstoque / qtdTotalEstoque;
        System.out.printf("O valor total do estoque é R$%.2f\n", valorEstoque);
        System.out.printf("O valor médio das mercadorias do estoque é R$%.2f", mediaValorMercadorias);
    }
}
