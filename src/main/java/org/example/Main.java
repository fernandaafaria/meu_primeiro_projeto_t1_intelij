package org.example;
import java.util.Scanner;

//FUNDAMENTOS DE JAVA: EXERCÍCIOS: MATRIZES
//Exercício 7: Soma de Valores em uma Matriz

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaTotal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
                somaTotal += matriz[i][j];
            }
        }
        System.out.println("\nA soma de todos os elementos da matriz é: " + somaTotal);

    }
}