
public class TestaValores {
	
	public static void main(String[] args) {
		// Passagem por valor de uma variável
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo);
	}

}
