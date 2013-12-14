import java.util.List;


public aspect AspectFacture 
{
	pointcut callCreationFactureAspect(Article a, int qte) :
		call(* Facture.ajouterArticle(Article, int)) && args(a, qte);
	
	boolean around (Article a, int qte) : callCreationFactureAspect(a, qte)
	{
		if (a.get_quantite() < qte){
			System.out.println("--- Aspect (CreationFacture:before)---");
			System.out.println("Quantite insuffisante pour l'article " +
			 a.get_nom() + " car qte est de " + a.get_quantite());
			return false;
		}

		proceed(a,qte);
	
		int qteActuelle, qteAncien;
		qteAncien = a.get_quantite();
		qteActuelle = qteAncien - qte;
		a.set_quantite(qteActuelle);
		
		System.out.println("--- Aspect (CreationFacture:after)---");
		System.out.println("La quantite avant la mise a jour: " + qteAncien);
		System.out.println("La quantite a soustraire: " + qte);
		System.out.println("La qte est maintenant de est de : " + a.get_quantite() + " " + 
						   "de l'article " + a.get_nom());
		System.out.println("--- Fin Aspect  ---\n");
		
		return true;
	}
	
	pointcut callSupprimerFactureAspect(List<LigneArticle> lnArt) :
		call(* Facture.soustraireArticle(List<LigneArticle>)) && args(lnArt);
	
	before (List<LigneArticle> lnArt) : callSupprimerFactureAspect(lnArt)
	{
		/*
		for (Article)
		int qteActuelle, qteAncien;
		qteAncien   = a.get_quantite();
		qteActuelle = qteAncien + qte;
		a.set_quantite(qteActuelle);
		
		System.out.println("--- Aspect:after (SupprimerFacture)  ---");
		System.out.println("La quantite avant la mise a jour: " + qteAncien);
		System.out.println("La quantite a additionner: " + qte);
		System.out.println("La qte est maintenant de est de : " + a.get_quantite() + " " + 
				           "de l'article " + a.get_nom());
		System.out.println("--- Fin Aspect  ---\n");
		*/
	}
}
