package estruturas;

public class Fila {

    private No inicio;
    private No fim;
    private int tamanho;

    public Fila() {
        tamanho = 0;
        inicio = null;
        fim = null;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public Object inicio() {
        if (estaVazia()) {
            return null;
        }
        return inicio.info;
    }

    public void enfileirar(Object info) {
        No no = new No(info);        
        if (estaVazia()) {
            inicio = no;
        } else {
            fim.prox = no;
        }
        fim = no;
        tamanho++;
    }

    public Object desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        Object info = inicio.info;
        inicio = inicio.prox;
        tamanho--;
        if (estaVazia()) {
            fim = null;
        }
        return info;
    }
}
