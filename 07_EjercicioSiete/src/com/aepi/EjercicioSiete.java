package com.aepi;

import java.util.Scanner;

public class EjercicioSiete {

	public static void main(String[] args) {
		
		// INTRODUCE TRES NÚMEROS Y LOS MUESTRO ORDENADOS DE MAYOR A MENOR
		
		Scanner introduceNumero = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("\nINTRODUCE TRES NÚMEROS Y LOS MUESTRO ORDENADOS DE MAYOR A MENOR \n\n\t Introduce el primer número: ");
		n1 = introduceNumero.nextInt();
		
		System.out.println("\n\tIntroduce el segundo número: ");
		n2 = introduceNumero.nextInt();
		
		System.out.println("Introduce el tercer número: ");
		n3 = introduceNumero.nextInt();
		
		if(n1 < n2 && n2 < n3) {
			
			System.out.println(n3 + ", " + n2 + ", " + n1);
			
		}else if(n1 < n3 && n3 < n2) {
			
			System.out.println(n2 + ", " + n3 + ", " + n1);
			
		}else if(n2 < n1 && n1 < n3) {
			
			System.out.println(n3 + ", " + n1 + ", " + n2);
			
		}else if(n2 < n3 && n3 < n1) {
			
			System.out.println(n1 + ", " + n3 + ", " + n2);
			
		}else if(n3 < n1 && n1 < n2) {
			
			System.out.println(n2 + ", " + n1 + ", " + n3);
			
		}else if(n3 < n2 && n2 < n1) {
			
			System.out.println(n1 + ", " + n2 + ", " + n3);
		
		}else {
			
			System.out.println("\nSi metes dos numeros iguales no puedo ordenarlos");
			
		}
		

	}

}
