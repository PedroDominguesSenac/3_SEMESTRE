package heranca;

public class Aluno extends Pessoa {
    
    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;

    public String retornaDadosAluno() {
        String dados;
        
        dados = super.retornaDados();
        
        dados += "RA: " + registroAluno + "\n";
        dados += "Nota do Vestibular: " + notaVestibular + "\n";
        dados += "Curso: " + curso + "\n";
        dados += "Data Matricula: " + dataMatricula + "\n";
    
        return dados;
    }
}
