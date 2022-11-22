package com.aepi;

import java.util.Scanner;

public class EjercicioCuatro {

	public static void main(String[] args) {

		// PEDIR UN NUMERO E INDICAR SI ES POSITIVO O NEGATIVO

		Scanner introduceNumero = new Scanner(System.in);
		int n1;

		System.out.println("\nPEDIR UN NUMERO E INDICAR SI ES POSITIVO O NEGATIVO \n\n\tIntroduce un número:");
		n1 = introduceNumero.nextInt();

		System.out.println((n1 < 0) ? "El número es negativo" : "El número es positivo");

	}

}
