import java.util.HashSet;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Principal {
	
	public static void main(String[] args) throws ParseException {
		
		Cadastrofilmes cadastroFilmes = new Cadastrofilmes();
		
		HashSet<Ator> elenco1 = new HashSet<Ator>();
		HashSet<Ator> elenco2 = new HashSet<Ator>();
		
		elenco1.add(new Ator("Tom Cruise","EUA"));
	    elenco1.add(new Ator("Fulado de Tal","Brasil"));
	    elenco2.add(new Ator("Tom Hanks","EUA"));
	    elenco2.add(new Ator("Beltrano","Brasil"));
	
	    Filme filme1 = new Filme("Top Gun", "Aventura", new SimpleDateFormat("dd/MM/yyyy").parse("03/10/1985"),elenco1);
	    Filme filme2 = new Filme("A Mosca", "Ficção", new SimpleDateFormat("dd/MM/yyyy").parse("13/10/1983"),elenco2);
	    
	    cadastroFilmes.insereFilme(filme1);
	    cadastroFilmes.insereFilme(filme2);
	//    elenco.clear();
	    cadastroFilmes.listaFilme();
	
	}

}
