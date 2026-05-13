package Aula1.entities;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = new No(null);
        System.out.println("Árvore binária criada com sucesso!");
    }

    // Inserir:
    //  - Cria um novo nó
    //  - Se a lista estiver vazia, insere o novo nó da raiz
    //  - Senão, ele chama o método recursivo
    public void inserir(Integer conteudo) {
        // Cria um novo nó
        No novoNo = new No(conteudo);
        // Se a lista estiver vazia, insere o novo nó na raiz
        if (estaVazia()) {
            this.raiz = novoNo;
        }
        // Senão, ele chama o método recursivo
        else {
            inserirRecursivo(novoNo, this.raiz);
        }
    }
    // Inserir (Recursivo)
    //  -

    public void inserirRecursivo(No novoNo, No atual) {
        // Verifica se o conteúdo do nó atual é maior que o novo nó
        if (atual.getConteudo() > novoNo.getConteudo()) {
            // Verifica se o filho da esquerda está vazio
            if (atual.getEsquerda() == null) {
                // Liga o novo nó na esquerda do novo nó
                atual.setEsquerda(novoNo);
                System.out.println("O nó " + novoNo.getConteudo() + " foi inserido na Árvore.");
                return;
            } else {
                // Caso já exista um nó na esquerda
                // Chama o método novamente passando o novo nó e a esquerda do nó atual
                inserirRecursivo(novoNo, atual.getEsquerda());
            }
        }
        // Verifica se os valores são iguais
        else if (atual.getConteudo() == novoNo.getConteudo()) {
            System.out.println("Não é possível informar nós repetidos.");
            return;
        }
        // O novo valor é maior que o atual, então vai para a subárvore direita
        else {
            // Verifica se o filho da esquerda está vazio
            if (atual.getDireita() == null) {
                // Liga o novo nó na direta do o nó atual
                atual.setDireita(novoNo);
                System.out.println("O nó " + novoNo.getConteudo() + " foi inserido na Árvore.");
                return;
            } else {
                // Caso já exista um nó na direita
                // Chama o método novamente passando o novo nó e a direita do nó atual
                inserirRecursivo(novoNo, atual.getDireita());
            }
        }
    }

    // Inserir (interativo):
    //  - Cria um nó
    //  - Se estiver vazia, esse novo nó será na raiz
    //  - Senão, investiga à esquerda da árvore
    //  - Insere o elemento na esquerda e liga a origem a esse novo nó
    //  - Se o conteúdo for igual ao conteúdo do nó atual, impede a inserção
    //  - Senão, investiga à direita da árvore
    //  - Insere o elemento na direita e liga a origem a esse novo nó
    public void inserirIterativo(Integer conteudo) {
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
    private void preOrdem(No no) {
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
    private void emOrdem(No no) {
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
    private void posOrdem(No no) {
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



