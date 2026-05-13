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

    private void inserirRecursivo(No novoNo, No atual) {
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
    // Remover:
    //  - Verifica se a árvore está vazia
    //  - Senão estiver, cria um nó referência para a raiz (atual)
    //  - Chama o método removerRecursivo passando os argumentos conteúdo e o nó atual
    public void remover(Integer conteudo) {
        // Verificação de árvore vazia
        if (estaVazia()) {
            System.out.println("A árvore está vazia!");
            return;
        } else {
            // Referência a raiz
            No atual = this.raiz;
            // Chamada do método recursivo
            this.raiz = removerRecursivo(conteudo, atual);
        }
    }
    // Remover (Recursivo):
    private No removerRecursivo(Integer conteudo, No atual) {
        // Caso base: o elemento não foi encontrado
        if (atual == null) {
            System.out.println("O elemento não foi encontrado.");
            return null;
        }
        // Procura o elemento na esquerda
        else if (atual.getConteudo() > conteudo) {
            // Atualiza o ponteiro esquerdo após a remoção
            atual.setEsquerda(removerRecursivo(conteudo, atual.getEsquerda()));
        }
        // Procura o elemento na direita
        else if (atual.getConteudo() < conteudo) {
            // Atualiza o ponteiro direito após a remoção
            atual.setDireita(removerRecursivo(conteudo, atual.getDireita()));
        }
        // Senão, encontrou o elemento a ser removido
        else {
            // Caso nó folha: sem filhos
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                System.out.println("O elemento " + conteudo + " foi removido.");
                // Retorna null para o nó pai remover o nó folha
                return null;
            }
            // Caso nó com um filho na direita:
            else if (atual.getEsquerda() == null) {
                System.out.println("O elemento " + conteudo + " foi removido.");
                // Retorna o nó direito, onde o nó pai apontará para ele
                return atual.getDireita();
            }
            // Caso nó com um filho na esquerda:
            else if (atual.getDireita() == null) {
                System.out.println("O elemento " + conteudo + " foi removido.");
                // Retorna o nó esquerdo, onde o nó pai apontará para ele
                return atual.getEsquerda();
            }
            // Caso nó com dois filhos
            else {
                // Procura o menor nó da subárvore direita
                No sucessor = sucessor(atual.getDireita());
                // Copia o conteúdo do sucessor para o atual
                atual.setConteudo(sucessor.getConteudo());
                // Remove o sucessor original da subárvore direita e atualiza o ponteiro direito
                atual.setDireita(removerRecursivo(sucessor.getConteudo(), atual.getDireita()));
                System.out.println("O elemento " + conteudo + " foi removido.");
                // Retorna o nó atualizado
                return atual;
            }
        }
        // Retorna o nó atualizado para manter os ponteiros certos
        return atual;
    }

    // Método auxiliar da remoção:
    //  - Realiza a busca do menor nó
    private No sucessor(No atual) {
        while (atual.getEsquerda() != null) {
            // Avança pela subárvore esquerda
            atual = atual.getEsquerda();
        }
        // Retorna o sucessor
        return atual;
    }
    // Buscar Nó:
    public boolean buscarNo(Integer conteudo) {
        // Verificação de árvore vazia
        if (estaVazia()) {
            System.out.println("A árvore está vazia!");
            return false;
        } else {
            // Referência da raiz para percorrer a árvore
            No noAtual = this.raiz;
            while (noAtual != null) {
                // Ao encontrar o elemento, retorna verdadeiro
                if (noAtual.getConteudo().equals(conteudo)) {
                    System.out.println("O elemento " + conteudo + " foi encontrado.");
                    return true;
                } else {
                    // Procura à direita
                    if (conteudo > noAtual.getConteudo()) {
                        noAtual = noAtual.getDireita();
                    }
                    // Procura à esquerda
                    else if (conteudo < noAtual.getConteudo()) {
                        noAtual = noAtual.getEsquerda();
                    }
                }
            }
            // Elemento não foi encontrado
            System.out.println("O elemento não existe na árvore.");
        }
        return false;
    }
    // Verificação de árvore vazia
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



