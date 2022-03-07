package aula2;

//import java.util.Arrays;
import java.util.Random;

public class Exercicio1 {
    
    public static void main(String[] args) {
        float[][] m = new float[3][5];
        
        inserir(m);
        exibir(m);
    }
  
    public static void inserir(float[][] m) {
        
       Random rd = new Random();
       
       int vinicial = 0;
       int vfinal = 100;
       
       for(int i=0; i < m.length; i++) {
           for(int j=0; j < m.length; j++) {
               
               m[i][j] = rd.nextFloat() * (vfinal - vinicial); 
               
            }
        }
    }
    
    public static void exibir(float[][] m) {
        
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m.length; j++) {
               System.out.printf("%.1f \n", m[i][j]);  
            }
        }  
    }
}
        
     
        /*
        * Usando um for aprimorado
        */
        
        /*
        for(float[] i:m) {
           for(float j:i) {
               System.out.println(j + " | ");
               
               System.out.println("");
        */
        /*
        * Somente utilizando (Arrayas.deepToString(m)).replace("]", "exempo");
        */
        
        /*
        System.out.println(Arrays.deepToString(m).replace("],","-----").replace("[","--"));
        */