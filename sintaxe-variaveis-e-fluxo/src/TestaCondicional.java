
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18, mas pode entra,"
						+ " pois está acompanhado");
			} else {
				System.out.println("Infelismente você não pode entrar");
			}
		}
	}
}
