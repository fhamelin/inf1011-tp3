import java.util.List;


public class Catalogue {
	
	private static Catalogue instance = null;
	private List<Article> articles; 
	
	private Catalogue() {
		add_Article("S1","Ski",2,99.99);
		add_Article("R1","Raquette",12,15.99);
		add_Article("B1","Baton",100,20.00);
		add_Article("P1","Parachute",1,300.00);
		add_Article("D1","Deltaplane",1,600.00);
		add_Article("B2","Balle",300,5.00);
	}
	
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
	
	public void add_Article (String code, String nom, int quantite, double prix)
	{
		Article article = new Article(code, quantite, prix, nom);
		articles.add(article);
	}
}
