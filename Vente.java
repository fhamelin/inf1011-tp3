import java.util.List;


public class Vente {
	
	public static Facture creerVente(List<Article> _a, int _quantite, Client _client) {
		RegistreFactures regFac = RegistreFactures.getInstance();
		
		Facture f = new Facture(123123, _client);
		
		regFac.add(f);
			
		for (int i = 0 ; i < _a.size(); i++) {
			f.ajouterArticle(_a.get(i), _quantite);
		}
		
		return f;
	}
	
	public static void ajouterArticle(Facture _f, Article _a, int _quantite) {
		_f.ajouterArticle(_a, _quantite);
	}
}
