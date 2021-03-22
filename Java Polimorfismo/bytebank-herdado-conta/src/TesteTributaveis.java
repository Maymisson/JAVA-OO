
public class TesteTributaveis {

	public static void main(String[] args) {
		//Criando os objetos de cada tipo 
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.depositar(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.resgistra(cc);
		calc.resgistra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
