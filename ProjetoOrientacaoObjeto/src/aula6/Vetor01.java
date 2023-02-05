package aula6;

public class Vetor01 {

    public static void main(String[] args) {

        int n = 10;

        int vet[] = new int[n];

        for (int i = 0; i < n; i++) {

            vet[i] = i;    
        }
        for (int i = 0; i < n; i++) {

            System.out.println(i);
        }
        System.out.println("\n" + vet[6]);
    }
}
