package sobre_carga;

public class Aluno extends Pessoa {

    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;

    public Aluno() {

        super();
    }

    public Aluno(String nome, String rg, String cpf, int registroAluno,
            float notaVestibular, String curso, String dataMatricula) {

        super();

        //Atribui os dados para super classe
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;

        //Atribui ao lugares locais
        this.registroAluno = registroAluno;
        this.notaVestibular = notaVestibular;
        this.curso = curso;
        this.dataMatricula = dataMatricula;

    }
    
    @Override
    
    public String retornaDados() {
    
        String dados;
        
        dados = super.retornaDados();
        
        dados += "RA: " + registroAluno + "\n";
        dados += "Nota do Vestibular: " + notaVestibular + "\n";
        dados += "Curso: " + curso + "\n";
        dados += "Data da Matricula: " + dataMatricula + "\n";
          
        return dados;
    }        
}
