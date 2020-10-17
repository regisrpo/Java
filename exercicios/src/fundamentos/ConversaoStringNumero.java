package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro Número: ");

		String valor2 = JOptionPane.showInputDialog("Digite o segundo Valor: ");
		System.out.println(valor1 + valor2);

		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);

		double soma = numero1 + numero2;
		System.out.println("Numero 1: " + numero1 + "  - Numero 2 : " + numero2);
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 2);
	}

}
