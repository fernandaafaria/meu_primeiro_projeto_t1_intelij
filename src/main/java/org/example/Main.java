package org.example;
import java.util.Scanner;

// Vetores e Matrizes
// Atividade 2 - Temperatura em Estufa

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] temperatura = new double[10];
        double maior = 0.0;

        for (int i = 0; i < temperatura.length; i++) {

            System.out.print("Digite a temperatura do dia " + (i + 1) + ", em graus: ");
            temperatura[i] = entrada.nextDouble();


            if (temperatura[i] > 30) {
                maior++;
            }
        }

        System.out.println("Quantidade de dias acima de 30°C: " + maior);
    }
}