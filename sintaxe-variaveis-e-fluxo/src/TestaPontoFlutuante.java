
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		/*double salario;
		salario = 1250.70; -> funciona mas tem uma forma muito melhor e mais pr�tica de fazer isso
		*/
		double salario = 1250.70;
		System.out.println("Meu salario � " + salario);
		// System.out.println(idade); -> Erro, pois idade ainda n�o foi declarada nesta parte do c�digo
		
		double idade = 14;
		
		System.out.println(idade); // aqui a variavel idade ir� funcionar pois ela j� foi declarada acima
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		double novaTentativa = 5 / 2; // o Java considera uma divis�o de 2 inteiros um n�mero inteiro
		System.out.println(novaTentativa);
		
		double novaTentativa2 = 5.0 / 2; // basta 1 n�mero ser de ponto flutuante para retornar um n�mero de ponto flutuante
		System.out.println(novaTentativa2);
	}
}
