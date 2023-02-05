package ado2;

public class Pilha {

    private Elemento inicio = null, atual, aux;
    private int posicaoPilha = -1;

    public void inserir(Object objeto) {
        if (inicio == null) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProx(atual);
            aux = atual;
        }
        posicaoPilha++;
    }

    public boolean Empty() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public void tamanho() {
        if (Empty()) {
            System.out.println("Pilha vazia!");
        }
        System.out.println("\nTamanho da pilha: [" + (this.posicaoPilha + 1) + "]\n");
    }

    public void exibir() {
        Elemento x = inicio;
        System.out.print("[");
        if (x == null) {
            System.out.print("Pilha vazia!");
        } else {
            while (x != null) {

                System.out.print(" " + x.getObjeto() + " ");
                x = x.getProx();
            }
        }
        System.out.print("]");
    }

    public void remover() {
        Elemento x;
        if (Empty()) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Elemento " + atual.getObjeto() + " removido!");
            if (posicaoPilha == 0) {
                inicio = null;
            } else {
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
        if (Empty()) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Valor no topo: [" + atual.getObjeto() + "]");
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
