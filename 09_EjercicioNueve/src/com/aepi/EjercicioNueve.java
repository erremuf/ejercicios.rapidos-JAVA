package com.aepi;

import java.util.Scanner;

public class EjercicioNueve {

	public static void main(String[] args) {

		// PEDIR EL RADIO DE UN CÍRCULO Y CALCULAR SU ÁREA (A=PI*r^2)

		Scanner introduceRadio = new Scanner(System.in);
		double radio, area;

		System.out.println(
				"\nPEDIR EL RADIO DE UN CÍRCULO Y CALCULAR SU ÁREA \n\nPor favor, introduce el radio de un cículo cualquiera: ");
		radio = introduceRadio.nextDouble();

		area = 3.1416 * (radio * radio);

		System.out.println("El área de tu círculo es: " + area);

	}

}
