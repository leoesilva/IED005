import java.util.Scanner;

public class App {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // imprimirTabuada();
        // ordenarVetor();
        // piramideNumero();
        // vetorMedia();
        // sequenciaFibonacciVetor();
        // sequenciaFibonacciVar();
        sequenciaFibonacci();
    }

    private static void imprimirTabuada() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(" " + (i * j) + "\t|");
            }
            System.out.println();
        }
    }

    private static void ordenarVetor() {
        int numeros[] = { 91, 42, 634, 712, 15, 40, 314, 1 };
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        for (int i : numeros) {
            System.out.print(" " + i + "\t|");
        }
    }

    private static void piramideNumero() {
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void vetorMedia() {
        double n[] = {7.5, 2.8, 7.1, 8.3, 4.5, 10, 9.2};
        double m = 0;
        for (double d : n) {
            m += d;
        }
        m /= n.length;
        System.out.println("Média dos valores: " + String.format("%.2f", m));
        System.out.print("Valores iguais ou superiores à média:");
        for (double d : n) {
            if (d >= m) {
                System.out.print(" " + String.format("%.2f",d) + " |");
            }
        }
    }

    private static void sequenciaFibonacciVetor() {              
        System.out.print("Digite a quantidade de posições para a sequência: ");
        int pos = sc.nextInt();
        Integer[] seq = new Integer[pos];
        seq[0] = 1;
        seq[1] = 1;
        System.out.print(seq[0] + " | " + seq[1] + " | ");
        for (int i = 2; i < seq.length; i++) {
            seq[i] = seq[i-1] + seq[i-2];
            System.out.print(seq[i] + " | ");
        }
    }

    private static void sequenciaFibonacciVar() {
        int a = 1, b = 1, c, ctrl = 2;
        System.out.print("Digite a quantidade de posições para a sequência: ");
        int pos = sc.nextInt();
        System.out.print(a + " | " + b + " | ");
        while (ctrl < pos) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " | ");
            ctrl++;
        }
    }

    private static void sequenciaFibonacci() {
        int a = 1, b = 1, ctrl = 2;
        System.out.print("Digite a quantidade de posições para a sequência: ");
        int pos = sc.nextInt();
        System.out.print(a + " | " + b + " | ");
        while (ctrl < pos) {  
            ctrl++;
        }
    }
}
