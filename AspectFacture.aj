
public aspect AspectFacture 
{
	pointcut callCreationFactureAspect(Article a, int qte) :
		call(void Facture.ajouterArticle(Article, int)) && args(a, qte);
	
	
	boolean around(Article a, int qte) : callCreationFactureAspect(a, qte)
	{
		if (a.get_quantite() >= qte)
		{
			proceed(a, qte);
			return true;
		}
		else
		{
			System.out.println("Quantité insuffisante");
			return false;
		}
	}
}
