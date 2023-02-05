package aula5;

public class Exercicio2 {
    
    public static void main(String[] args) {
        String[] lista = {"Pedro5",
                         "Pedro3",
                         "Pedro2",
                         "Pedro4",
                         "Pedro1"};
        
    Exercicio2_Merge.mergeSort(0, lista.length, lista);  
    Exercicio2_Merge.exibir(lista);
    
    }
}
         
   
