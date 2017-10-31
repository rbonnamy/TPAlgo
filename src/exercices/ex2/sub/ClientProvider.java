package exercices.ex2.sub;

import java.util.ArrayList;
import java.util.List;

public class ClientProvider {

	public static List<Client> getClients(){
		List<Client> clients = new ArrayList<Client>();
		
		Client c1 = new Client("Beri Kameu", 51);
		Client c2 = new Client("Granudal BARQUET", 34);
		Client c3 = new Client("Rasmussen YU", 37);
		Client c4 = new Client("Mohaw Xand", 47);
		Client c5 = new Client("Jismac Trabalo", 41);
		Client c6 = new Client("Hamelia Papa", 24);
		Client c7 = new Client("Kosmed Kupa", 54);
		Client c8 = new Client("Cran Couac", 42);
		Client c9 = new Client("Periplo Radox", 39);
		Client c10 = new Client("Cremille Mazec", 18);
		
		
		c1.getComptes().add(new Compte(TypeCompte.COMPTE_COURANT, 1250));
		c2.getComptes().add(new Compte(TypeCompte.COMPTE_COURANT, 120));
		c3.getComptes().add(new Compte(TypeCompte.COMPTE_COURANT, -45));
		c4.getComptes().add(new Compte(TypeCompte.COMPTE_COURANT, 425));
		c5.getComptes().add(new Compte(TypeCompte.COMPTE_COURANT, 875));
		c6.getComptes().add(new Compte(TypeCompte.COMPTE_COURANT, 227));
		c7.getComptes().add(new Compte(TypeCompte.COMPTE_COURANT, 344));
		c8.getComptes().add(new Compte(TypeCompte.COMPTE_COURANT, -126));
		c9.getComptes().add(new Compte(TypeCompte.COMPTE_COURANT, 488));
		c10.getComptes().add(new Compte(TypeCompte.COMPTE_COURANT, -15));
		
		
		c1.getComptes().add(new Compte(TypeCompte.PEL, 12500));
		c3.getComptes().add(new Compte(TypeCompte.PEL, 100));
		c4.getComptes().add(new Compte(TypeCompte.PEL, 1500));
		c7.getComptes().add(new Compte(TypeCompte.PEL, 44250));
		c8.getComptes().add(new Compte(TypeCompte.PEL, 2850));
		c10.getComptes().add(new Compte(TypeCompte.PEL, 4850));
		
		c1.getComptes().add(new Compte(TypeCompte.LIVRETA, 375));
		c2.getComptes().add(new Compte(TypeCompte.LIVRETA, 125));
		c3.getComptes().add(new Compte(TypeCompte.LIVRETA, 1500));
		c5.getComptes().add(new Compte(TypeCompte.LIVRETA, 185));
		c7.getComptes().add(new Compte(TypeCompte.LIVRETA, 489));
		c8.getComptes().add(new Compte(TypeCompte.LIVRETA, 874));
		c9.getComptes().add(new Compte(TypeCompte.LIVRETA, 2854));
		
		return clients;
	}
}
