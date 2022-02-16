
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario; // casting
		System.out.println(valor);
		
		float pontoFlutuante = (float) 3.14;
		float pontoFlutuante2 = 3.14f;
		
		long numeroGrande = 1234352143123412432l;
		long numeroGrande2 = (long) 12343521;
		short valorPequeno = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
