import java.util.List;


public class RegistreClients {
	
	private static RegistreClients instance = null;
	private List<Client> clients; 
	
	private RegistreClients() {
		add_Client("Norris","Chuck",1);
		add_Client("Stalonne","Sylvester",2);
		add_Client("LeClown","Bozo",3);
		add_Client("Gelinas","Mathieu",4);
		add_Client("Diamant","Christaux",5);
		add_Client("Badri","Linda",6);
	}
	
	public static RegistreClients getInstance() {
		if (RegistreClients.instance == null)
			RegistreClients.instance = new RegistreClients();
		
		return RegistreClients.instance;
	}
	
	public Article find(String _search) {
		/*
		 * 
		 * blablabla methode pour rechercher un article
		 */
		return new Article();
	}
	
	public void add_Client (String nom, String prenom, int noID)
	{
		Client client = new Client(nom, prenom, noID);
		clients.add(client);
	}
}
