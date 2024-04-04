package estruturas;

public class Pilha {

    private No topo;
    private int tamanho;

    public Pilha() {
        topo = null;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public Object topo() {
        if (estaVazia()) {
            return null;
        }
        return topo.info;
    }

    public void empilhar(Object info) {
        No no = new No(info);
        no.prox = topo;
        topo = no;
        tamanho++;
    }

    public Object desempilhar() {
        if (estaVazia()) {
            return null;
        }
        Object info = topo.info;
        topo = topo.prox;
        tamanho--;
        return info;
    }

}
