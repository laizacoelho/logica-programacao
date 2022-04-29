package aula2504;

//Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:
//(1) – inserir um contato
//(2) – Remover um contato

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte menu;
        String[][] agenda =  new String[10][3];
        int count = 0;
        do {
            System.out.printf("%15s", "Menu da agenda\n");
            System.out.println("1 - Inserir contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Encerrar");
            menu = scanner.nextByte();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    if (count == 10) {
                        System.out.println("A agenda está cheia, remova um contato");
                    } else {
                        for (int i = 0; i < 10; i++) {
                            if (agenda[i][0] == null) {
                                System.out.println("Digite o nome do contato: ");
                                agenda[i][0] = scanner.nextLine();
                                agenda[i][0] = agenda[i][0].toUpperCase();

                                System.out.println("Digite o numero de telefone com DDD");
                                agenda[i][1] = scanner.nextLine();

                                System.out.println("Digite a idade do contato:");
                                agenda[i][2] = scanner.nextLine();
                                count++;
                                i=10;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do contato que deseja remover: ");
                    String remover = scanner.nextLine();
                    remover = remover.toUpperCase();
                    boolean isContatoRemovido = false;
                    for (int i=0; i<10; i++) {
                        if (remover.equals(agenda[i][0])) {
                            agenda[i][0] = null;
                            agenda[i][1] = null;
                            agenda[i][2] = null;
                            isContatoRemovido = true;
                            count--;
                            System.out.println("Contato removido");
                        }
                    }
                    if (!isContatoRemovido) {
                        System.out.println("Nome não encontrado");
                    }
                    break;
            }
        } while(menu != 3);
        scanner.close();
        System.out.println("Programa encerrado");
    }
}
