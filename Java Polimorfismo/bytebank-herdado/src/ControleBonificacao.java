
public class ControleBonificacao {

	private double somaBonificacao;


	public void registra(Funcionario funcionario) {
		// Referencia generica que pode apontar para tipos e objetos diferentes
		double bonificacao = funcionario.getBonificacao();
		this.somaBonificacao = this.somaBonificacao + bonificacao;

	}
	// Não é necessario escrever cada metodo para classe especifica, basta um metodo genérico onde 
	// todos os tipos chamem seu get especifico
	
	/*public void registra(Gerente gerente) {

		double bonificacao = gerente.getBonificacao();
		this.somaBonificacao = this.somaBonificacao + bonificacao;

	}
	
	public void registra(EditorVideo editor) {

		double bonificacao = editor.getBonificacao();
		this.somaBonificacao = this.somaBonificacao + bonificacao;

	}*/

	public double getSomaBonificacao() {
		return somaBonificacao;
	}

}
