
public aspect AspectFacture 
{
	pointcut callCreationFactureAspect(Article a, int qte) :
		call(* Facture.ajouterArticle(Article, int)) && args(a, qte);
	
	before (Article a, int qte) : callCreationFactureAspect(a, qte)
	{
		if (a.get_quantite() < qte){
			System.out.println("Quantite insuffisante");
			System.exit(1);
		}
	}
	
	after (Article a, int qte) : callCreationFactureAspect(a, qte)
	{
		int qteActuelle;
		qteActuelle = a.get_quantite() - qte;
		a.set_quantite(qteActuelle);
		System.out.println("La qte en inventaire est rendu à : " + a.get_quantite());
	}
}
