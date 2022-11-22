package com.aepi;

import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {

		// PEDIR DOS NÚMEROS Y DECIR CÚAL ES MAYOR

		Scanner introducirNumero = new Scanner(System.in);

		int n1, n2;

		System.out.println("\n\nINTRODUCE DOS NÚMEROS Y TE DIRÉ CUÁL ES MAYOR \n\nPor favor, introduce el número: ");
		n1 = introducirNumero.nextInt();

		System.out.println("\nPerfecto, introduce el siguiente número: ");
		n2 = introducirNumero.nextInt();

		if (n1 > n2) {

			System.out.println(n1 + " Es mayor que " + n2);

		} else if (n1 == n2) {

			System.out.println("No me pillas, los números son iguales");

		} else {

			System.out.println(n2 + " Es mayor que " + n1);

		}

	}

}
