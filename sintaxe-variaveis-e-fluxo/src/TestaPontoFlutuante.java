
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		/*double salario;
		salario = 1250.70; -> funciona mas tem uma forma muito melhor e mais prática de fazer isso
		*/
		double salario = 1250.70;
		System.out.println("Meu salario é " + salario);
		// System.out.println(idade); -> Erro, pois idade ainda não foi declarada nesta parte do código
		
		double idade = 14;
		
		System.out.println(idade); // aqui a variavel idade irá funcionar pois ela já foi declarada acima
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		double novaTentativa = 5 / 2; // o Java considera uma divisão de 2 inteiros um número inteiro
		System.out.println(novaTentativa);
		
		double novaTentativa2 = 5.0 / 2; // basta 1 número ser de ponto flutuante para retornar um número de ponto flutuante
		System.out.println(novaTentativa2);
	}
}
