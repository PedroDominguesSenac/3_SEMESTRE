package prova1;

public class Aluno {

    String nome;
    private static long n = 2000;
    long ra;
    double nota1, nota2, media;

    public Aluno(String nome, long ra, double nota1, double nota2, double media) {
        this.nome = nome;
        this.ra = n++;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        calculoMedia();
    }

    private void calculoMedia() {
        this.media = nota1 * 0.3 + nota2 * 0.7;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media + '}';
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getRa() {
        return ra;
    }

    public void setRa(Long ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}