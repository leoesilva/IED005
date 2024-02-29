package Lista01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // somaTresNumeros();
        // imprimirNomeDoMes();
        // verificarTriangulo();
        // comparaValores();
        // contadorNegativos();
        // validarEleitor();
    }

    private static void somaTresNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int soma = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        soma += sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        soma += sc.nextInt();
        sc.close();
        System.out.println("A soma dos valores é igual a " + soma);
    }

    private static void imprimirNomeDoMes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do mês: ");
        int mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println("JANEIRO");
                break;
            case 2:
                System.out.println("FEVEREIRO");
                break;
            case 3:
                System.out.println("MARÇO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAIO");
                break;
            case 6:
                System.out.println("JUNHO");
                break;
            case 7:
                System.out.println("JULHO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SETEMBRO");
                break;
            case 10:
                System.out.println("OUTUBRO");
                break;
            case 11:
                System.out.println("NOVEMBRO");
                break;
            case 12:
                System.out.println("DEZEMBRO");
                break;
            default:
                System.out.println("ERRO! Opção inválida.");
                break;
        }
        sc.close();
    }

    private static void verificarTriangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a medida do primeiro lado: ");
        int l1 = sc.nextInt();
        System.out.print("Digite a medida do segundo lado: ");
        int l2 = sc.nextInt();
        System.out.print("Digite a medida do terceiro lado: ");
        int l3 = sc.nextInt();
        sc.close();
        if (l1 == l2 && l2 == l3) {
            System.out.println("O triângulo é equilátero.");
        } else {
            System.out.println("O triângulo não é equilátero.");
        }
    }

    private static void comparaValores() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o 1º valor: ");
        int val1 = sc.nextInt();
        System.out.print("Digite o 2º valor: ");
        int val2 = sc.nextInt();
        if (val1 > val2) {
            System.out.println("O 1º valor (" + val1 + ") é maior que o 2º (" + val2 + ").");
        } else if (val2 > val1) {
            System.out.println("O 2º valor (" + val2 + ") é maior que o 1º (" + val1 + ").");
        } else {
            System.out.println("Os valores são iguais.");
        }
    }

    private static void contadorNegativos() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("Digite o primeiro número: ");
        if (sc.nextInt() < 0) {
            num++;
        };
        System.out.print("Digite o segundo número: ");
        if (sc.nextInt() < 0) {
            num++;
        };
        System.out.print("Digite o terceiro número: ");
        if (sc.nextInt() < 0) {
            num++;
        };
        sc.close();
        System.out.println("Total de números negativos digitados: " + num);
    }

    private static void validarEleitor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.close();
        if (idade < 16) {
            System.out.println("Não habilitado a votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }
    }
}
