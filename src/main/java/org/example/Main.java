package org.example;
import java.util.Scanner;

// Exercicios de estrutura de decisão
// Questão 3 - Comparação de notas
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextDouble();

        if (n1 > n2 ){
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }
}