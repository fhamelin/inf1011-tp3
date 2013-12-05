
public class Vente {
	
	public static void creerVente(Article _a, int _quantite, Client _client) {
		
		Facture f = new Facture(123123, _client);
		
		if (f.ajouterArticle(_a, _quantite))
		{
			System.out.println("Yep");
		}
	}
}
