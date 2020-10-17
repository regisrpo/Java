package fundamentos;

public class TipoString {
	public static void main(String[] args) {

		String s = "Boa Tarde";
		System.out.println("O sétimo caracter é ? " + s.charAt(6));
		System.out.println(s.concat("!!!")); // Concatena na String
		System.out.println(s + "!!!"); // Concatena na String
		System.out.println("A String inicia com Boa ? " + s.startsWith("Boa")); // Verifica se a String inicia com
																				// "Boa".

		System.out.println("A String inicia com Boa? " + s.toLowerCase().startsWith("Boa")); // Transformou a String em
																								// minúscula e vereficou
																								// se começa com "Boa".

		System.out.println("A String termina com TARDE? " + s.toUpperCase().endsWith("TARDE")); // Converteu a String em
																								// Maiúsculo e
																								// vereficou se
																								// terminara em "TARDE".

		System.out.println("Quantidade de caracteres: " + s.length()); // Conta quantidade de caracteres da String.

		System.out.println("A String é igual a boa tarde? " + s.toLowerCase().equals("boa tarde")); // toLowerCase
																									// transforma a
																									// frase em
																									// minuscúla e o
																									// equals faz a
																									// comparação.

		System.out.println("Sem considerar o CaseSensitive, a String é igual? " + s.equalsIgnoreCase("BOA TARDE")); // equalsIgnoreCase
																													// Faz
																													// comparações
																													// ignorando
																													// o
																													// Case
																													// Sensitive.
		var nome = "Regis";
		var sobrenome = "Pontes";
		var idade = 35;
		var salario = 25000.889;
		
		System.out.printf("Nome : %s %s. \nIdade :  %d. \nSalário: %.2f", nome, sobrenome, idade, salario); // Atenção aqui, === Printf ===.
		
		System.out.println("\n\n\nNome : " + nome +" "+ sobrenome 
				+ "\nIdade : "+ idade
				+ "\nSalário : " + salario);
		
		String maisUmaFrase = ("\n\n\nNome : " + nome +" "+ sobrenome 
				+ "\nIdade : "+ idade
				+ "\nSalário : " + salario);
		
		System.out.println(maisUmaFrase);


	}
}
