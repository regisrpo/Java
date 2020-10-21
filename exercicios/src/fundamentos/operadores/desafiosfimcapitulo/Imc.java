package fundamentos.operadores.desafiosfimcapitulo;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IMC = Peso ÷ (Altura × Altura)

		Scanner entrada = new Scanner(System.in);

		System.out.println(" ===== Calcula IMC =====");

		System.out.println(" Digite seu nome: ");
		String nome = entrada.next().toUpperCase();

		System.out.println("Informe sua altura (metro e cm): ");
		String altura = entrada.next().replace(",", ".");

		System.out.println("Informe seu peso (kg): ");
		String peso = entrada.next().replace(".", ",");

		double alturaFinal = Double.parseDouble(altura);
		double pesoFinal = Double.parseDouble(peso);

		double imc = pesoFinal / (alturaFinal * alturaFinal);

		System.out.println(nome + " - " + altura + " - " + pesoFinal + " - IMC = " + imc);
		System.out.printf(" Valor IMC : %f - Condição : ", imc);

		if (imc < 19) {
			System.out.println("- Abaixo do Peso. ");

		} else if (imc <= 19 && imc < 25) {
			System.out.println(" - Peso Normal. ");
		} else if (imc <= 25 || imc < 30) {
			System.out.println(" - Sobrepeso. ");
		} else if (imc <= 30 && imc < 40) {
			System.out.println(" - Obesidade Tipo 1. ");
		} else if (imc >= 40) {
			System.out.println(" - Obesidade Morbida. ");
		}

		entrada.close();
	}

}
