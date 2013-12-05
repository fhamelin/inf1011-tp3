
public class LigneArticle {
		
	private Article article;
	private int quantite;
	private double prixUnitaire;
	private double escompte; // calcul de lescompte pourrait etre un aspect
	
	public LigneArticle(Article _a, int _quantite) {
		this.quantite = _quantite;
		this.article = _a;
	}
	
	public void setEscompte(double _escompte) {
		this.escompte = _escompte;
	}
	
	public Article getArticle() {
		return this.article;
	}
}
