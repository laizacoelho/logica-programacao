package aula03;

//Escreva um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: “Múltiplo de 10”.

public class Exercicio03 {
    public static void main(String[] args) {
        for( int i=1; i<=100; i++) {
            System.out.println("Contador: " + i);
            if(i % 10 == 0){
                System.out.printf("%d é múltiplo de 10.\n", i);
            }
        }
    }
}
