package aula7;

public class Principal {
    
    public static void main(String[] args) {
        
        
        Pessoa listaPessoas[] = new Pessoa[3];
        
        listaPessoas[0] = new Pessoa();
        listaPessoas[0].nome = "Pedro";
        listaPessoas[0].email = "pedro@gmail.com";
        listaPessoas[0].telefone = "11 99999 - 9999";
        listaPessoas[0].idade = 30;
        
        listaPessoas[1] = new Pessoa();
        listaPessoas[1].nome = "Rafael";
        listaPessoas[1].email = "rafael@gmail.com";
        listaPessoas[1].telefone = "11 88888 - 8888";
        listaPessoas[1].idade = 29;
        
        listaPessoas[2] = new Pessoa();
        listaPessoas[2].nome = "Carlos";
        listaPessoas[2].email = "carlos@gmail.com";
        listaPessoas[2].telefone = "11 77777 - 7777";
        listaPessoas[2].idade = 28;
        
        System.out.println();
        
//        for(int i=0; i>listaPessoas.length; i++) {
//            
//            System.out.println(listaPessoas[i]);
//            
//        }
    }   
}
