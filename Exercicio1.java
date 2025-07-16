package Aula01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	 Scanner Valor = new Scanner(System.in);
	 System.out.print("digite seu numero: ");
	 int resp= Valor.nextInt();
	 if(resp>0) {
		 System.out.println("seu numero é positivo.");
	 }
	 
	 else if(resp==0){
		 System.out.println("numero é:0");
		 
	 }
	 
	 else {
		 System.out.println("numero negativo.");
	 }

	}

}
