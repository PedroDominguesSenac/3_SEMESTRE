package ado2;

import java.util.Scanner;

public class Main {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int op = -1;
        int po = -1;
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        while (po != 0) {
            System.out.println("\n0 - Sair\n"
                    + "1 - Lista\n"
                    + "2 - Pilha\n");

            po = leitor.nextInt();

            if (po == 1) {
                while (op != 0) {

                    System.out.println("\n0 - Sair\n"
                            + "1 - Inserir\n"
                            + "2 - Remover\n"
                            + "3 - Tamanho\n"
                            + "4 - Frente\n"
                            + "5 - Empty");
                    op = leitor.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Digite numero que quer inserir:");
                            int num = leitor.nextInt();
                            fila.inserir(num);
                            fila.exibir();
                            op = -1;
                            break;
                        case 2:
                            fila.remover();
                            fila.exibir();
                            op = -1;
                            break;
                        case 3:
                            fila.tamanho();
                            op = -1;
                            break;
                        case 4:
                            fila.frente();
                            op = -1;
                            break;
                        case 5:
                            if (fila.Empty() == true) {
                                System.out.println("Pilha Vazia!");
                            } else {
                                System.out.println("Pilha com elementos!");
                            }
                            op = -1;
                            break;
                    }
                }
                po = -1;
            }

//                    break;
            if (po == 2) {
                while (op != 0) {

                    System.out.println("\n0 - Sair\n"
                            + "1 - Inserir\n"
                            + "2 - Remover\n"
                            + "3 - Tamanho\n"
                            + "4 - Topo\n"
                            + "5 - Empty");
                    op = leitor.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Digite numero que quer inserir:");
                            int num = leitor.nextInt();
                            pilha.inserir(num);
                            pilha.exibir();
                            op = -1;
                            break;
                        case 2:
                            pilha.remover();
                            pilha.exibir();
                            op = -1;
                            break;
                        case 3:
                            pilha.tamanho();
                            op = -1;
                            break;
                        case 4:
                            pilha.topo();
                            op = -1;
                            break;
                        case 5:
                            if (pilha.Empty() == true) {
                                System.out.println("Pilha Vazia!");
                            } else {
                                System.out.println("Pilha com elementos!");
                            }
                            op = -1;
                            break;
                    }
                }
                po = -1;
            }
            break;
        }
    }
}
