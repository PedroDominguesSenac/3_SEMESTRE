import java.util.Scanner;

public class ExemploRepeticao {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
     
        int op;   
        do {
            System.out.println("Digite a op desejada: \n");
            System.out.println(" 1 - Cadastro");
            System.out.println(" 2 - Consulta");
            System.out.println(" 3 - Opcoes");
            System.out.println(" 4 - Sair");
            System.out.println("OPCAO: ");
            op = leitor.nextInt();
        } while (op < 1 && op > 4);
    }
}
    
    //contagem regrassiva 
    /* for (int i = 10; i >= 1; i--) {
        System.out.print(i + "...");
        /* contagem 1 a 10 
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);*/
        
    /* int i = 1;
        
       while (i <= 1000) {
           if (i % 2 == 0) {
           System.out.println(i);
           }
            i++;
        }
        
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um nome");
        
    String nome = leitor.nextLine();
         
          
    while (nome.equals("")) {
       nome = leitor.nextLine();
    }
    */

    /*    
        String nome;
        do {
            nome = leitor.nextLine();
        } while(nome.equals(""));
    */