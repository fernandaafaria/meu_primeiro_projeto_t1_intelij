package org.example;
import java.util.Scanner;
//Nível 5: Desafios Integradores
//Exercicio 4 -Cálculo de Juros Simples: Peça o capital inicial, a taxa de juros mensal e o tempo (meses).Calcule o montante final usando juros simples (J = C * i * t).
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o capital inicial:");
        double cap = entrada.nextDouble();
        System.out.println("Digite a taxa de juros mensal (em %):");
        double taxa = entrada.nextDouble();
        System.out.println("Digite o tempo em meses:");
        double tempo = entrada.nextDouble();

        double juros = cap * (taxa / 100) * tempo;
        double montante = cap + juros;

        System.out.println("Montante final:\n" + "R$ " + montante);
    }
}