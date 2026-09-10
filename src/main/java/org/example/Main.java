package org.example;
import java.util.Scanner;
//Nível 4: Contexto Real e Conversões
//Exercicio 1 - Conversor de Moeda: Peça um valor em Reais e a cotação atual do Dólar. Exiba o valor convertido em Dólares.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor em Reais (R$):");
        double reais = entrada.nextDouble();
        System.out.println("Digite a cotação atual do Dólar:");
        double cotacao = entrada.nextDouble();
        double dolares = reais / cotacao;
        System.out.println("Valor em Dólares:\n" + "US$ " + dolares);
    }
}