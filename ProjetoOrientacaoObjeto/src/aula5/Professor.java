package aula5;

public class Professor extends Pessoa {

    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;
    
    public Professor() {
        
    }

    public Professor(String nome, String rg, String cpf, int matriculaProdessor,
            String dataAdmissao, double salarioHorista) {

        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;

        this.matriculaProfessor = matriculaProfessor;
        this.dataAdmissao = dataAdmissao;
        this.salarioHorista = salarioHorista;

    }

    @Override
    // Deixamos somente retornaDados, nao precisa deixar retornaDadosProfessor
    public String retornaDados() {
        String dados;

        dados = retornaDados();

        dados += "Numero de Matricula: " + matriculaProfessor + "\n";
        dados += "Data da Admissao: " + dataAdmissao + "\n";
        dados += "Salario do Horista: " + salarioHorista + "\n";

        return dados;
    }
}
