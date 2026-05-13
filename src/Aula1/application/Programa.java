package Aula1.application;

import Aula1.entities.ArvoreBinaria;

public class Programa {
    static void main() {
        System.out.println("=== TESTE DE INSERÇÃO ITERATIVO ===");
        testeInserirIterativo();
        System.out.println("=== TESTE DE INSERÇÃO RECURSIVO ===");
        testeInserirRecursivo();
        System.out.println("=== TESTE DE REMOÇÃO RECURSIVA ===");
        testeRemoverRecursivo();
        System.out.println("=== Teste de Remoção de Folha ===");
        testeRemoverFolha();
        System.out.println("=== Teste de Remoção de Filho à Direita ===");
        testeRemoverFilhoDireita();
        System.out.println("=== Teste de Remoção de Filho à Esquerda");
        testeRemoverFilhoEsquerda();
        System.out.println("=== Teste de Remoção de Raiz ===");
        testeRemoverRaiz();
        System.out.println("=== Teste de Remoção de Inexistente ===");
        testeRemoverInexistente();
        System.out.println("=== Teste de Remoção de Árvore Vazia ===");
        testeRemoverArvoreVazia();

    }

    private static void testeInserirIterativo() {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserirIterativo(5);
        arvoreBinaria.inserirIterativo(10);
        arvoreBinaria.inserirIterativo(13);
        System.out.println("Pré-ordem: ");
        arvoreBinaria.exibir("Pre");
        System.out.println("Em ordem: ");
        arvoreBinaria.exibir("Em");
        System.out.println("Pós-ordem: ");
        arvoreBinaria.exibir("Pos");
    }

    private static void testeInserirRecursivo() {
        ArvoreBinaria arvore1 = new ArvoreBinaria();
        arvore1.inserir(7);
        arvore1.inserir(5);
        arvore1.inserir(2);
        arvore1.inserir(-10);
        arvore1.inserir(3);
        arvore1.inserir(8);
        arvore1.inserir(11);
        arvore1.inserir(10);
        arvore1.inserir(9);
        arvore1.inserir(14);
        System.out.println("Pré-ordem: ");
        arvore1.exibir("Pre");
        System.out.println("Em ordem: ");
        arvore1.exibir("Em");
        System.out.println("Pós-ordem: ");
        arvore1.exibir("Pos");
    }

    private static void testeRemoverRecursivo() {
        ArvoreBinaria arvore3 = new ArvoreBinaria();
        arvore3.inserir(3);
        arvore3.inserir(7);
        arvore3.inserir(8);
        arvore3.inserir(12);
        arvore3.inserir(14);
        arvore3.inserir(2);
        arvore3.inserir(5);
        arvore3.exibir("Pos");
        System.out.println();
        arvore3.remover(7);
        arvore3.exibir("Pos");
        System.out.println();
        arvore3.remover(8);
        arvore3.exibir("Pos");
    }

    private static void testeRemoverFolha() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(8);
        arvore.inserir(12);
        arvore.inserir(14);
        arvore.inserir(2);
        arvore.inserir(5);

        System.out.println("ANTES:");
        arvore.exibir("Pos");

        System.out.println("\nRemovendo folha 5:");
        arvore.remover(5);

        arvore.exibir("Pos");
    }

    private static void testeRemoverFilhoDireita() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(8);
        arvore.inserir(12);
        arvore.inserir(14);
        arvore.inserir(2);
        arvore.inserir(5);

        System.out.println("ANTES:");
        arvore.exibir("Pos");

        System.out.println("\nRemovendo 8:");
        arvore.remover(8);

        arvore.exibir("Pos");
    }
    private static void testeRemoverFilhoEsquerda() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(2);

        System.out.println("ANTES:");
        arvore.exibir("Pos");

        System.out.println("\nRemovendo 5:");
        arvore.remover(5);

        arvore.exibir("Pos");
    }

    private static void testeRemoverRaiz() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(8);
        arvore.inserir(12);
        arvore.inserir(14);
        arvore.inserir(2);
        arvore.inserir(5);

        System.out.println("ANTES:");
        arvore.exibir("Pos");

        System.out.println("\nRemovendo raiz 3:");
        arvore.remover(3);

        arvore.exibir("Pos");
    }

    private static void testeRemoverInexistente() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(20);

        System.out.println("ANTES:");
        arvore.exibir("Pos");

        System.out.println("\nRemovendo 100:");
        arvore.remover(100);

        arvore.exibir("Pos");
    }

    private static void testeRemoverArvoreVazia() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.remover(10);

        arvore.exibir("Pos");
    }

}
