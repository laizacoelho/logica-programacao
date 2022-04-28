package aula02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] praia = new String[5];
        double[] distanciaPraia = new double[5];
        boolean[] maisLonge = {false, false, false, false, false};
        double auxMaisLonge = 0;
        int contador = 0;
        double somaDistancias = 0;

        for(int i=0; i<5; i++){
            System.out.println("Informe o nome da praia:");
            praia[i] = scanner.nextLine();
            System.out.println("Informe a distância em quilômetros");
            distanciaPraia[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        scanner.close();

        for (int i=0; i<5; i++){
            if (distanciaPraia[i] > 10 && distanciaPraia[i] < 15){
                contador++;
                System.out.printf("%s está a mais de 10km e a menos de 15km de distância \n", praia[i]);
            }

            somaDistancias = somaDistancias + distanciaPraia[i];

            if(distanciaPraia[i] >= auxMaisLonge){
                if(distanciaPraia[i] > auxMaisLonge){
                    for(int j=0; j<5; j++){
                        maisLonge[j] = false;
                    }
                }
                auxMaisLonge = distanciaPraia[i];
                maisLonge[i] = true;
            }

        }

        if (contador > 0) {
            System.out.printf("%d é total de praias a mais de 10km e a menos de 15km de distância \n", contador);
        } else{
            System.out.println("Nenhuma praia está a mais de 10km e a menos de 15km de distância \n");
        }

        double mediaDistancias = somaDistancias / 5;
        System.out.printf("\nA distância média das praias é de %.2f km\n", mediaDistancias);

        System.out.println("\nPraia(s) mais distante(s):");
        for(int i=0; i<5; i++){
            if(maisLonge[i]){
                System.out.printf(" %s a %.2f km.\n", praia[i], distanciaPraia[i]);
            }
        }
    }
}
