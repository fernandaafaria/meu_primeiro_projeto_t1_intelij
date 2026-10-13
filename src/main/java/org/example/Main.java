package org.example;
import java.util.Scanner;

//FUNDAMENTOS DE JAVA: EXERCÍCIOS: MATRIZES
//Exercício 8: Matriz de Números Reais (double)

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matriz = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextDouble();
            }
        }

        System.out.println();
        for (int i = 0; i < 2; i++) {
            double somaLinha = 0.0;
            for (int j = 0; j < 2; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.printf("Soma dos elementos da linha %d: %.2f%n", i, somaLinha);
        }

    }
}