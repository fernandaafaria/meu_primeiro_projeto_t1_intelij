package org.example;
import java.util.Scanner;
//Nível 4: Contexto Real e Conversões
//Exercicio 5 -Troca de Valores: Leia dois valores A e B. Troque os valores das variáveis de forma que A passe a ter o valor de B e vice-versa. Exiba os valores antes e depois da troca.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = entrada.nextInt();
        System.out.println("Digite o valor de B:");
        int b = entrada.nextInt();

        System.out.println("Valores antes da troca:\nA: " + a + "\nB: " + b);

        int aux = a;
        a = b;
        b = aux;

        System.out.println("Valores depois da troca:\nA: " + a + "\nB: " + b);
    }
}