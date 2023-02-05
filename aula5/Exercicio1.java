package aula5;

public class Exercicio1 {
    
    public static void main(String[] args) {
        //char[] a = {'a', 'y', 'h', 't', 'A', 'm'};
        
        //Aprimorando do Exercicio
        char[] a = new char[20];
        Exercicio1_QuickSort.inserir(a);
        Exercicio1_QuickSort.quickSort(0,a.length-1,a);
        Exercicio1_QuickSort.exibir(a);   
    }  
}