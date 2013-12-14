import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class testVente extends TestCase {
	private Catalogue c;
	private int qteAvant;
	private int qteVendu;
	private int qteApres;
	
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		c = Catalogue.getInstance();
		List<Article> lst = new ArrayList<Article>();
		Article a = c.find("S1");
		qteAvant = a.get_quantite();
		qteVendu = 1;
		lst.add(a);
		Facture f = Vente.creerVente(lst, qteVendu, new Client("Frederic", "Hamelin", 1));	
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testQuantiteVente() {
		
		Article a = c.find("S1");
		qteApres = a.get_quantite();
		
		if (qteAvant - qteApres != qteVendu) {
			fail("Ajustement d'inventaire invalide");
		}
	}

}
