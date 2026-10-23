package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre FUNÇÕES
//Exercício 8: Função que Calcula o Fatorial de um Número

public class Main {
    public static int calcularFatorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        int fatorial = calcularFatorial(num);
        System.out.println("O fatorial é: " + fatorial);

    }
}