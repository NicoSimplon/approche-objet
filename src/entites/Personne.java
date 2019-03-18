package entites;

/**
 * Représente une personne
 *
 */
public class Personne {

	public String nom;
	
	public String prenom;
	
	public AdressePostale adressePostale;
	
	public Personne (String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne (String nom, String prenom, AdressePostale adressePostale) {
		this(nom, prenom);
		this.adressePostale = adressePostale;
	}
}
