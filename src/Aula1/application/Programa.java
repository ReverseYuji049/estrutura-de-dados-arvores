package Aula1.application;

import Aula1.entities.ArvoreBinaria;

public class Programa {
    static void main() {
        System.out.println("=== TESTE DE INSERÇÃO ===");
        testeInserir1();
        System.out.println();
        testeInserir2();
    }

    public static void testeInserir1() {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(5);
        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(13);
        System.out.println("Pré-ordem: ");
        arvoreBinaria.exibir("Pre");
        System.out.println("Em ordem: ");
        arvoreBinaria.exibir("Em");
        System.out.println("Pós-ordem: ");
        arvoreBinaria.exibir("Pos");
    }

    public static void testeInserir2() {
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
