package estruturas;

public class Lista {

    private int tamanho;
    private No inicio;
    private No fim;

    public Lista() {
        this.tamanho = 0;
        this.inicio = null;
        this.fim = null;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void adicionar(Object info) {
        No no = new No(info);
        if (estaVazia()) {
            inicio = no;
        } else {
            fim.prox = no;
        }
        fim = no;
        tamanho++;
    }

    public Object get(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return null;
        } else {
            No atual = inicio;
            for (int i = 0; i <= indice; i++) {
                if (i == indice) {
                    return atual.info;
                }
                atual = atual.prox;
            }
        }
        return null;
    }

    public boolean remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return false;
        }
        if (indice == 0) {
            inicio = inicio.prox;
        } else {
            No atual = inicio;
            for (int i = 0; i < indice - 1; i++) {
                atual = atual.prox;
            }
            atual.prox = atual.prox.prox;
            if (indice == tamanho - 1) {
                fim = atual;
            }
        }
        tamanho--;
        return true;
    }
}
