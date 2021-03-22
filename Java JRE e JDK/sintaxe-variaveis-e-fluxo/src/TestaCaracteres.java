
public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		// Guarda um unico caractere 
		char letra = 'a';
		System.out.println(letra);
		
		// char refere-se a tabela do unicode, vai converter o resultado de acordo com a tabela ASCII
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "Variavel do tipo string";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}

}
