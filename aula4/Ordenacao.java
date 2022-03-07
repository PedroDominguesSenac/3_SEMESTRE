import java.util.Random;

public class Ordenacao {

    public static void mergeSort(int inicio, int tamanho, int[] v) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, v);
            mergeSort(meio, tamanho, v);
            intercalar(inicio, meio, tamanho, v);
        }
    }

    private static void intercalar(int inicio, int meio, int tamanho, int[] v) {
        int i, j, k;
        int[] auxiliar = new int[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;
        while (i < meio && j < tamanho) {
            if (v[i] <= v[j]) {
                auxiliar[k] = v[i];
                k++;
                i++;
            } else {
                auxiliar[k] = v[j];
                k++;
                j++;
            }
        }
        while (i < meio) {
            auxiliar[k] = v[i];
            k++;
            i++;
        }

        while (j < tamanho) {
            auxiliar[k] = v[j];
            k++;
            j++;
        }
        for (i = inicio; i < tamanho; i++) {
            v[i] = auxiliar[i - inicio];
        }
    }
    public static void inserir(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(500) + 1;
        }
    }
}
