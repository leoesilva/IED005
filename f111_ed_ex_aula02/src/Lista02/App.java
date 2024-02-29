package Lista02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // imprimirInteirosFor();
        // tabuadaTresFor();
        // imprimirTabuadaFor();
        // imprimirInteirosWhile();
        // tabuadaTresWhile();
        // imprimirTabuadaWhile();
        // somarCincoValores();
        // mediaNValores();
        // contadorValoresNegativos();
        // lerInteiros();
        // calcularFatorial();
        // sequenciaFibonacci();
        // imprimirFiguraNLinhas();
        // imprimirLosango();
    }

    private static void imprimirInteirosFor() {
        StringBuilder sb = new StringBuilder();        
        for (int num = 10; num <= 100; num++) {
            if(num > 10 && num % 10 == 0) {
                sb.append("\n");
            }
            if (num < 100) {
                sb.append(num + ", ");
            } else {
                sb.append(num + ".");
            } 
        }
        System.out.println(sb);
    }

    private static void tabuadaTresFor() {
        StringBuilder sb = new StringBuilder();
        for (int operando = 0; operando <=10; operando++) {
            int resultado = 3 * operando;
            sb.append("\n" + 3 + " * " + operando + " = " + resultado);
        }
        System.out.println("Tabuada do número 3:");
        System.out.println(sb);
    }
    
    private static void imprimirTabuadaFor() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular a tabuada: ");
        int operador = sc.nextInt();
        sc.close();
        for (int operando = 0; operando <=10; operando++) {
            int resultado = operador * operando;
            sb.append("\n" + operador + " * " + operando + " = " + resultado);
        }
        System.out.println("Tabuada do número " + operador + ":");
        System.out.println(sb);
    }

    private static void imprimirInteirosWhile() {
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

    private static void tabuadaTresWhile() {
        StringBuilder sb = new StringBuilder();
        int operando = 0;
        while (operando <= 10) {
            int resultado = 3 * operando;
            sb.append("\n" + 3 + " * " + operando + " = " + resultado);
            operando++;
        }
        System.out.println("Tabuada do número 3:");
        System.out.println(sb);
    }

    private static void imprimirTabuadaWhile() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular a tabuada: ");
        int operador = sc.nextInt();
        sc.close();
        int operando = 0;
        while (operando <= 10) {
            int resultado = operador * operando;
            sb.append("\n" + operador + " * " + operando + " = " + resultado);
            operando++;
        }
        System.out.println("Tabuada do número " + operador + ":");
        System.out.println(sb);
    }

    private static void somarCincoValores() {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            soma += sc.nextInt();
        }
        sc.close();
        System.out.println("A soma dos números digitados é " + soma);
    }

    private static void mediaNValores() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de valores a calcular: ");
        int qtdValores = sc.nextInt();
        int contador = 0;
        double acumulador = 0;
        while (contador < qtdValores) {
            System.out.print("Digite o " + (contador+1) + "º número: ");
            acumulador += sc.nextInt();
            contador++;
        }
        sc.close();
        acumulador /= qtdValores;
        System.out.println("A média dos " + qtdValores + " valores digitados é " + acumulador);
    }

    private static void contadorValoresNegativos() {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            int valor = sc.nextInt();
            if (valor < 0) {
                contador++;
            }
        }
        sc.close();
        System.out.println("Foram digitados " + contador + " valores negativos.");
    }

    private static void lerInteiros() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Digite um número inteiro: ");
            int valor = sc.nextInt();
            if (valor == 0) {
                break;
            }
        } while(true);
        sc.close();
    }

    private static void calcularFatorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para calcular: ");
        int fat = sc.nextInt();
        sc.close();
        int res = fat;
        if (fat == 0 || fat == 1) {
            System.out.println("O fatorial do número é 1");
        }
        else {
            while (fat > 1) {
                fat--;
                res *= fat;
            }
            System.out.println("O fatorial do número é " + res);
        }
    }

    private static void sequenciaFibonacci() {
        StringBuilder sb = new StringBuilder();
        int a = 1, b = 1;
        sb.append(a).append(", ").append(b).append(", ");
        int c = a + b;
        while (c <= 1000) {
            sb.append(c);
            a = b;
            b = c;
            c = a + b;
            if (c <= 1000) {
                sb.append(", ");
            }
            else {
                sb.append(".");
            }
        }
        System.out.println("A sequência é:\n" + sb);
    }

    private static void imprimirFiguraNLinhas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas para a figura: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void imprimirLosango() {
        int tamanho = 5;
        for (int linha = 1; linha <= tamanho; linha++) {
            for (int espaco = 1; espaco <= tamanho - linha; espaco++) {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <= 2 * linha - 1; asterisco++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int linha = tamanho - 1; linha >= 1; linha--) {
            for (int espaco = 1; espaco <= tamanho - linha; espaco++) {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <= 2 * linha - 1; asterisco++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
