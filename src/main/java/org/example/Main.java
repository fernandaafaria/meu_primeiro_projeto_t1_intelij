package org.example;
import java.util.Scanner;
//Nível 5: Desafios Integradores
//Exercicio 2 -Conversor de Medidas: Leia um valor em metros e exiba-o convertido para centímetros e milímetros.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor em metros:");
        double metros = entrada.nextDouble();
        double cm = metros * 100;
        double mm = metros * 1000;
        System.out.println("Valor convertido:\n" + cm + " cm\n" + mm + " mm");
    }
}