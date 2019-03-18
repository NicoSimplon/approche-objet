package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
	public static void main (String[] args) {
		
		// Création de deux objet adresses
		AdressePostale adresse1 = new AdressePostale();
		
		adresse1.numeroRue = 5;
		adresse1.libelleVoie = "rue du marché";
		adresse1.codePostal = 44800;
		adresse1.ville = "Saint-Herblain";
		
		
		AdressePostale adresse2 = new AdressePostale();
		
		adresse2.numeroRue = 8;
		adresse2.libelleVoie = "rue du capitole";
		adresse2.codePostal = 31000;
		adresse2.ville = "Toulouse";
		
		// Création de deux personnes
		Personne pers1 = new Personne();
		pers1.nom = "Ferrat";
		pers1.prenom = "Jean";
		pers1.adressePostale = adresse1;
		
		Personne pers2 = new Personne();
		pers2.nom = "Chao";
		pers2.prenom = "Manu";
		pers2.adressePostale = adresse2;
		
	}
}
