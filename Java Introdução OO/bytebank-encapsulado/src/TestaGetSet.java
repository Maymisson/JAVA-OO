
public class TestaGetSet {
	
	public static void main(String[] args) {
		
		Conta contex = new Conta(2223, 456879);
		
		/*contex.setNumero(1337);*/
		System.out.println(contex.getNumero());
		
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		
		contex.setTitular(paulo);
		System.out.println("Nome do titular : " + contex.getTitular().getNome());
		
		// em 1 linha 
		contex.getTitular().setProfissao("TI");
		// agora em 2 linhas 
		Cliente titularDaConta = contex.getTitular();
		titularDaConta.setProfissao("TI");
		
		System.out.println(paulo);
		System.out.println(titularDaConta);
		System.out.println(contex.getTitular());
	}

}
