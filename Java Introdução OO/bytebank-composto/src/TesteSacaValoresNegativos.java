
public class TesteSacaValoresNegativos {
	
	public static void main(String[] args) {
		
		Conta generica = new Conta();
		
		generica.depositar(100);
		System.out.println("Seu saldo : " + generica.getSaldo());
		generica.sacar(11);
		
		System.out.println("Seu saldo atual é : " + generica.getSaldo());
		
	}

}
