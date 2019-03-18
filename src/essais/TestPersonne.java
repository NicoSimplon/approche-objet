package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
	public static void main (String[] args) {
		
		// Création de deux objet adresses
		AdressePostale adresse1 = new AdressePostale(5, "rue du marché", 44800, "Saint-Herblain");
		
		AdressePostale adresse2 = new AdressePostale(8, "rue du capitole", 31000, "Toulouse");
		
		// Création de deux personnes
		Personne pers1 = new Personne("Ferrat", "Jean", adresse1);
		
		Personne pers2 = new Personne("Chao", "Manu", adresse2);

	}
}
