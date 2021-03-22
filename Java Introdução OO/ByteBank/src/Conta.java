
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero; 
	private String titular;
	
	
	// --- Metodos comportamentais ---
	public void depositar (double valor ) {
		this.saldo += valor;
	}
	
	public boolean sacar (double valor ) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque de : " + valor + " realizado com sucesso!");
			return true;
		}
			System.out.println("Saldo insuficiente para saque");
			return false;
	}
	
	public boolean transferir (double valor, Conta destino ) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			System.out.println("Transferência de : " + valor + " para conta : " + destino + " realizada com sucesso!");
			return true;
		}
			System.out.println("Saldo insuficiente para transferência");
			return false;
	}
	
	
	// --- Metodos Getters e Setters ---
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

}

