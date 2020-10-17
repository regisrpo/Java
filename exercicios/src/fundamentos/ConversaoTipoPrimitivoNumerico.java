package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		double a = 1; // Coversão implicita
		System.out.println(a);

		float b = (float) 1.151484515148484; // Conversão Explicíta (CAST)
		System.out.println(b);

		int c = 340;
		byte d = (byte) c; // CAST
		System.out.println(d);

		double e = 1.99999999;
		int f = (int) e; // (CAST)
		System.out.println(e + f);

	}

}
