package ado2;

public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.inserir(new Carro("VW", 13, "Fox", 2014));
        pilha.inserir(new Carro("VW", 25, "Jetta", 2022));    
//        pilha.inserir(new Carro("Fiat", 45, "Argo", 2022));;
//        pilha.inserir(new Carro("Smart", 67, "Fortwo", 2022));

        pilha.exibir();
        pilha.remover();
        pilha.remover();
        pilha.exibir();
        pilha.tamanho();
        pilha.topo();
    }

}
