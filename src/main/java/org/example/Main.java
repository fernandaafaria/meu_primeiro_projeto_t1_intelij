package org.example;

/*
Nível 1: Casting implícito e explícito

2. Casting Explícito: Declare uma variável do tipo double com um valor fracionado. Realize o casting explícito para uma variável do tipo int e exiba ambos os valores no console.
 */
public class Main {
    public static void main(String[] args) {
        double valorDouble = 33.7;
        int valorInt = (int) valorDouble; //casting explícito
        System.out.println("Valor Double: " + valorDouble);
        System.out.println("Valor inteiro: " + valorInt);


        }
    }

