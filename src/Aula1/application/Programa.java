package Aula1.application;

import Aula1.entities.ArvoreBinaria;

public class Programa {
    static void main() {
        System.out.println("=== TESTE DE INSERÇÃO ITERATIVO ===");
        testeInserirIterativo();
        System.out.println("=== TESTE DE INSERÇÃO RECURSIVO ===");
        testeInserirRecursivo();
    }

    public static void testeInserirIterativo() {
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

    public static void testeInserirRecursivo() {
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

}
