package Estudo.ArvoreBinaria.entities;

public class ArvoreBinaria<T> {

    private No<T> raiz;

    public ArvoreBinaria() {
        this.raiz = new No<>(null);
        System.out.println("Árvore binária criada com sucesso!");
    }

    public void inserir() {

    }

    // Percorre a árvore binária na ordem que a recursão pedir
    // - Começa pela raiz
    // - Termina na direita
    public void preOrdem(No no) {
        // Verificação de árvore vazia
        if (no == null) {
            System.out.println("O nó está vazio!");
            return;
        }
        // Imprime o conteúdo do nó
        System.out.println(no.getConteudo());
        // Percorre recursivamente a sub árvore esquerda
        preOrdem(no.getEsquerda());
        // Percorre recursivamente a sub árvore direita
        preOrdem(no.getDireita());
    }
    // Percorre a árvore binária em ordem
    // - Começa mais pela esquerda e termina na direita
    // - Primeira verifica a esquerda para aí imprimir o conteúdo
    public void emOrdem(No no) {
        // Verificação de árvore vazia
        if (no == null) {
            System.out.println("O nó está vazio!");
            return;
        }
        // Percorre recursivamente a sub árvore esquerda
        emOrdem(no.getEsquerda());
        // Imprime o conteúdo do nó
        System.out.println(no.getConteudo());
        // Percorre recursivamente a sub árvore direita
        emOrdem(no.getDireita());
    }
    // Percorre a árvore binária em pós-ordem
    // - Começa pelo mais a esquerda
    // - Percorre o mais a direita dele
    // - Imprime o conteúdo
    public void posOrdem(No no) {
        // Verificação de árvore vazia
        if (no == null) {
            System.out.println("O nó está vazio!");
            return;
        }
        // Percorre recursivamente a sub árvore esquerda
        posOrdem(no.getEsquerda());
        // Percorre recursivamente a sub árvore direita
        posOrdem(no.getDireita());
        // Imprime o conteúdo do nó
        System.out.println(no.getConteudo());
    }

}
