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
	
	public Facture (Facture _f) {
		this.numero = _f.numero;
		this.client = _f.client;
		this.articles = _f.articles;
		this.sousTotal = _f.sousTotal;
		this.tps = _f.tps;
		this.tvq = _f.tvq;
		this.total = _f.total;
		this.factureAnnulee = _f;
	}
	
	public boolean ajouterArticle(Article _a, int _quantite) {
		LigneArticle la = new LigneArticle (_a, _quantite);
		articles.add(la);
		return true;
	}
	
	public void soustraireArticle(List<LigneArticle> _aSupprimer) {
		int i_size = this.articles.size();
		int i = 0;
		
		while(i < i_size) {
			for (int j = 0; j < _aSupprimer.size(); j++) {
				if (this.articles.get(i).getArticle() == _aSupprimer.get(j).getArticle()) {
					
					int fac_qte = this.articles.get(i).getArticle().get_quantite();
					int new_qte = _aSupprimer.get(j).getArticle().get_quantite();
					
					if (fac_qte > new_qte) {
						this.articles.get(i).setQuantite(fac_qte - new_qte);
					}
					else {
						this.articles.remove(i);
						i_size--;
					}
				}
			}
			
			i++;
		}
	}
}
