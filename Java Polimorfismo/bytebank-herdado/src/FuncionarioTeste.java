
public class FuncionarioTeste {
	
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 = Funcionario comum ; 1 = Funcinario gerente ; 2 = Diretor
	
	
	// Metodo construtor
	public FuncionarioTeste() {
		
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	// Metodo de bonificação de salario padrão 
	public double getBonificacao() {
		
		if (this.tipo == 0) {// - Funcionario comum
			return this.salario * 0.1;
		} else if(this.tipo == 1) {// - Funcionario gerente
			return this.salario;
		} else 
		return this.salario + 1000.0;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
