package org.example;

/*
Nível 1: Casting implícito e explícito

3. Conversão de Tipos (Casting Implícito e Explícito): Declare uma variável do tipo float e atribua um valor fracionado. Em seguida, declare uma variável do tipo long e atribua a ela o valor da variável float usando casting explícito. Por fim, declare uma variável do tipo double e atribua a ela o valor da variável long (casting implícito). Exiba todos os valores no console.
 */
public class Main {
    public static void main(String[] args) {
        float varF = 2.7f;
        long varL = (long) varF; //casting explícito
        double varD = varL; //casting implícito
        System.out.println("Valor float " + varF);
        System.out.println("Valor long: " + varL);
        System.out.println("Valor double: " + varD);


        }
    }

