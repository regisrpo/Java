package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);

		System.out.println("\nTABELA VERDADE E (AND");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(true && true); O java só analisa a primeira condição.
		// System.out.println(true && true);

		System.out.println("\nTABELA VERDADE OU (OR");
		// System.out.println(true || true);
		// System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("\nTABELA VERDADE OU EXCLUSIVO (XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(true ^ false);

		System.out.println("\nTABELA VERDADE NOT");
		System.out.println(!true);
		System.out.println(!false);
	}

}
