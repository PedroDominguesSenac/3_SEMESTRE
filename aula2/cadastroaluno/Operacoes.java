package aula2.cadastroaluno;

public class Operacoes {
    private static Aluno[] lista = new Aluno[5];
    private static int n = 0;
   
    public static void inserir(Aluno aluno) {
        if(n == lista.length) {
        lista = alocarNovoArray();
    }
    lista[n] = aluno;
    n++;
    }
    
    public static Aluno[] alocarNovoArray() {
      Aluno[] novo = new Aluno[lista.length + 3];  
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }

    /*
    public static void inserir(Aluno aluno) {
        lista[n] = aluno;
        n++;        
   }
    */
    
    public static void exibir() {
        for(int i=0; i<n; i++){
            System.out.println(lista[i]);
        }
    }
}
