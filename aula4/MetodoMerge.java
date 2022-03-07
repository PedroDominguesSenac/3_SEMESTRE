import java.util.Arrays;

public class MetodoMerge {

    public static void main(String[] args) {
        int[] a ={12,3,56,32,68,33,1};
        Ordenacao.inserir(a);
        Ordenacao.mergeSort(0, a.length, a);
        System.out.println(Arrays.toString(a));
    }

}
