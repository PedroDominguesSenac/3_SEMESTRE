/*
* Elabore um algoritmo que insira valores aleatorios inteiros em um array de 
* tamanho 100. Exiba apenas os multiplos de 5
*/

package aula1;

import java.util.Random;

public class Exercicio2 {
    
    public static void main(String[] args) {
        int[] v = new int[10]; 
        inserir(v);
        mostrar(v);    
    }
    
    public static void inserir(int[] v) {
        Random rd = new Random();
        
       for(int i=0; i < v.length; i++){
           v[i] = 1+rd.nextInt(11);           
       }    
    }
    
    public static void mostrar(int[] v) {
        for(int i:v) {
            if(i % 5 == 0)
                System.out.println(i);
        }
    } 
}
