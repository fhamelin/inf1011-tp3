import java.util.List;


public class Catalogue {
	
	private static Catalogue instance = null;
	private List<Article> articles; 
	
	private Catalogue() {}
	
	public static Catalogue getInstance() {
		if (Catalogue.instance == null)
			Catalogue.instance = new Catalogue();
		
		return Catalogue.instance;
	}
	
	public Article find(String _search) {
		/*
		 * 
		 * blablabla methode pour rechercher un article
		 */
		return new Article();
	}
}
