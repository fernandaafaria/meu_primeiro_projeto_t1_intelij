package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre FUNÇÕES
//Exercício 9: Função para Calcular a Potência de Um Número

public class Main {
    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int base = entrada.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = entrada.nextInt();
        int potencia = calcularPotencia(base, expoente);
        System.out.println("O resultado de " + base + "^" + expoente + " é: " + potencia);
    }
}