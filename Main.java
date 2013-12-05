
public class Main {

	public static void main(String[] args) {
		
	}
	
	private void creerVente() {
		Catalogue catalogue = Catalogue.getInstance();
		Article article = catalogue.find("12345");
		Facture f = new Facture(123123, new Client("Frederic", "Hamelin", 1));
		
		
		f.ajouterArticle(article, 1);
	}
	
	private void creerRetour() {}
}
