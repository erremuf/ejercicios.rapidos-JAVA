package com.aepi;

import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {

		// INTRODUCIR 2 NUMEROS Y DECIR CUAL ES MAYOR O SI SON IGUALES.

		Scanner introducirNumero = new Scanner(System.in);
		int n1, n2;

		System.out.println(
				"\n\nINTRODUCE DOS NUMEROS Y AVERIGUO CUAL ES MAYOR O SI SON IGUALES \n\n\tIntroduce el numero que estas pensando: ");
		n1 = introducirNumero.nextInt();

		System.out.println("\n\tIntroduce el siguiente numero: ");
		n2 = introducirNumero.nextInt();

		if (n1 == n2) {

			System.out.println(n1 + " Es igual a " + n2);

		} else if (n1 > n2) {

			System.out.println(n1 + " Es mayor que " + n2);

		} else {

			System.out.println(n2 + " Es mayor que " + n1);

		}

	}

}
