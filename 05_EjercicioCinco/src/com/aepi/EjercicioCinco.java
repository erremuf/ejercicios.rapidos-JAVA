package com.aepi;

import java.util.Scanner;

public class EjercicioCinco {

	public static void main(String[] args) {

		// PEDIR DOS NUMEROS Y MOSTRARLOS ORDENADOS DE MENOR A MAYOR

		Scanner introduceNumero = new Scanner(System.in);
		int n1, n2;

		System.out.println(
				"\nINTRODUCE DOS NUMEROS Y LOS MUESTRO ORDENADOS DE MENOR A MAYOR \n\n\tIntroduce un numero: ");
		n1 = introduceNumero.nextInt();

		System.out.println("\n\tIntroduce otro número: ");
		n2 = introduceNumero.nextInt();

		if (n1 > n2) {

			System.out.println(n1 + " Es mayor que " + n2);

		} else {

			System.out.println(n2 + " Es mayor que " + n1);

		}

	}

}
