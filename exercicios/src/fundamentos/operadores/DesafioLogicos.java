package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		// TRABALHO NA TERÇA (V OU F), // TRABALHO NA QUINTA (V OU F),
		// SE OS DOIS TRABALHOS DEREM CERTO, VOCÊ IRÁ COM SUA FAMÍLIA PARA O SHOPPING E
		// COMPRARÁ UMA TV DE 50" E TOMAR SORVETE NO SHOPPING PARA COMEMORAR
		// SE APENAS 1 DOS TRABALHOS DEREM CERTO, VOCÊ VAI 32" E TOMAR SORVETE NO
		// SHOPPING PARA COMEMORAR
		// SE NENHUM TRABALHO DER CERTO, NÃO VÂO COMPRAR TV NENHUMA E NEM TOMARÃO
		// SORVETE, TÁ MAIS SAUDÁVEL POIS FICARÃO SEM SORVETES. 

		Scanner entrada = new Scanner(System.in); 

		boolean trabalhou3 = true;
		boolean trabalhou5 = true;
				

		if (trabalhou3 == true && trabalhou5 == true) {
			System.out.println("Trabalhou 2 dias: \nVamos ao Shopping comprar a TV de 50\" e tomar sorvete.");
		} else if (trabalhou3 == true || trabalhou5 == true) {
			System.out.println("Trabalhou 1 dia: \nVamos ao Shopping comprar a TV de 32\" e tomar sorvete.");
		} else {
			System.out.println(
					"Trabalhou 0 dias: \nVamos ficar em casa e não tomaremos sorvetes, logo ficaremos saudáveis");
		}

		entrada.close();
	}
}
