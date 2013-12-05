
public class Main {

	public static void main(String[] args) {
		creerVente();
	}
	
	private static void creerVente() {
		Catalogue catalogue = Catalogue.getInstance();

		RegistreClients registre = RegistreClients.getInstance();
		
		Article article = catalogue.find("S1");
		Vente.creerVente(article, 1, new Client("Frederic", "Hamelin", 1));
		Facture f = new Facture(123123, new Client("Frederic", "Hamelin", 1));
		
		f.ajouterArticle(article, 3);
	}
	
	
}
