package aula5;
 
import java.util.Arrays;
import java.util.Random;

public class Exercicio3_Merge {
    
    private static Pet[] lista = new Pet[10];
    
    private static int n = 0; 
    
    public static void inserir(Pet pet) {
        
        lista[n] = pet;
        n++;
        mergeSort(0, n, lista);
    }
    
    public static void exibir() {
        
        for(int i=0; i<n; i++) {
            System.out.println(lista[i]);
        }   
    }
    
     public static void mergeSort(int inicio, int tamanho, Pet[] v) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, v);
            mergeSort(meio, tamanho, v);
            intercalar(inicio, meio, tamanho, v);
        }
    }

    private static void intercalar(int inicio, int meio, int tamanho, Pet[] v) {
        int i, j, k;
        
        Pet[] auxiliar = new Pet[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;
        
        while (i < meio && j < tamanho) {
            if (v[i].getNome().compareTo(v[j].getNome()) < 0) {
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
        
    public static void exibir(String[] a) {
           System.out.println(Arrays.toString(a));   
    }
}
