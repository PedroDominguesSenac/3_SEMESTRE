package aula5;

import java.util.Arrays;
import java.util.Random;

 class Exercicio1_QuickSort {
     
/*
 *Aprimorando do Exercicio
 * *Metodo recursivo que separa o array em subarrays
 * com referencia a posicao do elemento pivo
 */
/*    
 * Metodo de ordenação Quick sort.
 * Ordena o array.
 * @param e int - índice inicial
 * @param d int - índice final
 * @param a float[] - identificador do array
 */
   public static void quickSort(int e, int d, char[] a) {
        int i;
        if (d > e) {
            i = particao(e,d,a);
            /* Particionando o vetor */
            quickSort(e, i - 1,a);
            quickSort(i + 1, d,a);
        }
}
    
/**
 * Organizar o array em dois subarrays colocando os valores
 * menores que o pivo a esquerda e os maiores que o pivo a rireita
 * Realiza a partição do array com base no pivô.
 * @param e int - índice inicial
 * @param d int - índice final
 * @param a char[] - array a ser organizado
 * @return int - posicao do pivo
 */
    private static int particao(int e, int d,char[] a) {
        char pivo, aux;
        int i, j;
        pivo = a[d];
        i = e - 1;
        j = d;
        do {
            do {
                i = i + 1;
                //Procura o maior
            } while ((a[i] < pivo) && (i < d));
            do {
                j = j - 1;
                //Procura o menor
            } while ((a[j] > pivo) && (j > 0));
            //Aqui realiza a troca de valores
            aux = a[i];
            a[i] = a[j];
            a[j] = aux;
        } while (j > i);
        // colocando o pivo a[d] em seu lugar
        a[j] = a[i];
        a[i] = a[d];
        a[d] = aux;
        return i;
    }
    
    public static void exibir(char[] a) {
        System.out.println(Arrays.toString(a));
    }
    
    //Aprimorando do Exercicio
    public static void inserir(char[] a) {
        Random rd = new Random();
        int vinicial = 65;
        int vfinal = 122;
        
        for(int i=0; i<a.length; i++) {
          do {
          a[i] = (char) (vinicial + rd.nextInt(vfinal - vinicial)); //casting
          }
          while (a[i] >= 91 && a[i] <= 96);
        }
    }
}
