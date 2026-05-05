package Aula1.entities;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = new No(null);
        System.out.println("Árvore binária criada com sucesso!");
    }
    // Inserir (interativo):
    //  - Cria um nó
    //  - Se estiver vazia, esse novo nó será na raiz
    //  - Senão, investiga à esquerda da árvore
    //  - Insere o elemento na esquerda e liga a origem a esse novo nó
    //  - Se o conteúdo for igual ao conteúdo do nó atual, impede a inserção
    //  - Senão, investiga à direita da árvore
    //  - Insere o elemento na direita e liga a origem a esse novo nó
    public void inserir(Integer conteudo) {
        // Cria um novo nó
        No novoNo = new No(conteudo);
        // Se a lista estiver vazia, insere o novo nó na raiz
        if (estaVazia()) {
            this.raiz = novoNo;
        } else {
            // Referência a raiz que percorrerá a árvore
            No atual = this.raiz;
            // Verifica até ter um apontamento nulo
            while(true) {
                // Investiga para a esquerda
                if (atual.getConteudo() > novoNo.getConteudo()) {
                    // Sabe-se que não há mais um nó
                    if (atual.getEsquerda() == null) {
                        // Liga o novo nó no atual (origem)
                        atual.setEsquerda(novoNo);
                        return;
                    } else {
                        // Investiga o filho
                        atual = atual.getEsquerda();
                    }
                }
                else if (atual.getConteudo() == novoNo.getConteudo()) {
                    System.out.println("Não é possível informar nós repetidos");
                    return;
                }
                // Investiga para a direita
                else {
                    // Sabe-se que não há mais um nó
                    if (atual.getDireita() == null) {
                        // Liga o novo nó no atual (origem)
                        atual.setDireita(novoNo);
                        return;
                    } else {
                        // Investiga o filho
                        atual = atual.getDireita();
                    }
                }
            }
        }
    }
    public boolean estaVazia() {
        if (raiz.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }
    // Percorre a árvore binária na ordem que a recursão pedir
    // - Começa pela raiz
    // - Termina na direita
    public void preOrdem(No no) {
        // Verificação de árvore vazia
        if (no == null) {
            //System.out.println("O nó está vazio!");
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
            //System.out.println("O nó está vazio!");
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
            //System.out.println("O nó está vazio!");
            return;
        }
        // Percorre recursivamente a sub árvore esquerda
        posOrdem(no.getEsquerda());
        // Percorre recursivamente a sub árvore direita
        posOrdem(no.getDireita());
        // Imprime o conteúdo do nó
        System.out.println(no.getConteudo());
    }

    public void exibir(String percurso) {
        switch (percurso) {
            case("Pre"):
                preOrdem(this.raiz);
                break;
            case ("Em"):
                emOrdem(this.raiz);
                break;
            case ("Pos"):
                posOrdem(this.raiz);
                break;
        }
    }
}



