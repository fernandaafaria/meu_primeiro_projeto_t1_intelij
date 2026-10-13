package org.example;
import java.util.Scanner;

//FUNDAMENTOS DE JAVA: EXERCÍCIOS: VETORES
//Exercício 5: Vetor de Strings

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = entrada.nextLine();
        }

        System.out.print("\nDigite um nome para verificar se está no vetor: ");
        String nomeBuscado = entrada.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O nome \"" + nomeBuscado + "\" está presente no vetor!");
        } else {
            System.out.println("O nome \"" + nomeBuscado + "\" não foi encontrado no vetor.");
        }





    }
}