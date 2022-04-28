package aula04;

//Leia um número inteiro que representa um código de DDD para discagem interurbana.
//Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
//
//	Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
//DDD nao cadastrado
//
//Entrada
//A entrada consiste de um único valor inteiro.
//
//Saída
//Imprima o nome da cidade correspondente ao DDD existente na entrada.
//Imprima DDD não cadastrado caso não exista o DDD correspondente ao número digitado.
//
//DDD
//DESTINO
//61 Brasília
//71 Salvador
//11 São Paulo
//21 Rio de Janeiro
//32 Juiz de Fora
//19 Campinas
//27 Vitória
//31 Belo Horizonte

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o DDD");
        int ddd = scanner.nextInt();
        scanner.close();

        switch (ddd) {
            case 61 -> System.out.println("Cidade: Brasília");
            case 71 -> System.out.println("Cidade: Salvador");
            case 11 -> System.out.println("Cidade: São Paulo");
            case 21 -> System.out.println("Cidade: Rio de Janeiro");
            case 32 -> System.out.println("Cidade: Juiz de Fora");
            case 19 -> System.out.println("Cidade: Campinas");
            case 27 -> System.out.println("Cidade Vitória");
            case 31 -> System.out.println("Belo Horizonte");
            default -> System.out.println("DDD não cadastrado");
        }
    }
}
