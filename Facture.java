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
	private Facture factureAnnulee;
	
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
	
	public List<LigneArticle> soustraireArticle(List<LigneArticle> _aSupprimer) {
		for (int i = 0; i < this.articles.size(); i++) {
			for (int j = 0; j < _aSupprimer.size(); j++) {
				if (this.articles.get(i).getArticle() == _aSupprimer.get(j).getArticle()) {
					
				}
			}
		}
	}
}
