
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaJoao = new Conta();
		
		contaJoao.setSaldo(100);
		System.out.println("Saldo do João : " + contaJoao.getSaldo());
		contaJoao.depositar(50);
		System.out.println("Saldo do João : " + contaJoao.getSaldo());

		
		contaJoao.sacar(100);
		System.out.println("Saldo do João : " + contaJoao.getSaldo());

		
		Conta contaMaria = new Conta();
		contaMaria.depositar(1000);
		System.out.println("Saldo da Maria : " + contaMaria.getSaldo());
		contaMaria.transferir(300, contaJoao);
		System.out.println("Saldo da Maria : " + contaMaria.getSaldo());
		System.out.println("Saldo do João : " + contaJoao.getSaldo());
		
		System.out.println("------------------------");
		contaJoao.setTitular("João Silveira");
		System.out.println(contaJoao.getTitular());

		
	}

}
