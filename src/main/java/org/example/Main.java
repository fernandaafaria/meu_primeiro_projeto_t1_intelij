package org.example;

//FUNDAMENTOS DE JAVA: EXERCÍCIOS: VETORES
//Exercicio 1 - Soma de Elementos Inteiros em um Vetor

public class Main {
    public static void main(String[] args) {
        int[] valores = {20, 5, 10, 45, 50};
        int soma = 0;

        System.out.print("A soma de: ");

        for(int i = 0; i < valores.length; i++){
            soma += valores[i];
            System.out.print(valores[i]);
            if(i == valores.length - 1) break;
            System.out.print(" + ");

        }
        System.out.println(" = " + soma);

    }
}