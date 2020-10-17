package fundamentos.operadores;

public class atribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = a;
		int c = a + b;

		c += b; // c = c + b;
		c -= b; // c = c - b;
		c *= b; // c = c * b;
		c /= b; // c = c / b;

		System.out.println(c);

		c %= b; // c = c % b;

		System.out.println(c);
	}

}
