package org.example;

/*
Nível 1: Casting implícito e explícito

4. Diferença entre Tipos de Dados: Declare uma variável do tipo short e atribua a ela um valor pequeno. Declare uma variável do tipo int e atribua a ela o valor da variável short (casting implícito). Depois, declare uma variável do tipo byte e atribua a ela o valor da variável short usando casting explícito. Exiba todos os valores no console.
 */
public class Main {
    public static void main(String[] args) {
        short valorShort = 32;
        int valorInt = valorShort;
        byte valorByte = (byte) valorShort;

        System.out.println("Valor short: " + valorShort);
        System.out.println("Valor int: " + valorInt);
        System.out.println("Valor byte: " + valorByte);



        }
    }

