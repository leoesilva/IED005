public class App {
    public static int numeros[] = { 1, 4, 4, 6, 7, 8 };

    public static void main(String[] args) throws Exception {
        System.out.println("Vetor sem ordenação:");
        printArray(numeros);
        selectionSort(numeros);
        System.out.println("Vetor ordenado:");
        printArray(numeros);
    }

    private static void printArray(int[] numeros) {
        for (int i : numeros) {
            System.out.print(" " + i + "\t|");
        }
        System.out.println();
    }

    private static void selectionSort(int[] numeros) {
        for (int j = 0; j < numeros.length; j++) {
            int menor = Integer.MAX_VALUE;
            int indiceMenor = 0;
            for (int i = j; i < numeros.length; i++) {
                if (numeros[i] < menor) {
                    menor = numeros[i];
                    indiceMenor = i;
                }
            }
            numeros[indiceMenor] = numeros[j];
            numeros[j] = menor;
        }
    }
}
