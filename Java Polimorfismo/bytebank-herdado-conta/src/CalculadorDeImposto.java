
public class CalculadorDeImposto {
	
	private double totalImposto;
	// Recebe um tributavel 
	public void resgistra(Tributavel t) {
		// Usa o tributavel, e usar o getValorImposto que devolve o valor do imposto 
		// que é repassado para variavel double valor
		double valor = t.getValorImposto();
		// Somando o valor do total imposto mais o valor
		this.totalImposto += valor;
	}
	
	// Metodo que devolve o valor total do imposto
	public double getTotalImposto() {
		return totalImposto;
	}

}
