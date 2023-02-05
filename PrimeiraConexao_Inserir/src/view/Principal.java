package view;

import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws SQLException {
          
        Scanner sc = new Scanner(System.in);
        int op = 0;
        
        //Instanciando as classes auxiliares de Listagem e de Inserção
        //Instanciando a classe auxiliar de Listagem
        ListagemCarros lstCarros = new ListagemCarros();
        InsereCarro insCarro = new InsereCarro();

        while (op != 5) {
            System.out.println("\t ----  MENU  --- ");
            System.out.println("\t1. Listar");
            System.out.println("\t2. Inserir");
            System.out.println("\t5. Sair");
            System.out.print("\n\tEscolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    lstCarros.listaTodosCarros();
                    break;
                case 2:
                    insCarro.InsereCarro();
                    break;
                case 5:
                    break;
                default:
                    //throw new AssertionError();
                    System.out.println("\n\t -- Opção inválida! -- \n");
                    
            }
        }
    }

}
