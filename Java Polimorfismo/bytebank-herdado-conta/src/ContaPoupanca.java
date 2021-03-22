
public class ContaPoupanca extends Conta {
	// Criando construtor especifico não herdado
	public ContaPoupanca (int agencia, int numero) {
		// Passada de parametros para chamada do construtor especifico da classe mãe
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}

}
