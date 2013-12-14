import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.*;

public class testFacture extends TestCase {

	private Catalogue c;
	private RegistreFactures regFac;
	private Facture facture;
	@Before
	public void setUp() throws Exception {
		super.setUp();
		c = Catalogue.getInstance();
		regFac = RegistreFactures.getInstance();
		List<Article> lst = new ArrayList<Article>();
		lst.add(c.find("S1"));
		facture = Vente.creerVente(lst, 1, new Client("Frederic", "Hamelin", 1));	
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test() {
		if (!regFac.contains(facture)) {
			fail("Les factures ne sont pas ajoutés au registre de factures");
		}
	}

}
