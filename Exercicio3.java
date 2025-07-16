package Aula01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o numero 1 A 7: ");
		int dia=entrada.nextInt();
		
		if(dia==1) {
			System.out.print("DOMINGO");
		}
		else if(dia==2){
			System.out.print("SEGUNDA");
		}
		else if(dia==3){
			System.out.print("TERÇA");
		}
		else if(dia==4){
			System.out.print("QUARTA");
		}
		else if(dia==5){
			System.out.print("QUINTA");
		}
		else if(dia==6){
			System.out.print("SEXTA");
		}
		else if(dia==7){
			System.out.print("SABADO");
		}
		else {
			System.out.print("valor invalido");
		}
		
		
	}

}
