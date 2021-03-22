
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	// Metodo construtor
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	// Metodos obrigatorios ao implementar interfaces
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	// Metodo de bonificação de salario padrão
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação do GERENTE");
		// Informando que o atributo pertence a super classe Funcionario
		return super.getSalario();
	}

	// Metodo de autentica senha apenas do gerente
	/*
	 * public boolean autentica (int senha) { if (this.senha == senha) { return
	 * true; }else { return false; } }
	 */

	/*
	 * public void setSenha(int senha) { this.senha = senha; }
	 */

}
