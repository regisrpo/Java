package fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); // Cast, o resultado do math � um double, para n�o gerar problema, use-se o
										// CAST(int)
										// antes. Primeiro o n�mero Segundo o �ndice.

		double c = Math.pow(a, 3); // Primeiro o n�mero Segundo o �ndice.

		System.out.println(b);
		System.out.println(c);

		double superiorA = Math.pow(6 * (3 + 2), 2);
		double inferiorA = 3 * 2;

		double superiorB = Math.pow((1 - 5) * (2 - 7), 2);
		double inferiorB = 2;
		
		 double superiorC = Math.pow(((superiorA /inferiorA) - (superiorB / inferiorB)) , 3);
		 double inferiorC = Math.pow(10,3);
		 
         double Final = superiorC / inferiorC;
         
         System.out.println("O resultado final � : " + Final * (-1));
         
	}
}