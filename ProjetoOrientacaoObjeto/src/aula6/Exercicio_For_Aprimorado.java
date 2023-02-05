package aula6;

import java.util.Scanner;

public class Exercicio_For_Aprimorado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomes[] = new String[3];
        int i;
        
        for (i = 0; i < nomes.length; i++) {
            System.out.println("Informe um nome: ");
            nomes[i] = scan.nextLine();  
        }

        for (i = 0; i < nomes.length; i++) {
            System.out.printf("O nome eh: " + nomes[i] + "\n" + "Posicao do vetor" + i + "\n");
        }

        scan.close();
    }
}
