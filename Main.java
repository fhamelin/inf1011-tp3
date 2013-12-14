import java.util.*;


public class Main {

	public static void main(String[] args) {
		creerVente();
	}
	
	private static void creerVente() {
		Catalogue catalogue = Catalogue.getInstance();
		RegistreClients clients = RegistreClients.getInstance();
		RegistreFactures factures = RegistreFactures.getInstance();
		
		List<Article> lst = new ArrayList<Article>();
		lst.add(catalogue.find("S1"));
		Facture f = Vente.creerVente(lst, 1, new Client("Frederic", "Hamelin", 1));	
		
		lst = new ArrayList<Article>();
		lst.add(catalogue.find("S1"));
		Vente.creerVente(lst, 1, new Client("Mathieu", "Dargis", 2));
		
		lst = new ArrayList<Article>();
		lst.add(catalogue.find("P1"));
		Vente.creerVente(lst, 1, new Client("Simon", "Blanchette", 3));
		
		lst = new ArrayList<Article>();
		lst.add(catalogue.find("B1"));
		Vente.creerVente(lst, 1, new Client("Christophe", "Diamond", 4));
	}
}
