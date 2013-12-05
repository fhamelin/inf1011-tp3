
public class Vente {
	
	public static Facture creerVente(Article _a, int _quantite, Client _client) {
		RegistreFactures regFac = RegistreFactures.getInstance();
		
		Facture f = new Facture(123123, _client);
		regFac.add(f);
		
		if (f.ajouterArticle(_a, _quantite))
		{
			System.out.println("Yep");
		}
		
		return f;
	}
	
	public static void ajouterArticle(Facture _f, Article _a, int _quantite) {
		_f.ajouterArticle(_a, _quantite);
	}
}
