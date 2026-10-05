package org.example;
import java.util.Scanner;

//FUNDAMENTOS DE JAVA: EXERCÍCIOS: VETORES
//Exercício 3: Contagem de Valores Booleanos

public class Main {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      boolean[] usuario = new boolean[8];
        int contadorTrue = 0;

      for(int i =0; i < usuario.length; i++){
          System.out.println("Informe true ou false para o bit [" + i + ']');
          usuario[i] = entrada.nextBoolean();
          if(usuario[i] == true) contadorTrue++;
      }
        System.out.println("Quantidade de true: " + contadorTrue);



    }
}