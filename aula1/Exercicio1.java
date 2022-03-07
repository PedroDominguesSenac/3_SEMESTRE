/*
* Implementar um arrray unidemensional do tipo inteiro que armazene valores 
* aleatorios
*/
package aula1;

import java.util.Random;
import java.util.Arrays;


public class Exercicio1 {
    
    public static final int TAM = 20; {
        
    }
    
    public static void main(String[] args) {
        int[] v = new int[TAM];
                
    }
    
    public static void inserir(int[] v) {
        Random rd = new Random();
        
        int vi = 4, vf = 200;
        
        for(int i=0; i < v.length; i++) {
            inserir(v);
            mostrar(v);
            
            v[i] = vi + rd.nextInt(vf - vi); // poderia colocar um valor, mas 
            // no caso do Float, é preciso utilizar parametro dessa forma           
        }   
    }
    
    public static void mostrar(int[] v) {
        for(int i:v) {
            System.out.println(i);
            
            System.out.println(Arrays.toString(v));
            
        }  
    }
}
