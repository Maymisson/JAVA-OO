
public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero; 
	// Atributo referente para objetos de outras classes
	private Cliente titular;
	private static int total = 0;
	
	/*Construtor padrão 
	public Conta() {
		
	}*/
	
	
	// Construtor personalizado 
	public Conta (int agencia, int numero) {
		// Atributo da classe 
		Conta.total++;
		//System.out.println("Total de contas : " + Conta.total);
		System.out.println();
		this.agencia = agencia;
		this.numero = numero;
		
		/*System.out.println("----- NEW CONTA -----");
		System.out.println("Agência : " + agencia);
		System.out.println("Numero  : " + numero);
		System.out.println("---------------------");*/
	}
	
	
	// --- Metodos comportamentais ---
	public abstract void depositar (double valor );

	
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
		if (this.sacar(valor)) {
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
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) { 
			System.out.println("Numero de agência inválido");
			return;
		}
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero <= 0) { 
			System.out.println("Numero de conta inválido");
			return;
		}
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}

