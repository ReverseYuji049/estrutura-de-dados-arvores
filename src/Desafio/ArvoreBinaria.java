package Desafio;

import Estudo.ArvoreBinaria.entities.No;

public class ArvoreBinaria<T extends Comparable<T>> {

    private No<T> raiz;

    public ArvoreBinaria() {
        this.raiz = new No<>(null);
        System.out.println("Árvore binária criada com sucesso!");
    }

    public void inserir(T conteudo) {
        if (this.raiz == null) {
            this.raiz = new No<>(conteudo);
            return;
        }
        recursão(raiz, conteudo);
    }
    @SuppressWarnings("unchecked")
    public void recursão(No atual, T conteudo) {
        if (conteudo.compareTo((T) atual.getConteudo()) < 0) {
            if (atual.getEsquerda() == null) {
                No novoNo = new No(conteudo);
                atual.setEsquerda(novoNo);
            } else {
                recursão(atual.getEsquerda(), conteudo);
            }
        } else if (conteudo.compareTo((T) atual.getConteudo()) > 0) {
            No novoNo = new No(conteudo);
            atual.setDireita(novoNo);
        } else {
            recursão(atual.getDireita(), conteudo);
        }
    }
}

