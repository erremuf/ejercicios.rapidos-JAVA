package com.aepi;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {

		// PEDIR DOS NÚMEROS Y DECIR SI SON IGUALES O NO

		Scanner introducirNumero = new Scanner(System.in);
		int numero1;
		int numero2;

		System.out.println("Escribe un numero: ");
		numero1 = introducirNumero.nextInt();

		System.out.println("Escribe otro numero: ");
		numero2 = introducirNumero.nextInt();

		if (numero1 == numero2) {

			System.out.println("Los números son iguales");

		} else {

			System.out.println("Los numeros son distintos");
		}

	}

}
