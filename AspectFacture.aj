
public aspect AspectFacture 
{
	pointcut callCreationFactureAspect(Article a, int qte) :
		call(* Facture.ajouterArticle(Article, int)) && args(a, qte);
	
	boolean around(Article a, int qte) : callCreationFactureAspect(a, qte)
	{
		if (a.get_quantite() >= qte)
		{
			proceed(a, qte);
			return true;
		}
		else
		{
			System.out.println("Quantit√© insuffisante");
			return false;
		}
	}
	
	after (Article a, int qte) : callCreationFactureAspect(a, qte)
	{
		int qteActuelle;
		qteActuelle = a.get_quantite() - qte;
		a.set_quantite(qteActuelle);
		System.out.println("La qte en inventaire est rendu ‡ : " + a.get_quantite());
	}
}
