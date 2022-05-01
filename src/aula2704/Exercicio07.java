package aula2704;

// Faça um programa que carregue uma lista com os modelos de cinco carros (exemplo de
// modelos: FUSCA, GOL, VECTRA etc). Carregue uma outra lista com o consumo desses
// carros, isto é, quantos quilômetros cada um desses carros faz com um litro de
// combustível. Calcule e mostre:
//1. O modelo do carro mais econômico;
//2. Quantos litros de combustível cada um dos carros cadastrados consome para percorrer
// uma distância de 1000 quilômetros e quanto isto custará, considerando um que a
// gasolina custe R$ 7,25 o litro.
//3. Abaixo segue uma tela de exemplo. A disposição das informações deve ser o mais próxima
// possível ao exemplo. Os dados são fictícios e podem mudar a cada execução do programa

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] modeloCarro = new String[5];
        double[] consumoCarro = new double[5];
        boolean[] isMaisEconomico = {false, false, false, false, false};
        double maisEconomico = 0;

        for (int i=0; i<5; i++) {
            System.out.printf("Informe o modelo do carro %d:\n", i+1);
            modeloCarro[i] = scanner.nextLine();

            System.out.println("Informe o consumo deste carro (km/l):");
            consumoCarro[i] = scanner.nextDouble();
            scanner.nextLine();

            if (i==0) {
                maisEconomico = consumoCarro[0];
            }

            if (maisEconomico < consumoCarro[i]) {
                for (int j=0; j<5; j++) {
                    isMaisEconomico[j] = false;
                }
                maisEconomico = consumoCarro[i];
                isMaisEconomico[i] = true;
            } else if (maisEconomico == consumoCarro[i]) {
                isMaisEconomico[i] = true;
            }
        }
        scanner.close();

        System.out.println("Comparativo de Consumo de Combustível");
        System.out.println();

        for (int i=0; i<5; i++) {
            System.out.printf("Veículo %d\n", i+1);
            System.out.printf("Nome: %s\n", modeloCarro[i]);
            System.out.printf("Km por litro: %.2f\n", consumoCarro[i]);
        }
        System.out.printf("\nRelatório final\n");
        double consumoCem;

        for (int i=0; i<5; i++) {
            consumoCem = 1000 / consumoCarro[i];
            System.out.printf("%d - %-10s -   %6.2f -  %6.2f litros - R$ %7.2f\n",
                    (i+1),modeloCarro[i],consumoCarro[i],consumoCem,(consumoCem*7.25));
        }

        for (int i=0; i<5; i++) {
            if(isMaisEconomico[i]) {
                System.out.printf("O menor consumo é do %s\n", modeloCarro[i]);
            }
        }
    }
}
