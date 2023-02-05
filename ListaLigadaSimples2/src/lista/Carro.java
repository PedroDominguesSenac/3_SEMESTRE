package lista;

public class Carro {

    private double preco;
    private int ano, id;
    private String marca, modelo;

    public Carro() {
    }

    public Carro(int id, double preco, int ano, String marca, String modelo) {
        this.preco = preco;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Carro{" + "ID=" + id + ", preco=" + preco + ", ano=" 
                + ano + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
}
