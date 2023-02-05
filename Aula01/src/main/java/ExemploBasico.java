import java.util.Scanner;

public class ExemploBasico {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
        String a, b, c;
    
        System.out.println("Digite um nome");
        a = teclado.next();
        
        System.out.println("Digite outro nome");
        b = teclado.next();
        
        c = a + b;
        
        System.out.println("O primero nome junto ao segundo nome, fica: " + c);  

    /*
    int val1, val2, resultado;
    
        System.out.println("Digite um numero");
        val1 = teclado.nextInt();
        
        System.out.println("Digite outro numero");
        val2 = teclado.nextInt();
        
        resultado = (val1 + val2);
        
        System.out.println("Resultado = "+ resultado);
        
        
        float val3 = 5.20f;
        double val4 = 10;
        
        boolean val5 = true;
        
        String nome = "Pedro";
        char caracter = 'P';
    */
    } 
}
