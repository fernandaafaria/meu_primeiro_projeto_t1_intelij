package org.example;
import java.util.Scanner;
//Nível 3: Processamento e Fórmulas Matemáticas
//Exercicio 2: Conversor de Temperatura
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em °C");
        double celsius= sc.nextDouble ();
        double faren = (celsius*9/5) + 32;
        System.out.println ("A temperatura em farenheit:\n" + faren + " °F");
    }
}