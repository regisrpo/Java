package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		// TRABALHO NA TER�A (V OU F), // TRABALHO NA QUINTA (V OU F),
		// SE OS DOIS TRABALHOS DEREM CERTO, VOC� IR� COM SUA FAM�LIA PARA O SHOPPING E
		// COMPRAR� UMA TV DE 50" E TOMAR SORVETE NO SHOPPING PARA COMEMORAR
		// SE APENAS 1 DOS TRABALHOS DEREM CERTO, VOC� VAI 32" E TOMAR SORVETE NO
		// SHOPPING PARA COMEMORAR
		// SE NENHUM TRABALHO DER CERTO, N�O V�O COMPRAR TV NENHUMA E NEM TOMAR�O
		// SORVETE, T� MAIS SAUD�VEL POIS FICAR�O SEM SORVETES. 

		Scanner entrada = new Scanner(System.in); 

		boolean trabalhou3 = true;
		boolean trabalhou5 = true;
				

		if (trabalhou3 == true && trabalhou5 == true) {
			System.out.println("Trabalhou 2 dias: \nVamos ao Shopping comprar a TV de 50\" e tomar sorvete.");
		} else if (trabalhou3 == true || trabalhou5 == true) {
			System.out.println("Trabalhou 1 dia: \nVamos ao Shopping comprar a TV de 32\" e tomar sorvete.");
		} else {
			System.out.println(
					"Trabalhou 0 dias: \nVamos ficar em casa e n�o tomaremos sorvetes, logo ficaremos saud�veis");
		}

		entrada.close();
	}
}
