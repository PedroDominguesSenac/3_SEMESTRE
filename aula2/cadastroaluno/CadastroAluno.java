package aula2.cadastroaluno;

public class CadastroAluno {
    
    public static void main(String[] args) {
        
        // Forma simplificada sem utilizar o Get and Setter
        Aluno aluno = new Aluno("Pedro", "BSI", 123);
        Aluno aluno2 = new Aluno("Pedro2", "BSI2", 1234);
        Aluno aluno3 = new Aluno("Pedro3", "BSI3", 12345);
        Aluno aluno4 = new Aluno("Pedro3", "BSI4", 123456);
        Aluno aluno5 = new Aluno("Pedro3", "BSI5", 1234567);
        Operacoes.inserir(aluno);
        Operacoes.inserir(aluno2);
        Operacoes.inserir(aluno3);
        Operacoes.inserir(aluno4);
        
        System.out.println(aluno);
        
        
        /*
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
                
        aluno.setNome("Pedro");
        aluno.setCurso("BSI");
        aluno.setId(1234);
        
        aluno2.setNome("Pedro2");
        aluno2.setCurso("BSI2");
        aluno2.setId(321);
        
        Operacoes.inserir(aluno);
        Operacoes.inserir(aluno2);
        */
    } 
}
