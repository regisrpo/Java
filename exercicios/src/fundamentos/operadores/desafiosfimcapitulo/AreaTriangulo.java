package fundamentos.operadores.desafiosfimcapitulo;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Criar um programa que leia o valor da base e da altura de um triângulo e
		 * calcule a área.
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.");
		System.out.println("Digite a base do triângulo: ");
		double base = entrada.nextDouble();

		System.out.println("Digite a altura do triângulo: ");
		double altura = entrada.nextDouble();

		double area = base * altura;

		System.out.println(" A área do triãngulo é : " + area + " mts²");

		entrada.close();
	}

}
