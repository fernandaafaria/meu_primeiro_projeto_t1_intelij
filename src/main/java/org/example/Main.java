package org.example;
import java.util.Scanner;
//Nível 3: Processamento e Fórmulas Matemáticas
//Exercicio 1: Média Aritmética: Receba três notas de um aluno (double) e calcule a média aritmética simples.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: (10 a 0)");
        double nota1= sc.nextDouble ();
        System.out.println("Digite a segunda nota: (10 a 0)");
        double nota2= sc.nextDouble ();
        System.out.println("Digite a terceira nota: (10 a 0)");
        double nota3= sc.nextDouble ();
        double media = (nota1 + nota2 + nota3)/ 3;
        System.out.println ("média:\n" + media);
    }
}
