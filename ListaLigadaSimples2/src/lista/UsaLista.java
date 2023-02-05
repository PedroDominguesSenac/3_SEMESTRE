package lista;

import java.util.Scanner;

public class UsaLista {

    public static void main(String[] args) { 
        Scanner teclado=new Scanner(System.in);
        Lista lista=new Lista();
        
        Carro carro1=new Carro(123, 200000, 2014, "VW", "Fox");
        Carro carro2=new Carro(234, 23677, 2022, "VW", "Jetta"); 
        Carro carro3=new Carro(456, 24567, 2022, "BMW", "X6"); 
        Carro carro4=new Carro(765, 20000, 2022, "Mercedes", "GLA"); 
        
        lista.inserir(carro1);
        lista.inserir(carro2); 
        lista.inserir(carro3); 
        lista.inserir(carro4); 
        
        System.out.println("=== Sem remover ===");
        lista.exibir();
        
        System.out.println("=== Removendo ====");
        if(lista.remover(123)){
            System.out.println("Removido com sucesso!");
        }else{
            System.out.println("Não removido!");
        }
        lista.exibir();
        /*System.out.println("Digite o id desejado: ");
        Carro c=lista.pesquisarId(teclado.nextInt());
        if(c!=null){
            System.out.println(c);
        }else{
            System.out.println("Não achou!");
        }*/
    }

}
