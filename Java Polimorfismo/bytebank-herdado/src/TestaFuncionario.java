
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente magno = new Gerente();
		
		magno.setNome("Magno");
		System.out.println(magno.getNome());
		magno.setSalario(3000.0);
		System.out.println(magno.getSalario());
		
		//Verificando calculo da bonificacao
		System.out.println("A bonoficação padrão é : " + magno.getBonificacao());
		
		//magno.salario = 300.0;
	}

}
