package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println(" ====== Desafio Convers�o =======\n" + "Receba 3 sal�rios em String e exiba a m�dia.");

		System.out.println("Digite o  Sal�rio 1 - R$ ");
		String salario1 = entrada.nextLine().replace(",", "."); // O segredo � o replace, que subtitui a virgula por
																// ponto se for ponto, n�o � necess�rio mudar.

		System.out.println("Digite o Sal�rio 2 - R$ ");
		String salario2 = entrada.nextLine().replace(",", ".");

		System.out.println("Digite o Sal�rio 3 - R$ ");
		String salario3 = entrada.nextLine().replace(",", ".");

		System.out.println(salario1 + " " + salario2 + " " + salario3);
		entrada.close();

		double salario1d = Double.parseDouble(salario1);

		double salario2d = Double.parseDouble(salario2);

		double salario3d = Double.parseDouble(salario3);

		double soma = (salario1d + salario2d + salario3d);
		double media = ((salario1d + salario2d + salario3d) / 3);

		System.out.println("Soma : R$  " + soma);
		System.out.println("M�dia : R$ " + media);
		/*
		 * package fundamentos;
		 * 
		 * import java.util.Scanner;
		 * 
		 * public class Console { public static void main(String[] args) {
		 * 
		 * Scanner entrada = new Scanner(System.in);
		 * 
		 * System.out.printf("Digite seu nome: "); String nome = entrada.nextLine();
		 * System.out.printf("Digite o Sobrenome : "); String sobrenome =
		 * entrada.nextLine(); System.out.printf("Digite sua idade : "); int idade =
		 * entrada.nextInt(); System.out.printf("Nome : %s %s " +
		 * "%nQuantidade letras 'Nome + Sobrenome' : %d %nIdade : %d",
		 * nome.toUpperCase(), sobrenome.toUpperCase(), nome.length() +
		 * sobrenome.length(), idade); // System.out.printf(" %s ",
		 * sobrenome.toUpperCase());
		 * 
		 * entrada.close(); } }
		 */
	}

}
