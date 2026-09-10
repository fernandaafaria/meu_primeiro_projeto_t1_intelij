package org.example;
import java.util.Scanner;
//Nível 5: Desafios Integradores
//Exercicio 1 -Cálculo de IMC: Peça o peso e a altura de uma pessoa. Calcule o Índice de Massa Corporal (IMC = peso / altura²).
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso em kg:");
        double peso = entrada.nextDouble();
        System.out.println("Digite a altura em metros:");
        double altura = entrada.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Índice de Massa Corporal (IMC):\n" + imc);
    }
}