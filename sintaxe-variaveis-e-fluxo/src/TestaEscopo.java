
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		// boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		// System.out.println(acompanhado); -> erro, pois a variável ainda não foi inicializada
		
		if (quantidadePessoas >= 2) {
			// ainda nao existe
			// aqui tb nao
			// boolean acompanhado = true;
			// existe
			acompanhado = true;
		} else {
			// existe acompanhado?
			// boolean acompanhado = false;
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado/* == true*/) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("Infelismente você não pode entrar");
		}
	}
}
