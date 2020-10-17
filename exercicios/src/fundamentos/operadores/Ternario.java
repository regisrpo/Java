package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media = 4.0;
		String resultadoFinal = media >= 7.0 ? "aprovado" : " em " + "recuperação.";
		System.out.println("O Aluno está : " + resultadoFinal);

		double dinheiro = 4.000;
		String investimento = dinheiro >= 4.000 ? " Sim, abriremos a loja" : "Trabalharemos mais e abriremos a loja";
		System.out.println("Resultado" + investimento);
		
		
	}

}
