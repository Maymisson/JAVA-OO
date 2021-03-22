
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta novaConta = new Conta();
		novaConta.setTitular("Teste");
		novaConta.setNumero(15462378);
		novaConta.setAgencia(3134);
		novaConta.setSaldo(2020.10);
		
		System.out.println("----- CONTA ------");
		System.out.println("Titular da conta : " + novaConta.getTitular());
		System.out.println("Numero da conta : " + novaConta.getNumero());
		System.out.println("Agencia da conta : " + novaConta.getAgencia());
		System.out.println("Saldo da conta : " + novaConta.getSaldo());
		System.out.println("------------------");
	}
	
}
