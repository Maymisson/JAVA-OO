// Contrato autenticavel 
	// Quem assina esse contrato precisa implementar
		// Metodo setSenha 
		// Metodo autentica


public abstract interface Autenticavel {
	
	/*private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}*/
	
	// Criando abstração para interface
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha); 
}
