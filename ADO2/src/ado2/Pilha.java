package ado2;

public class Pilha {

    private Elemento inicio = null, atual, aux;
    private int posicaoPilha = -1;

    public void inserir(Object objeto) {
        if (inicio == null) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
            posicaoPilha++;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProx(atual);
            aux = atual;
            posicaoPilha++;
        }
    }

    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public void tamanho() {
        if (pilhaVazia()) {
            System.out.println("Pilha vazia!");
        }
        System.out.println(this.posicaoPilha + 1);
    }

    public void exibir() {
        Elemento x = inicio;
        while (x != null) {
            if(x.getObjeto() == null){
                System.out.println("Pilha Vazia!");
            }
            else{
                System.out.println(x.getObjeto());
            }
            x = x.getProx();
        }
    }

    public void remover() {
        int i = 0;
        Elemento x;
        if (pilhaVazia()) {
            System.out.println("Pilha vazia!");
        } else {
            if(atual.getAnt() == null){
              atual.setObjeto(null);
                System.out.println("Pilha Vazia");
            }
            else{
            x = atual.getAnt();
            x.setProx(null);
            atual = x;
            }
            posicaoPilha--;
        }
    }

    public void topo() {
        int i = 0;
        Elemento x = inicio;
        if (pilhaVazia()) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println(atual.getObjeto());
        }
    }

    private class Elemento {

        private Object objeto;
        private Elemento prox;
        private Elemento ant;

        public Elemento(Object objeto, Elemento prox, Elemento ant) {
            this.objeto = objeto;
            this.prox = prox;
            this.ant = ant;
        }

        public Object getObjeto() {
            return objeto;
        }

        public void setObjeto(Object objeto) {
            this.objeto = objeto;
        }

        public Elemento getProx() {
            return prox;
        }

        public void setProx(Elemento prox) {
            this.prox = prox;
        }

        public Elemento getAnt() {
            return ant;
        }

        public void setAnt(Elemento ant) {
            this.ant = ant;
        }
    }

}
