package org.example;
import java.util.Scanner;

//FUNDAMENTOS DE JAVA: EXERCÍCIOS: VETORES
//Exercício 4: Média de Notas (double)

public class Main {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      double media = 0.0;
      double[] notas = new double[4];

      for(int i =0; i < notas.length; i++){
          System.out.println("Digite a nota [" + i + "] :");
          notas[i] = entrada.nextDouble();
          media += notas[i];
      }
        media = media / notas.length;
        System.out.printf("%nMédia das notas: %.2f%n", media);



    }
}