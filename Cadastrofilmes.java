import java.util.List;
import java.util.ArrayList;

public class Cadastrofilmes {
	
	private List<Filme> filmes = new ArrayList<Filme>();
	
    public void insereFilme(Filme f) {
	    filmes.add(f);
    }
    public void removeFilme(Filme f) {
	    filmes.remove(f);
    }
    public void consultaFilme(int n) {
	    filmes.get(n);
    }
    public void listaFilme() {
	    for (Filme f: filmes)
	        System.out.println(f.toString());
    } 	
    
}