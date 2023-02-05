package prova1;

public class ListaSimples {

    private Elemento inicio = null, atual, aux;

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

    private Elemento[] pesquisarRemove(long ra) {
        Elemento x = inicio, auxRem = null;
        Elemento[] v = {x, auxRem};
        Aluno aluno;
        while (x != null) {
            aluno = (Aluno) x.getObjeto();
            if (ra == aluno.getRa()) {
                v[0] = x;
                v[1] = auxRem;
                return v;
            }
            auxRem = x;
            x = x.getProx();
        }
        return null;
    }

    public void mediaTotal() {
        Elemento x = inicio;
        int count = 0;
        double mediaGlobal = 0;
        int acimaMedia = 0;
        int abaixoMedia = 0;
        Aluno aluno;
        
        
        while (x != null) {
            aluno = (Aluno) x.getObjeto();
            mediaGlobal += aluno.getMedia();
            count++;
            if(aluno.getMedia() >= 6) {
               acimaMedia ++;
            }else{
                abaixoMedia ++;
            }
            
            x = x.getProx();
        }
        
        System.out.println("A media globa eh: " + mediaGlobal / count);
        
        System.out.println("A quantidade de alunos acima da media sao: " + acimaMedia + " alunos");
        System.out.println("A quantidade de alunos abaixo da media sao: " + abaixoMedia + " alunos");
    }

    public boolean remover(long ra) {
        Elemento[] v = pesquisarRemove(ra);
        if (v != null) {
            Elemento x = v[0];
            Elemento auxRem = v[1];
            if (x == inicio) {
                inicio = x.getProx();
                x.setProx(null);
            } else if (x == atual) {
                atual = auxRem;
                aux = auxRem;
                auxRem.setProx(null);
            } else {
                auxRem.setProx(x.getProx());
                x.setProx(null);
            }
            return true;
        }
        return false;
    }

    public static void printAlunos(Aluno[] aluno) {

        for (int i = 0; i < aluno.length; ++i) {
            System.out.println(aluno[i] + ", ");
        }
        System.out.println();
    }

    private class Elemento {

        private Object objeto;
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
            return "Elemento{" + "objeto=" + objeto + ", prox=" + prox + '}';
        }
    }

}