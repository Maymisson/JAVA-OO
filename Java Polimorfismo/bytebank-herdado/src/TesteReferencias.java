
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setSalario(5000.0);
		
		// Funcionario agora com classe abstrata, não podendo ser criado objeto do tipo
		/*Funcionario f1 = new Funcionario();
		f1.setNome("Fernando");
		f1.setSalario(2000.0);*/
		
		EditorVideo e1 = new EditorVideo();
		e1.setNome("Junior");
		e1.setSalario(2500.0);
		
		Designer d1 = new Designer();
		d1.setNome("Junior");
		d1.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		System.out.println("Bonificação GERENTE : " + g1.getBonificacao());
		/*controle.registra(f1);
		System.out.println("Bonificação FUNCIONARIO : " + f1.getBonificacao());*/
		controle.registra(e1);
		System.out.println("Bonificação EDITOR VIDEO : " + e1.getBonificacao());
		controle.registra(d1);
		System.out.println("Bonificação DESIGNER : " + d1.getBonificacao());
		
		System.out.println("Total de bonificação informado : " + controle.getSomaBonificacao());

	}

}
