package aula5;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Pet pet1 = new Pet("Pedro2", 1);
        Pet pet2 = new Pet("Pedro1", 2);
        Pet pet3 = new Pet("Pedro4", 3);
        Pet pet4 = new Pet("Pedro8", 4);
        Pet pet5 = new Pet("Pedro3", 5);
        Exercicio3_Merge.inserir(pet1);
        Exercicio3_Merge.inserir(pet2);
        Exercicio3_Merge.inserir(pet3);
        Exercicio3_Merge.inserir(pet4);
        Exercicio3_Merge.inserir(pet5);
        Exercicio3_Merge.exibir();
        
        
    }  
}
