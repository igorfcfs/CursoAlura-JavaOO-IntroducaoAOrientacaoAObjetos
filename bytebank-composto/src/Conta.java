
public class Conta {
	double saldo = 100;
	int agencia/* = 42 */;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tranfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor); // destino.saldo += valor
			return true;
		}/* else {
			return false;
		}*/
		return false;
	}
}
