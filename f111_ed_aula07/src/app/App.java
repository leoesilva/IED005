package app;

import estruturas.Fila;
import estruturas.Lista;
import estruturas.Pilha;

public class App {

    public static void main(String[] args) throws Exception {
        // exemploPilha();
        // historico();
        // exemploFila();
        // imprimirFila();
        // exemploLista();
        // imprimirLista();
    }

    private static void exemploPilha() {
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

    private static void exemploFila() {
        Fila fila = new Fila();
        System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");
        fila.enfileirar("Atendente 01");
        fila.enfileirar("Atendente 02");
        System.out.println(fila.desenfileirar());
        fila.enfileirar("Atendente 03");
        System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");
        System.out.println(fila.inicio());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.inicio());
    }

    private static void imprimirFila() {
        Fila fila = new Fila();
        fila.enfileirar("Atendente 01");
        fila.enfileirar("Atendente 02");
        fila.enfileirar("Atendente 03");
        Object info = fila.desenfileirar();
        while (info != null) {
            System.out.println(info);
            info = fila.desenfileirar();
        }
    }

    private static void exemploLista() {
        Lista lista = new Lista();
        System.out.println(lista.estaVazia() ? "Vazia" : "Não vazia");
        lista.adicionar("Item 01");
        lista.adicionar("Item 02");
        lista.adicionar("Item 03");
        System.out.println(lista.estaVazia() ? "Vazia" : "Não vazia");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        lista.remover(0);
        lista.remover(2);
        lista.adicionar("Item 04");
        lista.adicionar("Item 05");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        System.out.println(lista.get(4));
        lista.remover(3);
        lista.remover(2);
        lista.remover(1);
        lista.remover(0);
        System.out.println(lista.estaVazia() ? "Vazia" : "Não vazia");
    }

    private static void imprimirLista() {
        Lista lista = new Lista();
        lista.adicionar("Item 01");
        lista.adicionar("Item 02");
        lista.adicionar("Item 03");
        int i = 0;
        Object info = lista.get(i);
        while (info != null) {
            System.out.println(info);
            i++;
            info = lista.get(i);
        }
    }
}
