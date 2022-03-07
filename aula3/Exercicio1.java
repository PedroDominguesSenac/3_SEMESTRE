package aula3;

import java.util.Random;

public class Exercicio1 {
    
    public static void main(String[] args) {
        float[][] v = new float[5][3];
    
    
    public static void insertionSort(int[][] v) {
        
     
    
        for(int i=1; i<v.length; i++) {
            int temp = v[i];
            int j=i;
            while(j>0 && v[j - 1] > temp) {
                v[i] = v[j -1];
                j--; // j=j-1;
            }
            v[j] = temp;
        }
           Random rd = new Random();
        
        int start = 5;
        int end = 30;
        
        for(int i=0; < v.length; i++) {
           for(int j=0; j < v.length; j++) {
               
               v[i][j] = rd.nextFloat() * (start - end);    
           }  
        
    }
      public static void exibir(float[][] v) {
        
        for(int i=0; i < v.length; i++) {
            for(int j=0; j < v.length; j++) {
               System.out.printf("%.1f \n", v[i][j]);  
            }
        }
        
      }
    }
}



public static void inserir(float[][] m) {
        
       Random rd = new Random();
       
       int vinicial = 0;
       int vfinal = 100;

 for(int i=1; i<v.length; i++) {
            int temp = v[i];
            int j=i;
            while(j>0 && v[j - 1] > temp) {
                v[i] = v[j -1];
                j--; // j=j-1;
            }
            v[j] = temp;
       
       for(int i=0; i < m.length; i++) {
           for(int j=0; j < m.length; j++) {
               
               m[i][j] = rd.nextFloat() * (vfinal - vinicial); 
