
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] valores = {1, 7, 4, 2, 3, 1, 4};
        mergeSort(valores);
        System.out.println(Arrays.toString(valores));
    }

    private static void mergeSort(int[] valores) {        
        if (valores.length <= 1) {
            return;
        }
        int meio = valores.length / 2;
        int[] esq = new int[meio];
        int[] dir = new int[valores.length - meio];
        System.arraycopy(valores, 0, esq, 0, esq.length);
        System.arraycopy(valores, meio, dir, 0, dir.length);
        mergeSort(esq);
        mergeSort(dir);
        merge(esq, dir, valores);
    }

    private static void merge(int[] esq, int[] dir, int[] valores) {
        int i = 0, j = 0, k = 0;
        while (i < esq.length && j < dir.length) {
            if(esq[i] <= dir[j]) {
                valores[k++] = esq[i++];
            } else {
                valores[k++] = dir[j++];
            }
        }
        while (i < esq.length) {
            valores[k++] = esq[i++];
        }
        while (j < dir.length) {
            valores[k++] = dir[j++];
        }
    }
}
