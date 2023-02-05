package aula7;

public class Lista { // Temos 2 classes dentro do Lista

    private Elemento inicio = null, atual, aux;

    //método de instância
    public void inserir(Object objeto) {
        if (inicio == null) {
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir() {
        Elemento x = inicio;
        while (x != null) {
            System.out.println(x.getObjeto());
            x = x.getProx();
        }
    }

    public Carro pesquisar(int ano) {
        Elemento x = inicio;

        Carro c;
        while (x != null) {
            c = (Carro) x.getObjeto();
            if (ano == c.getAno()) {
                return c;
            }
            x = x.getProx();
        }
        return null;
    }

    // inner class - Class interna ---- Elemento era uma classe, foi colocada dentro da classe Lista.
    private class Elemento {

        private Object objeto;//Dados
        private Elemento prox;

        public Elemento(Object objeto, Elemento prox) {
            this.objeto = objeto;
            this.prox = prox;
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

        @Override
        public String toString() {
            return "Elemento{" + "objeto = " + objeto + ", prox = " + prox + '}';
        }
    }
}
