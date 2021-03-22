
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta (3134, 154623);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(11111);
		
		Conta conta1 = new Conta (3234, 154588);
		Conta conta2 = new Conta (5034, 152345);
		
		System.out.println(Conta.getTotal());
	}

}
