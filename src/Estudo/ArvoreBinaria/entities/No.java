package Estudo.ArvoreBinaria.entities;

public class No<T> {

    private T conteudo;

    private No<T> esquerda;

    private No<T> direita;

    public No(T conteudo) {
        // Define o valor do nó
        this.conteudo = conteudo;
        // Esquerda inicia vazia
        this.esquerda = null;
        // Direita inicia vazia
        this.direita = null;
    }

    public No(T conteudo, No<T> esquerda, No<T> direita) {
        this.conteudo = conteudo;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }

    public No<T> getDireita() {
        return direita;
    }

    public void setDireita(No<T> direita) {
        this.direita = direita;
    }
}
