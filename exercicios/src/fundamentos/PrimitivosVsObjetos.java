package fundamentos;

public class PrimitivosVsObjetos {
	public static void main(String[] args) {
		String s = new String("TEXTO");
		s = s.toLowerCase();
		System.out.println(s);

		// wrappers s�o a vers�o objeto dos tipos primitivos
		// Em JAVA, tudo � Ojeto, menos os PRIMITIVOS.
		int a = 123;
		System.out.println(a);

	}
}
