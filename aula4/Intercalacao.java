package aula4;
//Intercalacao

import java.util.Arrays;

public class Intercalacao {
    
    public static void main(String[] args) {
       int[] a = {2, 4, 6, 7, 14};
       int[] b = {2, 8, 11, 22, 44, 57};
       int[] c = intercalar(a, b);
        System.out.println(Arrays.toString(c));
    }
    
    public static int[] intercalar(int[] a, int[] b) {
        
        int[] c = new int[a.length + b.length];
        
        int i=0, j=0, k=0;
        
        while(i < a.length && j < b.length) {
            
            if(a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;   
            }else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < a.length) {
            c[k] = a[i];
            j++;
            k++;   
        }
        while(j < b.length) {
            c[k] = b[j];
            j++;
            k++;   
        }
         return c;
    }
}