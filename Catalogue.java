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
		for (Article art : articles) {
			if (art.get_code() == _search) {
				return art;
			}
		}
		return null;
	}
}
