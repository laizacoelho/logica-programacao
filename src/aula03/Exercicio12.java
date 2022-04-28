package aula03;

//Escreva um programa que leia e valide as seguintes informações:
//        Nome: maior que 3 caracteres;
//        Idade: entre 0 e 150
//        Salário: maior que 0
//        Sexo: ‘f’ ou ‘m’
//        Estado civil: ‘s’, ‘c’, ‘v’, ‘d’


import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "a";
        do{
            System.out.println("Qual o seu nome?");
            System.out.println("O nome precisa ter mais de 3 letras.");
            nome = scanner.nextLine();
        } while (nome.length() < 4);

        int idade = 0;
        do{
            System.out.println("Qual a sua idade?");
            System.out.println("A idade precisa ser maior que zero e menor que 150.");
            idade = scanner.nextInt();
        } while(idade<=0 || idade >=150);

        double salario = 0;
        do {
            System.out.println("Qual o seu salário?");
            System.out.println("O salário precisa ser maior que zero.");
            salario = scanner.nextDouble();
        } while(salario<=0);

       char sexo = 33;
        do {
            System.out.println("Qual o seu sexo (responda F para feminino ou M para masculino)?");
            sexo = scanner.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
        }while(sexo != 70 && sexo != 77);

        char estadoCivil = 33;
        do{
            System.out.println("Qual seu estado civil (responda S para solteiro, C para casado, " +
                    "V para viúvo e D para divorciado)");
            estadoCivil = scanner.next().charAt(0);
            estadoCivil = Character.toUpperCase(estadoCivil);

        }while (estadoCivil != 83 && estadoCivil != 67 && estadoCivil != 86 && estadoCivil != 68);
        scanner.close();

        System.out.printf("Nome: %s, Idade: %d, Salário: R$%.2f, Sexo: %c, Estado civil: %c", nome, idade, salario, sexo, estadoCivil);
    }
}
