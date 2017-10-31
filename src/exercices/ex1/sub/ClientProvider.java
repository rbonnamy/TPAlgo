package exercices.ex1.sub;

import java.util.ArrayList;
import java.util.List;

public class ClientProvider {

	public static List<Client> getClients(){
		List<Client> clients = new ArrayList<Client>();
		clients.add(new Client(51, TypeCompte.COMPTE_COURANT, 125));
		clients.add(new Client(38, TypeCompte.COMPTE_COURANT, 275));
		clients.add(new Client(24, TypeCompte.COMPTE_COURANT, 1320));
		clients.add(new Client(65, TypeCompte.COMPTE_COURANT, 850));
		clients.add(new Client(15, TypeCompte.COMPTE_COURANT, 150));
		clients.add(new Client(44, TypeCompte.COMPTE_COURANT, -37));
		clients.add(new Client(28, TypeCompte.COMPTE_COURANT, -175));
		clients.add(new Client(77, TypeCompte.COMPTE_COURANT, 18750));
		clients.add(new Client(89, TypeCompte.COMPTE_COURANT, 258));
		clients.add(new Client(18, TypeCompte.COMPTE_COURANT, 1750));
		clients.add(new Client(29, TypeCompte.PEL, 4500));
		clients.add(new Client(48, TypeCompte.PEL, 18500));
		clients.add(new Client(37, TypeCompte.PEL, 15500));
		clients.add(new Client(51, TypeCompte.PEL, 45000));
		clients.add(new Client(56, TypeCompte.PEL, 180000));
		clients.add(new Client(22, TypeCompte.PEL, 100));
		clients.add(new Client(52, TypeCompte.PEL, 13500));
		clients.add(new Client(23, TypeCompte.PEL, 450));
		clients.add(new Client(31, TypeCompte.PEL, 1500));
		clients.add(new Client(42, TypeCompte.PEL, 8000));
		
		return clients;
	}
}
