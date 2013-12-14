import java.util.List;


public class Retour {
	
	public static void creerRetour(int _noFacture, List<LigneArticle> _aSupprimer, Facture _ancienneFact) {
		Facture f = new Facture(_ancienneFact);
		f.soustraireArticle(_aSupprimer);
	}
}
