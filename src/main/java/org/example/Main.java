package org.example;
import java.util.Scanner;
//Nível 4: Contexto Real e Conversões
//Exercicio 2 - Consumo de Combustível: Peça a distância percorrida (km) e o total de combustível gasto (litros). Calcule o consumo médio (km/l).
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a distância percorrida em km:");
        double dist = entrada.nextDouble();
        System.out.println("Digite o total de combustível gasto em litros:");
        double litros = entrada.nextDouble();
        double consumo = dist / litros;
        System.out.println("Consumo médio:\n" + consumo + " km/l");
    }
}