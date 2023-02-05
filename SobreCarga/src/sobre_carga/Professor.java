package sobre_carga;

public class Professor extends Pessoa {

    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;

    @Override
    // Deixamos somente retornaDados, nao precisa deixar retornaDadosProfessor
    public String retornaDados() {
        String dados;

        dados = super.retornaDados();

        dados += "Numero de Matricula: " + matriculaProfessor + "\n";
        dados += "Data da Admissao: " + dataAdmissao + "\n";
        dados += "Salario do Horista: " + salarioHorista + "\n";

        return dados;
    }
}
