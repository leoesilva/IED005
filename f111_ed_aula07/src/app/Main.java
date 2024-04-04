package app;

import estruturas.Pilha;

public class Main {
    public static void main(String[] args) throws Exception {
        // exemplo();
        historico();
    }

    private static void exemplo() {
        Pilha pilha = new Pilha();
        System.out.println(pilha.estaVazia());
        pilha.empilhar("PETR4");
        pilha.empilhar("VALE3");
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.topo());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.topo());
    }

    private static void historico() {
        Pilha pilha = new Pilha();
        pilha.empilhar("g1.com");
        pilha.empilhar("bb.com");
        pilha.empilhar("instagram.com");
        Object info = pilha.desempilhar();
        while (info != null) {
            System.out.println(info);
            info = pilha.desempilhar();
        }
    }
}
