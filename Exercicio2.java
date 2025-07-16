package Aula01;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	
	System.out.print("digite o numero 1:");
	int numb1=entrada.nextInt();
	
	System.out.print("Digite um numero2:");
	int numb2=entrada.nextInt();
	
	System.out.print("Digite um numero3:");
	int numb3=entrada.nextInt();
	
	if (numb1>numb2 && numb1>numb3) {
		System.out.println(numb1);
	}
	else if(numb2>numb1 && numb2>numb3){
		System.out.println(numb2);
		
	}
	else{
		System.out.println(numb3);
	}
	
	}
	
	
}
