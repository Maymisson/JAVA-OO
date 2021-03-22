
public class TesteReferencias {
	
	public static void main(String[] args) {
		// Referencia do objeto tipo conta
		Conta primeiraConta = new Conta();
		primeiraConta.setSaldo(300);
		
		System.out.println("Saldo da primeira conta : " + primeiraConta.getSaldo());
		
		// referenciando para o mesmo objeto
		Conta segundaConta = primeiraConta; 
		
		System.out.println("Saldo da segunda conta : " + segundaConta.getSaldo());
		
		segundaConta.setSaldo(segundaConta.getSaldo() + 100);
		System.out.println("Saldo da segunda conta atual : " + segundaConta.getSaldo());
		
		System.out.println("Saldo da primeira conta atual : " + primeiraConta.getSaldo());
		
		// comparando referencias 
		if (primeiraConta == segundaConta) {
			System.out.println("SIM");
		} else {
			System.out.println("NÃO");
		}
	}

}
