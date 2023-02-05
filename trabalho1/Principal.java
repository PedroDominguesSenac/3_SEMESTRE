package trabalho1;

public class Principal {

    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        Aluno aluno = new Aluno();

        Aluno aluno1 = new Aluno("Pedro Camargo", aluno.getRa(), 9.6, 8.5, aluno.getMedia());
        Aluno aluno2 = new Aluno("Pedro Domingues", aluno.getRa(), 8.5, 9.6, aluno.getMedia());
        Aluno aluno3 = new Aluno("Carlos Alberto", aluno.getRa(), 7.4, 8.6, aluno.getMedia());
        Aluno aluno4 = new Aluno("Giovanna Silva", aluno.getRa(), 6.4, 2.4, aluno.getMedia());
        Aluno aluno5 = new Aluno("Vinicius Amorim", aluno.getRa(), 3.4, 7.5, aluno.getMedia());
        Aluno aluno6 = new Aluno("Raissa Leal", aluno.getRa(), 9.0, 5.1, aluno.getMedia());
        Aluno aluno7 = new Aluno("Amanda Lorena", aluno.getRa(), 7.6, 5.1, aluno.getMedia());

        lista.inserir(aluno1);
        lista.inserir(aluno2);
        lista.inserir(aluno3);
        lista.inserir(aluno4);
        lista.inserir(aluno5);
        lista.inserir(aluno6);

        System.out.println("======================Lista Normal==================================================================");

        lista.exibir();

        Aluno[] listAlunos = {aluno1, aluno2, aluno3, aluno4, aluno5, aluno6};

        Aluno[] alunoAInserirNoInicio = {aluno7};

        Aluno[] arrayResultante = new Aluno[listAlunos.length + alunoAInserirNoInicio.length];
        System.arraycopy(alunoAInserirNoInicio, 0, arrayResultante, 0, alunoAInserirNoInicio.length);
        System.arraycopy(listAlunos, 0, arrayResultante, alunoAInserirNoInicio.length, listAlunos.length);

        System.out.println("\n======================Lista Inserindo no inicio==================================================================");
        ListaSimples.printAlunos(arrayResultante);

        System.out.println("======================Media total==================================================================");
        lista.mediaTotal();

        lista.remover(aluno1.ra);
        System.out.println("======================Lista Aluno removido==================================================================");
        lista.exibir();

    }
}
