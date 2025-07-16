package Aula01;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a letra M ou F: ");
        String genero = entrada.nextLine().toUpperCase(); 

        if (genero.equals("M")) {
            System.out.println("Masculino");
        } else if (genero.equals("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Entrada inválida.");
        }

        entrada.close();
    }
}
