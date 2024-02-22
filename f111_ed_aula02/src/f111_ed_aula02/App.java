package f111_ed_aula02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        imprimirPares();
        imprimirFatorial();
        imprimirMultiplicacao();
    }

    private static void imprimirPares() {
        int num = 2;
        while (num <= 10) {
            System.out.println(num);
            num += 2;
        }
    }

    private static void imprimirFatorial() {
        Scanner sc = new Scanner(System.in);
        int fat = 1;
        System.out.print("Digite um valor para calcular o fatorial: ");
        int valor = sc.nextInt();
        while (valor >= 1) {
            fat *= valor;
            valor--;
        }
        System.out.println("O fatorial do valor inserido é " + fat);
    }

    private static void imprimirMultiplicacao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int res = 0;
        int val1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int val2 = sc.nextInt();
        while (val2 >= 1) {
            res += val1;
            val2--;
        }
        System.out.println("O resultado é " + res + ".");
    }
}
