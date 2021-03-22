
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 10;
		int quantidadePessoas = 3;
		//Expressão booleana 
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("Acompanhado = " + acompanhado);
		
		// Condicional com o operador logico OR
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}
}