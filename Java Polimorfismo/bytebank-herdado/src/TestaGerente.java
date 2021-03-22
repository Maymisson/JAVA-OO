
public class TestaGerente {

	public static void main(String[] args) {
		
		// Agora podemos colocar as interfaces que ele implementa
		Autenticavel referencia = new Cliente();
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Marco");
		gerente.setCpf("051.513.19-88");
		gerente.setSalario(5000.0);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(2222);
		
		boolean autentica = gerente.autentica(2222);
		System.out.println(autentica);
		
		System.out.println(gerente.getBonificacao());

	}

}
