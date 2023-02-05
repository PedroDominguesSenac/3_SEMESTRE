package aula6;

public class Length {

    public static void main(String[] args) {

        String nomes[] = {"Pedro", "Domingues", "Santos"};

        int i, n = nomes.length;

        for (i = 0; i < n; i++) {
            System.out.printf("O %d nome eh: %s\n", (i + 1), nomes[i]);
        }
    }
}
