package org.example;
import java.util.Scanner;
//Nível 5: Desafios Integradores
//Exercicio 3 -Divisão e Resto: Leia dois números inteiros. Exiba o quociente da divisão inteira e o resto da divisão (operador %).
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = entrada.nextInt();
        int quociente = num1 / num2;
        int resto = num1 % num2;
        System.out.println("Quociente da divisão:\n" + quociente);
        System.out.println("Resto da divisão:\n" + resto);
    }
}