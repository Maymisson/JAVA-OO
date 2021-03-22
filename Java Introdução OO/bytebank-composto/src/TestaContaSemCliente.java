
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaMarcela = new Conta();
		
		System.out.println(contaMarcela.getSaldo());
		
		Cliente marcela = new Cliente();
		contaMarcela.setTitular(marcela);
		System.out.println(contaMarcela.getTitular());
		
		contaMarcela.getTitular().nome = "Marcela";
		System.out.println(contaMarcela.getTitular().nome);
		
		
	}

}
