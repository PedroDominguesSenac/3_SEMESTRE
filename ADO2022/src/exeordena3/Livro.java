package exeordena3;

public class Livro {

    private int id;
    private double preco;
    private String autor, titulo;

    public Livro() {
    }

    public Livro(int id, double preco, String autor, String titulo) {
        this.id = id;
        this.preco = preco;
        this.autor = autor;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", preco=" + preco + ", autor="
                + autor + ", título=" + titulo + '}';
    }

}
