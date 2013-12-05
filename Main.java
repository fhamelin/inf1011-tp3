
public class Main {

	public static void main(String[] args) {
		creerVente();
	}
	
	private static void creerVente() {
		Catalogue catalogue = Catalogue.getInstance();
		RegistreClients clients = RegistreClients.getInstance();
		RegistreFactures factures = RegistreFactures.getInstance();
		
		Article article = catalogue.find("S1");
		Facture f = Vente.creerVente(article, 1, new Client("Frederic", "Hamelin", 1));
		Vente.ajouterArticle(f, catalogue.find("P1"), 1);		
		
		Article article1 = catalogue.find("S1");
		Vente.creerVente(article1, 1, new Client("Mathieu", "Dargis", 2));
		
		Article article2 = catalogue.find("P1");
		Vente.creerVente(article2, 1, new Client("Simon", "Blanchette", 3));
		
		
		Article article3 = catalogue.find("B1");
		Vente.creerVente(article3, 1, new Client("Christophe", "Diamond", 4));
	}
}
