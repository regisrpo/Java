package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		System.out.printf("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.printf("Digite o Sobrenome : ");
		String sobrenome = entrada.nextLine();
		System.out.printf("Digite sua idade : ");
		int idade = entrada.nextInt();
		System.out.printf("Nome : %s %s " + "%nQuantidade letras 'Nome + Sobrenome' : %d %nIdade : %d",
				nome.toUpperCase(), sobrenome.toUpperCase(), nome.length() + sobrenome.length(), idade);
		// System.out.printf(" %s ", sobrenome.toUpperCase());

		entrada.close();
	}
}