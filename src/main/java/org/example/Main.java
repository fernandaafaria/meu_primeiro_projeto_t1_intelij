package org.example;
import java.util.Scanner;

//FUNDAMENTOS DE JAVA: EXERCÍCIOS: VETORES
//Exercício 2: Busca de Caracteres em um Vetor

public class Main {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      char[] letra = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Informe a letra que deseja buscar: ");
        char letraUsuario = entrada.next().charAt(0);

        for(int i = 0; i < letra.length; i++){
            if(letra[i] == letraUsuario){
                System.out.println("Achada a letra" + letraUsuario + "na posição " + i);
            }
        }

    }
}