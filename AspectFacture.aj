
public aspect AspectFacture 
{
	pointcut callCreationFactureAspect(Article a, int qte) :
		call(* Facture.ajouterArticle(Article, int)) && args(a, qte);
	
	before (Article a, int qte) : callCreationFactureAspect(a, qte)
	{
		if (a.get_quantite() < qte){
			System.out.println("--- Aspect:before ERR");
			System.out.println("Quantite insuffisante pour l'article " +
			 a.get_nom() + " car qte est de " + a.get_quantite());
			System.exit(1);
		}
		else
			System.out.println("--- Aspect:before OK");
	}
	
	after (Article a, int qte) : callCreationFactureAspect(a, qte)
	{
		int qteActuelle, qteAncien;
		qteAncien = a.get_quantite();
		qteActuelle = qteAncien - qte;
		a.set_quantite(qteActuelle);
		
		System.out.println("--- Aspect:after  ---");
		System.out.println("La quantite avant la mise a jour: " + qteAncien);
		System.out.println("La quantite a soustraire: " + qte);
		System.out.println("La qte est maintenant de est de : " + a.get_quantite() + " " + 
						   "de l'article " + a.get_nom());
		System.out.println("--- Fin Aspect  ---\n");
	}
}
