package fundamentos.operadores.desafiosfimcapitulo;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um programa que leia um valor e apresente os resultados ao quadrado e
		 * ao cubo do valor.
		 */
		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. ");

		System.out.println("Digite o número:");
		double a = entrada.nextDouble();
		double quadrado = Math.pow(a, 2);
		double cubo = Math.pow(a, 3);

		System.out.println("Número digitado :  " + a + " ao Quadrado :  " + quadrado);
		System.out.println("Número digitado :  " + a + " ao Cubo :  " + cubo);
		

		entrada.close();

	}

}
