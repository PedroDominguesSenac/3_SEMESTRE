import java.util.InputMismatchException;
import java.util.Scanner;
        
public class ExemploTryCatch {
    
    public static void main(String[] args) {
        //tratarExcecao();
        dividirValores();
         
    }
    
    static void tratarExcecao() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro valido: ");
        
        try {
            int valor = leitor.nextInt();
            System.out.println("O valor digitado foi " + valor);
            
        }
        catch(InputMismatchException ime) {
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            
            System.out.println("Valor incorreto, digite um numero inteiro");
           
        }
         catch(ArithmeticException ae) {
             System.out.println("Nao e possivel dividir por zero");
         }       
      
    }
}
     

    static void dividirValores() {
    Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite dois numeros reias: ");

        String valor1 = leitor.next();
        String valor2 = leitor.next();
      
        try {

        }

    catch {

    }
        
        
}