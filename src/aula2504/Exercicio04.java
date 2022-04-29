package aula2504;

//Leia a velocidade máxima permitida em uma avenida e a velocidade com que o motorista
// estava dirigindo nela e calcule a multa que uma pessoa vai receber, sabendo que são pagos:
//	a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida
//	(ex.: velocidade máxima: 50km/h; motorista a 60km/h ou a 56km/h);
//	b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
//	c) 200 reais, se estiver acima de 31km/h da velocidade permitida.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a velocidade máxima da via?");
        double velocidadeMax = scanner.nextDouble();

        System.out.println("Qual a velocidade do veículo no momento?");
        double velocidadeVeiculo = scanner.nextDouble();
        scanner.close();

        int multa = 0;
        if (velocidadeVeiculo > velocidadeMax) {
            if (velocidadeVeiculo <= (velocidadeMax + 10)) {
                multa = 50;
            } else if (velocidadeVeiculo <= (velocidadeMax + 30)) {
                multa = 100;
            } else {
                multa = 200;
            }
            System.out.printf("Velocidade maior que a permitida, multa de R$%d", multa);
        } else
            System.out.println("Velocidade dentro do permitido pela via");
    }
}
