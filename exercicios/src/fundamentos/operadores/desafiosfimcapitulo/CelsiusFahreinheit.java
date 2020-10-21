package fundamentos.operadores.desafiosfimcapitulo;

import java.util.Scanner;

/* Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.*/

public class CelsiusFahreinheit {
	public static void main(String[] args) {
		// (°C × 9/5) + 32 = °F

		// (°F − 32) × 5/9 = °C

		Scanner entrada = new Scanner(System.in);
		System.out.println(" ===== Celsius para fahreinheit ===== \n\n");

		double c = entrada.nextDouble();
		double resultado = (c * 9 / 5) + 32;

		System.out.println(" =====   fahreinheit para Celsius===== \n\n");
		double f = entrada.nextDouble();

		double resultadof = (f - 32) * 5 / 9;

		System.out.println("Fare : " + resultado);
		System.out.println("Celsius : " + resultadof);

		entrada.close();
	}
}
