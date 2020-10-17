package fundamentos;

public class TipoString {
	public static void main(String[] args) {

		String s = "Boa Tarde";
		System.out.println("O s�timo caracter � ? " + s.charAt(6));
		System.out.println(s.concat("!!!")); // Concatena na String
		System.out.println(s + "!!!"); // Concatena na String
		System.out.println("A String inicia com Boa ? " + s.startsWith("Boa")); // Verifica se a String inicia com
																				// "Boa".

		System.out.println("A String inicia com Boa? " + s.toLowerCase().startsWith("Boa")); // Transformou a String em
																								// min�scula e vereficou
																								// se come�a com "Boa".

		System.out.println("A String termina com TARDE? " + s.toUpperCase().endsWith("TARDE")); // Converteu a String em
																								// Mai�sculo e
																								// vereficou se
																								// terminara em "TARDE".

		System.out.println("Quantidade de caracteres: " + s.length()); // Conta quantidade de caracteres da String.

		System.out.println("A String � igual a boa tarde? " + s.toLowerCase().equals("boa tarde")); // toLowerCase
																									// transforma a
																									// frase em
																									// minusc�la e o
																									// equals faz a
																									// compara��o.

		System.out.println("Sem considerar o CaseSensitive, a String � igual? " + s.equalsIgnoreCase("BOA TARDE")); // equalsIgnoreCase
																													// Faz
																													// compara��es
																													// ignorando
																													// o
																													// Case
																													// Sensitive.
		var nome = "Regis";
		var sobrenome = "Pontes";
		var idade = 35;
		var salario = 25000.889;
		
		System.out.printf("Nome : %s %s. \nIdade :  %d. \nSal�rio: %.2f", nome, sobrenome, idade, salario); // Aten��o aqui, === Printf ===.
		
		System.out.println("\n\n\nNome : " + nome +" "+ sobrenome 
				+ "\nIdade : "+ idade
				+ "\nSal�rio : " + salario);
		
		String maisUmaFrase = ("\n\n\nNome : " + nome +" "+ sobrenome 
				+ "\nIdade : "+ idade
				+ "\nSal�rio : " + salario);
		
		System.out.println(maisUmaFrase);


	}
}
