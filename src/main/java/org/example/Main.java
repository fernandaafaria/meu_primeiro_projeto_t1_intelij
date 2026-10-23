package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre FUNÇÕES
//Exercício 7: Função para Determinar o Maior de Três Números

public class Main {
    public static int maiornumero(int num1, int num2, int num3) {
        if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o valor 2: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o valor 3: ");
        int num3 = sc.nextInt();
        int maior = maiornumero(num1, num2, num3);
        System.out.print("O maior numero é: " + maior);
    }
}