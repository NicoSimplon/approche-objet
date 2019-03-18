package entites;

/**
 * Représente une personne
 */
public class Personne {

	private String nom;
	
	private String prenom;
	
	private AdressePostale adressePostale;
	
	/**
	 * Constructeur par défaut
	 * 
	 * @param nom
	 * @param prenom
	 */
	public Personne (String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param prenom
	 * @param adressePostale
	 */
	public Personne (String nom, String prenom, AdressePostale adressePostale) {
		this(nom, prenom);
		this.adressePostale = adressePostale;
	}
	
	public String getNomPrenom () {
		return nom.toUpperCase() + " " + prenom;
	}
	
	/**
	 * @param nom
	 */
	public void setNom (String nom) {
		this.nom = nom;
	}
	
	/**
	 * @param prenom
	 */
	public void setPrenom (String prenom) {
		this.nom = prenom;
	}
	
	/**
	 * @param adresse
	 */
	public void setAdresse (AdressePostale adresse) {
		this.adressePostale = adresse;
	}
	
	public String getNom () {
		return nom;
	}
	
	public String getPrenom () {
		return prenom;
	}
	
	public AdressePostale getAdresse () {
		return adressePostale;
	}
}
