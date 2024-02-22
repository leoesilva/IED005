package f111_ed_aula02;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int fat = 1;
        System.out.print("Digite um valor para calcular o fatorial: ");
        int valor = sc.nextInt();
        while (valor >= 1) {
            fat *= valor;
            valor--;
        }
        System.out.println("O fatorial do valor inserido é " + fat);
    }
}
