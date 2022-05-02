package aula04;
//https://docs.google.com/document/d/18aQpJqKiiONr_KX1imdIu-IVIv1XMjNFGCecjOpL_OE/edit

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] number = new double[10];
        System.out.println("Vetor de dez números aleatórios:");
        for(int i=0; i<10; i++) {
            number[i] = random.nextDouble(100);
            System.out.printf("%.2f ", number[i]);
        }
    }
}