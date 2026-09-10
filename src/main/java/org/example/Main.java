package org.example;
import java.util.Scanner;
//Nível 4: Contexto Real e Conversões
//Exercicio 4 - Área do Círculo: Leia o raio de um círculo e calcule a área. Use Math.PI para o cálculo (A = π * r²).
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do raio do círculo:");
        double raio = entrada.nextDouble();
        double area = Math.PI * (raio * raio);
        System.out.println("Área do círculo:\n" + area);
    }
}