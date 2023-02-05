package ado2;

public class Fila {

    private Elemento inicio = null, atual, aux;
    int Elementos = -1;

    public boolean Empty() {
        if (Elementos == -1) {
            return true;
        }
        return false;
    }

    public void inserir(Object u) {
        if (inicio == null) {
            inicio = new Elemento(u, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(u, null, aux);
            aux.setProx(atual);
            aux = atual;
        }
        Elementos++;
    }

    public void remover() {
        Elemento x;
        if (Empty()) {
            System.out.println("Fila vazia!");
        } else {
            System.out.println("Elemento " + inicio.getObjeto() + " removido!");
            if (Elementos == 0) {
                inicio = null;
            } else {

                x = inicio.getProx();
                x.setAnt(null);
                inicio = x;
            }
            Elementos--;
        }
    }

    public void exibir() {
        Elemento x = inicio;
        System.out.print("[");
        if (x == null) {
            System.out.print("Fila vazia!");
        } else {
            while (x != null) {
                if (x == null) {
                    System.out.print("Fila vazia!");
                } else {
                    System.out.print(" " + x.getObjeto() + " ");
                }
                x = x.getProx();
            }
        }
        System.out.print("]");
    }

    public void tamanho() {
        if (Empty()) {
            System.out.println("Fila vazia!");
        }
        System.out.println("\nTamanho da fila: [" + (this.Elementos + 1) + "]\n");
    }

    public void frente() {
        if (Empty()) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Valor no topo: [" + inicio.getObjeto() + "]");
        }
    }

    public class Elemento {

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
