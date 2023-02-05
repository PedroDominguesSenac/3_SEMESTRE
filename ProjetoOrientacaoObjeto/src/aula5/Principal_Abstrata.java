package aula5;

public class Principal_Abstrata {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        
        a1.nome = "Pedro Domingues";
        a1.rg = "78.486.159.8";
        a1.cpf = "487.458.789-96";
        a1.registroAluno = 123;
        a1.dataMatricula = "03/05/2021";
        a1.notaVestibular = 8.5f;
        a1.curso = "BSI";
        
        p1.nome = "Professor Senac";
        p1.rg = "12.456.879-7";
        p1.cpf = "789.456.123-89";
        p1.matriculaProfessor = 456;
        p1.dataAdmissao = "12/01/1990";
        p1.salarioHorista = 10.00;

        System.out.println("\t - Dados do Aluno" + "\n");
        System.out.println(a1.retornaDados());
        System.out.println(" ");
        
        System.out.println("\t - Dados do Professor" + "\n");
        System.out.println(p1.retornaDados());
    
    }
}
