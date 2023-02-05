package exeordena3;

public class Metodos {

    private static Livro[] lista = new Livro[3];
    private static int n = 0;

    public static void inserir(Livro livro) {
        if (n == lista.length) {
            lista = novoVetor();
        }
        lista[n] = livro;
        n++;
       mergeSort(0, n, lista);
    }

    public static void mergeSort(int inicio, int tamanho, Livro[] v) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, v);
            mergeSort(meio, tamanho, v);
            intercalar(inicio, meio, tamanho, v);
        }
    }

    private static void intercalar(int inicio, int meio, int tamanho, Livro[] v) {
        int i, j, k;
        Livro[] auxiliar = new Livro[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;
        while (i < meio && j < tamanho) {
            if (v[i].getTitulo().compareTo(v[j].getTitulo()) <= 0) {
                auxiliar[k] = v[i];
                k++;
                i++;
            } else {
                auxiliar[k] = v[j];
                k++;
                j++;
            }
        }
        while (i < meio) {
            auxiliar[k] = v[i];
            k++;
            i++;
        }

        while (j < tamanho) {
            auxiliar[k] = v[j];
            k++;
            j++;
        }
        for (i = inicio; i < tamanho; i++) {
            v[i] = auxiliar[i - inicio];
        }
    }

    public static void exibir() {
        for (int i = 0; i < n; i++) {
            System.out.println(lista[i]);
        }
    }

    private static Livro[] novoVetor() {
        Livro[] novo = new Livro[lista.length + 3];
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }

    private static int pesquisarId(int id) {
        for (int i = 0; i < n; i++) {
            if (id == lista[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public static boolean remover(int id){
        int indice = pesquisarId(id);
        if (indice != -1) {
            for (int i = indice; i < n; i++) {
                lista[i] = lista[i + 1];
            }
            n--;
            return true;
        }
        return false;
    }
    
    public static Livro buscar(String titulo) {
        int vi = 0, vf = n-1, meio;
        while (vi <= vf) {
            meio = (vf + vi) / 2;
            if (titulo.equalsIgnoreCase(lista[meio].getTitulo())) {
                return lista[meio];
            } else if (titulo.compareTo(lista[meio].getTitulo())<0) {
                vf = meio - 1;
            } else {
                vi = meio + 1;
            }
        }
        return null;
    }
}
