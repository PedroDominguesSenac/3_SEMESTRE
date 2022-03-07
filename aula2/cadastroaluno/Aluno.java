package aula2.cadastroaluno;

public class Aluno {
    
    // Atributos
    private String nome;
    private int id;
    private String curso;
    
    public Aluno() {}
    
    public Aluno(String nome, String curso, int id) {
     
        this.nome = nome;
        this.curso = curso;
        this.id = id;
    }
    
    //Metodos acessores
    // Botao direito refatorar, encapsular campos
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String toString() {
        return "Nome: " + this.nome + " - Curso: " + this.curso;
    }
}
