
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	// Sobrescrita do metodo sacar da classe Conta;
	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor + 0.2;
		return super.sacar(valorASacar);
	}
	
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
	// Metodo implementado e calculo de 1% do imposto
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
