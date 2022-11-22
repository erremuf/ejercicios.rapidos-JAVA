package com.aepi;

import java.util.Scanner;

public class EjercicioOcho {

	public static void main(String[] args) {

		// PEDIR UN NUMERO ENTRE 0 Y 9.999 Y DECIR CUANTAS CIFRAS TIENE

		Scanner introduceNumero = new Scanner(System.in);
		int num;

		System.out.println(
				"\nPEDIR UN NUMERO ENTRE 0 Y 9.999 Y DECIR CUANTAS CIFRAS TIENE \n\nPor favor, introduce un número entre 0 y 9.999: ");
		num = introduceNumero.nextInt();

		if (num < 10) {

			System.out.println(num + " Tiene una cifras");

		} else if (num >= 10 && num < 100) {

			System.out.println(num + " Tiene dos cifras");

		} else if (num >= 100 && num < 1000) {

			System.out.println(num + " Tiene tres cifras");

		} else if (num >= 1000 && num < 10000) {

			System.out.println(num + " Tiene cuatro cifras");

		} else {

			System.out.println("El número introducido no es válido");

		}

	}

}
