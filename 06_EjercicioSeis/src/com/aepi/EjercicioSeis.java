package com.aepi;

import java.util.Scanner;

public class EjercicioSeis {

	public static void main(String[] args) {

		// INTRODUCIR DOS NÚMEROS Y DICER SI UNO ES MÚLTIPLO DE OTRO

		Scanner introduceNumero = new Scanner(System.in);
		int n1, n2;

		System.out.println(
				"\nINTRODUCIR DOS NÚMEROS Y DICER SI UNO ES MÚLTIPLO DE OTRO \n\n\tIntroduce el primer número: ");
		n1 = introduceNumero.nextInt();

		System.out.println("\n\tIntroduce el segundo número: ");
		n2 = introduceNumero.nextInt();

		if (n1 > n2) {

			if (n1 % n2 == 0) {

				System.out.println("Los número son múltiplos");

			} else {

				System.out.println("Los números no son múltiplos");

			}

		} else {

			System.out.println("\n\n¡¡El primer numero debe ser mayor!!");

		}

	}

}
