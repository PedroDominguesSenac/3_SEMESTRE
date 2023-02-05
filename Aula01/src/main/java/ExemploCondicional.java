import java.util.Scanner;

public class ExemploCondicional {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        // exemplo de if com idade 
        System.out.println("Digite sua idade");
        
        int idade = leitor.nextInt();
        
        // exemplo de operadores relacionais >= <= == !=
        // exemplo de operadores logicos && ||
        // && todas condicoes tem que ser verdadeiras para nao ir para o else
        // || so vai para o else se as duas condicoes no caso forem falsas
        
        if (idade >= 16 && idade <= 65) {
             if (idade < 18) {
            System.out.println("Tire o titulo de eleitor");
        }
        else {
            System.out.println("Verifique a situacao do seu titulo de eleitor");   
        }         
        }
                
        /*
        //É a mesma coisa se fizer dessa forma:
        
        else {
            if (idade < 16) {
                System.out.println("Nao pode retirar o titulo de eleitor");                
            }
            else {
                System.out.println("Va jogar bingo");
            }
        }
        */    
        
        // ou se fizer dessa forma:
        
        else if (idade < 16) {
            System.out.println("Nao pode retirar o titulo de eleitor");                
        }
        else {
            System.out.println("Va jogar bingo");
        }
        
        System.out.println("Selecione uma opcao");
        System.out.println("1 - Cadastro");
        System.out.println("2 - Consultar");
        System.out.println("3 - Sair");
        
        int op = leitor.nextInt();
        
        switch(op) {
            case 1:
                System.out.println("Voce esta no cadastro");
                break;            
            case 2:
                System.out.println("Voce esta na consulta");
                break;
            default:
                    System.out.println("Saindo");
             
        }
        
    }
}
   
    /* 
    exemplo a vida de um jogador, se fosse menor maior que 
    zero continua jogando, se for menor vai pro else.
    
        int vida = 100;
        
       if (vida > 0) {
           
       }
       else {  
       }
       */      
     


