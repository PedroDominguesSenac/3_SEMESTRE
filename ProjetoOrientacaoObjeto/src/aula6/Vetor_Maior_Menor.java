package aula6;

import java.util.Scanner;

public class Vetor_Maior_Menor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 5;
        int vet[] = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %2do. valor %d: ", (i + 1), n);
            vet[i] = scan.nextInt();
        }

        int soma = 0;
        int menor = vet[0];
        int maior = vet[0];

        for (i = 0; i < n; i++) {
            soma += vet[i];

            if (vet[i] < menor) {
                menor = vet[i];
            }
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }

        System.out.println("\n\t\t - Saidas -\n");
        for (i = 0; i < n; i++) {
            if (vet[i] == menor) {
                System.out.printf("vet[%d] = %d <---- menor valor\n", i, vet[i]);
            } else if (vet[i] == maior) {
                System.out.printf("vet[%d] = %d <---- maior valor\n", i, vet[i]);   
            } else {
                System.out.printf("vet[%d] = %d\n", i, vet[i]);
            }
        }
        scan.close();
    }
}
