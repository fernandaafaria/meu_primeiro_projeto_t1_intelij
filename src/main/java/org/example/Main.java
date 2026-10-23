package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre FUNÇÕES
//Exercício 10: Função para Calcular o IMC

public class Main {
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = entrada.nextDouble();
        double imc = calcularIMC(peso, altura);
        System.out.printf("O seu IMC é: %.2f\n", imc);
    }
}