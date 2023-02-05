package heranca;

public class Professor extends Pessoa {
    
    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;    

    public String retornaDadosProfessor() {
        String dados;
        
        dados = super.retornaDados();
        
        dados += "N Matricula " + matriculaProfessor + "\n";
        dados += "Data da Admissao: " + dataAdmissao + "\n";
        dados += "Salario do Horista: " + salarioHorista + "\n";
            
        return dados;
    }
}
