
public class Client 
{
	int noID, telephone;
	String nom, prenom, adresse, ville, province, codepostal;
	
	public Client (String nom, String prenom, int noID)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.noID = noID;
	}
	
	public String get_nom()
	{
		String nom = this.nom;
		return nom;
	}
	
	public String get_prenom()
	{
		String prenom = this.prenom;
		return prenom;
	}
	
	public int get_ID()
	{
		int ID = this.noID;
		return ID;
	}
}
