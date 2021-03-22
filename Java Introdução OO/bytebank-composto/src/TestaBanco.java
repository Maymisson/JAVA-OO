
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo Costa";
		paulo.cpf = "05151319388";
		paulo.profissao = "TI";
		
		Conta contaPaulo = new Conta();
		contaPaulo.depositar(100);
		
		// Associa o cliente paulo a contaPaulo
		contaPaulo.setTitular(paulo);
		System.out.println(contaPaulo.getTitular().nome);
		
		System.out.println(contaPaulo.getTitular());
		System.out.println(paulo);
	}

}
