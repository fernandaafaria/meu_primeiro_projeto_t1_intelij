package org.example;
import java.util.Scanner;
//Nível 5: Desafios Integradores
//Exercicio 5 -Peça ao usuário uma quantidade total de segundos. Converta e exiba no formato: "X horas, Y minutos e Z segundos"
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade total de segundos:");
        int totalSegundos = entrada.nextInt();
        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
    }
}