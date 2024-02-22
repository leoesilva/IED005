package f111_ed_ex_aula02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        imprimirTabuada();
    }

    private static void imprimirInteiros() {
        StringBuilder sb = new StringBuilder();
        int num = 10;
        while (num <= 100) {
            if(num > 10 && num % 10 == 0) {
                sb.append("\n");
            }
            if (num < 100) {
                sb.append(num + ", ");
            } else {
                sb.append(num + ".");
            }            
            num++;
        }
        System.out.println(sb);
    }

    private static void tabuadaTres() {
        StringBuilder sb = new StringBuilder();
        int operador = 3, operando = 0;
        while (operando <=10) {
            int resultado = operador * operando;
            sb.append("\n" + operador + " * " + operando + " = " + resultado);
            operando++;
        }
        System.out.println("Tabuada do número 3:");
        System.out.println(sb);
    }

    private static void imprimirTabuada() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular a tabuada: ");
        int operador = sc.nextInt();
        for (int operando = 0; operando <=10; operando++) {
            int resultado = operador * operando;
            sb.append("\n" + operador + " * " + operando + " = " + resultado);
        }
        System.out.println("Tabuada do número " + operador + ":");
        System.out.println(sb);
    }
}
