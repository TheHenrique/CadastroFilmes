import java.util.Date;
import java.util.Set;

public class Filme {
	
	private String titulo;
	private String genero;
	private Date dataLancamento;
	private Set<Ator> atores;
	
	public Filme(String titulo, String genero, Date dataLancamento, Set<Ator> atores) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.dataLancamento = dataLancamento;
		this.atores = atores;
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getGenero() {
		return genero;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}
	
	public Set<Ator> getAtor() {
		return atores;
	}
	
	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", genero=" + genero + "]";
	}
}
