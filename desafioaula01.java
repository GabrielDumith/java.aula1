package Aula01;

import java.util.Scanner;

public class desafioaula01 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        int cont = 0;

	        System.out.print("Telefonou para a vítima? ");
	        String resp1 = entrada.nextLine();
	        if (resp1.equalsIgnoreCase("sim")) cont++;

	        System.out.print("Esteve no local do crime? ");
	        String resp2 = entrada.nextLine();
	        if (resp2.equalsIgnoreCase("sim")) cont++;

	        System.out.print("Mora perto da vítima? ");
	        String resp3 = entrada.nextLine();
	        if (resp3.equalsIgnoreCase("sim")) cont++;

	        System.out.print("Devia para a vítima? ");
	        String resp4 = entrada.nextLine();
	        if (resp4.equalsIgnoreCase("sim")) cont++;

	        System.out.print("Já trabalhou com a vítima? ");
	        String resp5 = entrada.nextLine();
	        if (resp5.equalsIgnoreCase("sim")) cont++;

	        if (cont == 2) {
	            System.out.print("Suspeita");
	        } else if (cont == 3 || cont == 4) {
	            System.out.print("Cúmplice");
	        } else if (cont == 5) {
	            System.out.print("Assassino");
	        } else {
	            System.out.print("Inocente");
	        }

	        
	    }
	}