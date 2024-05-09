public class App {
    public static int numeros[] = { 7, 1, 4, 5, 3, 6, 7 };

    public static void main(String[] args) throws Exception {
        System.out.println("Vetor sem ordenação:");
        printArray(numeros);
        // bubbleSort(numeros);
        insertionSort(numeros);
        System.out.println("Vetor ordenado:");
        printArray(numeros);
    }

    private static void printArray(int[] numeros) {
        for (int i : numeros) {
            System.out.print(" " + i + "\t|");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] numeros) {
        for (int j = 0; j < numeros.length - 1; j++) {
            boolean teveTroca = false;
            for (int i = 0; i < numeros.length - j - 1; i++) {
                if (numeros[i + 1] < numeros[i]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temp;
                    teveTroca = true;
                }
            }
            if (!teveTroca)
                return;
        }
    }

    private static void insertionSort(int[] numeros) {
        for (int j = 1; j < numeros.length; ++j) {
            int temp = numeros[j];
            int i = j - 1;
            while (i >= 0 && numeros[i] > temp) {
                numeros[i + 1] = numeros[i];
                i--;
            }
            numeros[i + 1] = temp;
        }
    }
}
