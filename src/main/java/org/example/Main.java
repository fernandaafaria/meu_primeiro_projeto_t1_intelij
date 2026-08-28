package org.example;

/*
Nível 2: Operadores lógicos e relacionais

2. Operadores Lógicos Básicos: Crie um programa que declare três variáveis booleanas representando condições quaisquer (ex: cond1, cond2, cond3). Utilize os operadores lógicos AND (&&) e OR (||) para combinar essas condições e exiba os resultados no console.
 */
public class Main {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;
        boolean cond1, cond2, cond3;

        cond1 = A && B;
        cond2 = A || B;
        cond3 = !A;

        System.out.println("A E B: " + cond1);
        System.out.println("A OU B: " + cond2);
        System.out.println("Inverso de A: " + cond3);



        }
    }

