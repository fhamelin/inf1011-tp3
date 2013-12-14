
import java.util.*;

public class RegistreFactures {
	private static RegistreFactures instance = null;
	public List<Facture> factures;
	
	private RegistreFactures() {
		this.factures = new ArrayList<Facture>();
	}
	
	public static RegistreFactures getInstance() {
		if (RegistreFactures.instance == null)
			RegistreFactures.instance = new RegistreFactures();
		return RegistreFactures.instance;
	}
	
	public void add(Facture _f) {
		this.factures.add(_f);
	}
	
	public boolean contains(Facture _f) {
		return this.factures.contains(_f);
	}
}
