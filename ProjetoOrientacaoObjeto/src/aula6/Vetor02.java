package aula6;

import java.util.Scanner;

public class Vetor02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = scan.nextInt();

        int vet[] = new int[n];

        for (int i = 0; i < n; i++) {

            vet[i] = i;
        }
        for (int i = 0; i < n; i++) {

            System.out.println(i);
            
        }
        System.out.println(vet[6]);
        
        scan.close();
          
    }
}
