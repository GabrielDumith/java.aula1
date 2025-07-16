package Aula01;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("digite sua primeira nota:");
		double n1=entrada.nextDouble();
		
		System.out.print("digite sua segunda nota:");
		double n2=entrada.nextDouble();
		
		System.out.print((n1+n2)/2);
	}

}
