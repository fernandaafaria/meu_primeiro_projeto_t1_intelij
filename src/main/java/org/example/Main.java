package org.example;
import java.util.Scanner;

// Exercicios de estrutura de decisão
// Questão 2 -Aprovação do aluno
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        System.out.println("Digite sua nota:");
        nota = entrada.nextDouble();

        if (nota >=7 ){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}