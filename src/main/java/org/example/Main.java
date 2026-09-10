package org.example;
import java.util.Scanner;
//Nível 3: Processamento e Fórmulas Matemáticas
//Exercicio 4 - Perímetro do Retângulo: Solicite a base e a altura de um retângulo. Calcule e exiba o perímetro.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da base em metros:");
        double base = entrada.nextDouble();
        System.out.println("Digite o valor da altura em metros:");
        double altura = entrada.nextDouble();
        double peri = base + altura + base + altura;
        System.out.println("Perímetro do retângulo:\n" + peri + " m");
    }
}