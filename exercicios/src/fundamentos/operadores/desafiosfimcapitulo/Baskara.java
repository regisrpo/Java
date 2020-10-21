package fundamentos.operadores.desafiosfimcapitulo;

import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
		 * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
		 * Encontre o delta
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o A .");
		double a = entrada.nextDouble();
		System.out.println("Digite o B .");
		double b = entrada.nextDouble();
		System.out.println("Digite o C .");
		double c = entrada.nextDouble();
		
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println(delta);

		entrada.close();
	}

}
