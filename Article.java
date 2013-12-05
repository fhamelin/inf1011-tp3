
public class Article 
{
	int code, quantite;
	double prix;
	String nom;
	
	public Article(int code, int quantite, double prix, String nom)
	{
		this.code = code;
		this.quantite = quantite;
		this.prix = prix;
		this.nom = nom;
	}
	
	public int get_code()
	{
		int code = this.code;
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
