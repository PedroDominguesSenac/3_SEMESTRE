package sobre_escrita;

public class Aluno extends Pessoa {
    
    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;
    
    @Override
    // Deixamos somente retornaDados, nao precisa deixar retornaDadosProfessor
    public String retornaDados() {
        String dados;
        
        dados = super.retornaDados();
        
        dados += "RA: " + registroAluno + "\n";
        dados += "Nota do Vestibular: " + notaVestibular + "\n";
        dados += "Curso: " + curso + "\n";
        dados += "Data Matricula: " + dataMatricula + "\n";
    
        return dados;
    }
}
