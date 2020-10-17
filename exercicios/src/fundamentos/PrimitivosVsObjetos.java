package fundamentos;

public class PrimitivosVsObjetos {
	public static void main(String[] args) {
		String s = new String("TEXTO");
		s = s.toLowerCase();
		System.out.println(s);

		// wrappers são a versão objeto dos tipos primitivos
		// Em JAVA, tudo é Ojeto, menos os PRIMITIVOS.
		int a = 123;
		System.out.println(a);

	}
}
