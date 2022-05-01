package aula2704;

//Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes
//de trânsito. Foram obtidos os seguintes dados:
//a- Código da cidade;
//b- Número de veículos de passeio (em 2021);
//c- Número de acidentes de trânsito com vítimas (em 2021). Deseja-se saber:
//d- Qual o maior e menor índice de acidentes de trânsito e a que cidade pertence;
//e- Qual a média de veículos nas cinco cidades juntas;
//f- Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] dadosAcidente = new double[5][3];

        double maiorIndice = 0;
        boolean[] isMaiorIndice = {false, false, false, false, false};

        double menorIndice = 0;
        boolean[] isMenorIndice = {false, false, false, false, false};

        double indice;

        double somaVeiculosTodasCidades = 0;
        double somaAcidentesCidadesPequenas = 0;
        double qtdCidadesPequenas = 0;

        for (int i=0; i<5; i++) {
            System.out.println("Informe o código (numérico) da cidade:");
            dadosAcidente[i][0] = scanner.nextDouble();

            System.out.println("Informe o número de veículos de passeio em 2021:");
            dadosAcidente[i][1] = scanner.nextDouble();
            somaVeiculosTodasCidades += dadosAcidente[i][1];

            System.out.println("Informe o número de acidentes de trânsito com vítimas em 2021:");
            dadosAcidente[i][2] = scanner.nextDouble();
            if (dadosAcidente[i][1] < 2000) {
                somaAcidentesCidadesPequenas += dadosAcidente[i][2];
                qtdCidadesPequenas++;
            }

            indice = dadosAcidente[i][2] / dadosAcidente[i][1];

            if (i == 0){
                maiorIndice = indice;
                menorIndice = indice;
            }
            if (maiorIndice < indice) {
                for (int j=0; j<5; j++) {
                    isMaiorIndice[j] = false;
                }
                maiorIndice = indice;
                isMaiorIndice[i] = true;
            } else if (maiorIndice == indice) {
                isMaiorIndice[i] = true;
            }

            if (menorIndice > indice) {
                for (int j=0; j<5; j++) {
                    isMenorIndice[j] = false;
                }
                menorIndice = indice;
                isMenorIndice[i] = true;
            } else if (menorIndice == indice) {
                isMenorIndice[i] = true;
            }
        }
        scanner.close();
        System.out.printf("A média de veículos das cinco cidades é %.2f\n", (somaVeiculosTodasCidades/5));
        System.out.printf("a média de acidentes de trânsito nas cidades com menos de 2 mil veículos é %.2f\n",
                (somaAcidentesCidadesPequenas/qtdCidadesPequenas));

        System.out.println("Cidade(s) com maior índice de acidentes:");
        for (int i=0; i<5; i++){
            if (isMaiorIndice[i]) {
                System.out.printf("Código %.0f: índice de %.2f\n", dadosAcidente[i][0],maiorIndice);
            }
        }

        System.out.println("Cidade(s) com menor índice de acidentes:");
        for (int i=0; i<5; i++){
            if (isMenorIndice[i]) {
                System.out.printf("Código %.0f: índice de %.2f\n", dadosAcidente[i][0],menorIndice);
            }
        }
    }
}
