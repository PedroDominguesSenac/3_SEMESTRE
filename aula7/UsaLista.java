package aula7;

public class UsaLista {

    public static void main(String[] args) { 
        
        Lista lista = new Lista();
        
        Carro carro1 = new Carro("Jetta", 2022, 200000);
        Carro carro2 = new Carro("Fox", 2014, 20000);
        Carro carro3 = new Carro("Fusca", 1975, 2000);
        Carro carro4 = new Carro("Gol", 2020, 50000);
        
        lista.inserir(carro1);
        lista.inserir(carro2);
        lista.inserir(carro3);
        lista.inserir(carro4);
        
        // Exibe tudo. Eh necessario retirar quando quer exibir somente a pesquisa
        lista.exibir();
        
        Carro c = lista.pesquisar(2014);
            if(c != null) {
                System.out.println(c);
           }else{
                System.out.println("Nao encontrado");
            }
    }
}
        // Dessa forma "lista" acessa o objeto instanciado
        /*
        lista.inserir("Gerson");
        lista.inserir("Anna");
        lista.inserir("Sandra");
        lista.inserir("José");
        lista.exibir();
        */
        
        
        //Dessa forma "Lista" eh acessada a Classe Lista
        /*
        Lista.inserir("Gerson");
        Lista.inserir("Anna");
        Lista.inserir("Sandra");
        Lista.inserir("José");
        Lista.exibir();
        */
        
       //Elemento e = new Elemento("dada", null)
