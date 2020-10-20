

public class Ator {
	
	private String nome;
	private String pais;
	
	public Ator(String nome, String pais) {
		super();
		this.nome = nome;
		this.pais = pais;
		
	}

	public String getNome() {
	  	return nome;
	}
	
	public String getPais() {
		return pais;
	}
	  
	@Override
	public String toString() {
		return "Ator [nomer=" + nome + ", pais=" + pais + "]";
	}
}
