package org.example;
import java.util.Scanner;

// Vetores e Matrizes
// Atividade 10 - Produção de Frutas por Pomar

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] producao = new int[4][12];

        System.out.println("Digite a produção de cada pomar durante os 12 meses:");

        for (int i = 0; i < 4; i++) {
            System.out.println("\nPomar " + (i + 1));

            for (int j = 0; j < 12; j++) {
                System.out.print("Mês " + (j + 1) + ": ");
                producao[i][j] = entrada.nextInt();
            }
        }

        int maiorProducao = 0;
        int pomarMaior = 0;

        for (int i = 0; i < 4; i++) {
            int total = 0;

            for (int j = 0; j < 12; j++) {
                total += producao[i][j];
            }

            System.out.println("\nProdução anual do Pomar " + (i + 1) + ": " + total);

            if (total > maiorProducao) {
                maiorProducao = total;
                pomarMaior = i;
            }
        }

        System.out.println("Pomar com maior produção anual: Pomar " + (pomarMaior + 1));
        System.out.println("Produção total: " + maiorProducao);

    }
}