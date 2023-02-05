package aula2_salario;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu salario bruto: ");
        int x = scan.nextInt();  
        
        System.out.println("Digite o desconto: ");
        int y = scan.nextInt();
    
    
        CalculoSalario cs = new CalculoSalario(x, y);
   
        System.out.println("O valor do salario liquido eh: " + cs.SalarioLiquido());  
    }
}
    
