package fundamentos.operadores;

public class operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 97; // Pr�tica n�o recomendada, deve-se usar a tabela unicode padr�o.
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a != b);
		
		double nota = 7;
				
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.0;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem Desconto : " + temDesconto);
		
		
	}

}
