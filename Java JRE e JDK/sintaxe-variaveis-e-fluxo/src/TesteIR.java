
public class TesteIR {
	
	public static void main(String[] args) {
		
		double salario = 3900.00;
		
		if (salario < 1900.00) {
			System.out.println("Você não precisa declarar IR");
		} else if (salario >= 1900.00 && salario <=2800.00) {
			System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		} else if (salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("o IR é de 15% e pode deduzir R$ 350");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
		}else if (salario >= 4664.01) {
			System.out.println("Regras de alíquota não informada para o valor");
		}
	}

}
