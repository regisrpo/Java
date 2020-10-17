package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = " jesus é o caminho x";
		System.out.println(s);
		s = s.replace("x", "verdade e a vida");
		System.out.println(s);
		s = s.toUpperCase();
		System.out.println(s);
		s = s.concat("!!!!");
		System.out.println(s);
		s = s.toLowerCase();
		System.out.println(s);

		// Tipos Primitivos não tem operador

		int a = 3;
		System.out.println(a);

	}
}
