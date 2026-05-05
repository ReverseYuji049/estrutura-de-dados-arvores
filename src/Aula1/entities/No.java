package Aula1.entities;

public class No {
    private Integer conteudo;

    private No esquerda;

    private No direita;



    public No(Integer conteudo, No esquerda, No direita) {
        this.conteudo = conteudo;
        this.esquerda = esquerda;
        this.direita = direita;
    }
    public No(Integer conteudo) {
        // Define o valor do nó
        this.conteudo = conteudo;
        // Esquerda inicia vazia
        this.esquerda = null;
        // Direita inicia vazia
        this.direita = null;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public Integer getConteudo() {
        return conteudo;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }
}

