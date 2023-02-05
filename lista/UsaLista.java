package lista;

public class UsaLista {

    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.inserir(new Carro("VW", 13, "Fox", 2014));
        lista.inserir(new Carro("VW", 25, "Jetta", 2022));
        lista.inserir(new Carro("Fiat", 45, "Argo", 2022));
        lista.inserir(new Carro("Smart", 67, "Fortwo", 2022));

       /* Object[] v=lista.pesquisar(133);
        if(v!=null){
            System.out.println(v[1]);
        }else{
            System.out.println("id não encontrado!");
        }*/

        //lista.exibir();

        boolean teste=lista.remover(45);
        if(teste){
            System.out.println("Removido com sucesso!");
        }else{
            System.out.println("id não encontrado!");
        }

        System.out.println("=== Removeu ===");
        lista.exibir();
    }

}
