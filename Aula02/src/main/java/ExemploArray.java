public class ExemploArray {
    public static void main(String[] args) {
        
        int[] vetorNumeros = new int[5];
        
        vetorNumeros[0] = 5;
        vetorNumeros[1] = 5000;
        vetorNumeros[2] = 4;
        vetorNumeros[3] = 25;
        vetorNumeros[4] = 39;
        
        System.out.println(vetorNumeros[0]);
        System.out.println(vetorNumeros[2]);
        
        vetorNumeros[2] = 44;
        
        System.out.println(vetorNumeros[2]);
    }
    
}