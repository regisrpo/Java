package fundamentos.operadores;

public class unarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;

		a++; // a = a + 1;
		a--; // a = a - 1;

		++b; // b = b + 1;
		--b; // b = b - 1;

		System.out.println(a);
		System.out.println(b);

		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // Biz� O a recebeu antes da compara��o o incremento por isso o resultado �
										// true. 
		System.out.println(a++ == --b); // Biz� O b recebeu antes da compara��o o incremento por isso o resultado �
										// false.
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);

	}

}
