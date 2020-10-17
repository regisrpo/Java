package fundamentos;

public class Temperatura {
	// ( F - 32 ) * 5/9 = C
	public static void main(String[] args) {

		double fare = 10;
		final double f32 = 32;
		final double f59 = (5 / 9.0);
		double cel = (fare - f32) * f59;

		System.out.println("Temperatura em celsius: " + cel + "º");
		System.out.println("Temperatura em Farenheit : " + fare + "º");

	}
}
