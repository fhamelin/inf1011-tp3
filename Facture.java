import java.util.List;
import java.util.ArrayList;


public class Facture {
	
	private int numero;
	private Client client;
	private List<LigneArticle> articles;
	private double sousTotal;
	private double tps;
	private double tvq;
	private double total;
	
	public Facture(int _numero, Client _client) {
		this.numero = _numero;
		this.client = _client;
		articles = new ArrayList<LigneArticle>();
	}
	
	public boolean ajouterArticle(Article _a, int _quantite) {
		LigneArticle la = new LigneArticle (_a, _quantite);
		articles.add(la);
		return true;
	}
}
