package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 10000;
		System.out.println(num1.toString().length());

		int num2 = 100123456;
		System.out.println(Integer.toString(num2).length());
		
		int num3 = 00123456;
		System.out.println(Integer.toString(num3).length());

		
		  System.out.println("" + num1.toString().length()); 
		 

	}

}
