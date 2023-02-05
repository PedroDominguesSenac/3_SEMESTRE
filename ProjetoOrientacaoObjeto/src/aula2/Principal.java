package aula2;

import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        
        //Define o leitor do teclado
        Scanner scan = new Scanner(System.in); // scan eh uma variavel/objeto instanciada(o) do tipo Scanner
        
        //Definicao de variavel local
        
        
        //Leitura do dado necessario
        System.out.println("Informe o primero numero e o segundo numero: ");
        int x = scan.nextInt(); // Aqui o uso do objeto criado pela classe scanner
        int y = scan.nextInt();
               
        
        //Cria a instancia da classa CalculoDobro, utilizando o metodo construtor
        CalculoDobro cd = new CalculoDobro(x);
        CalculoTriplo cd2 = new CalculoTriplo(y);
        
        //Imprime o resultado
        System.out.println("O dobro do primeiro numero digitado eh: " + cd.Dobro() + " o triplo do segundo numero digitado eh "+ cd2.Triplo());
    }
}
