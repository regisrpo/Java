package fundamentos.operadores.desafiosfimcapitulo;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Criar um programa que leia o valor da base e da altura de um tri�ngulo e
		 * calcule a �rea.
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.");
		System.out.println("Digite a base do tri�ngulo: ");
		double base = entrada.nextDouble();

		System.out.println("Digite a altura do tri�ngulo: ");
		double altura = entrada.nextDouble();

		double area = base * altura;

		System.out.println(" A �rea do tri�ngulo � : " + area + " mts�");

		entrada.close();
	}

}
