package sobre_escrita;

public class Principal {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        
        a1.nome = "Pedro Domingues";
        a1.rg = "36.345.456 -x";
        a1.cpf = "55555555555";
        a1.registroAluno = 789456132;
        a1.notaVestibular = 7.8f;
        a1.curso = "Bacharelado em Sistemas de Informacao";
        a1.dataMatricula = "02/02/2022";
        
        p1.nome = "Professor Senac";
        p1.rg = "789456123";
        p1.cpf = "88888888888";
        p1.matriculaProfessor = 123456789;
        p1.dataAdmissao = "dataAdmissao";
        p1.salarioHorista = 80.56;
        
        System.out.println("\t - Dados do Aluno RA n: " + a1.registroAluno + " -\n");
        System.out.println(a1.retornaDados());
        System.out.println(" ");
        System.out.println("\t - Dados do Professor n de matricula: " + p1.matriculaProfessor + " -\n");
        System.out.println(p1.retornaDados());
    }   
}
