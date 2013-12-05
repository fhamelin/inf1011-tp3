
public class Article {
	
	private String code;
	private String nom;
	private int quantite;
	private double prix;
	
	public Article() {}

	public Article(String code, int quantite, double prix, String nom)
	{
		this.code = code;
		this.quantite = quantite;
		this.prix = prix;
		this.nom = nom;
	}
	
	public String get_code()
	{
		String code = this.code;
		return code;
	}
	
	public int get_quantite()
	{
		int quantite = this.quantite;
		return quantite;
	}
	
	public double get_prix()
	{
		double prix = this.prix;
		return prix;
	}
	
	public String get_nom()
	{
		String nom = this.nom;
		return nom;
	}
}
