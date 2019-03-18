package entites;

/**
 * Représente une adresse postale
 */
public class AdressePostale {
	
	private int numeroRue;

	private String libelleVoie;

	private int codePostal;
	
	private String ville;
	
	/**
	 * Constructeur
	 * 
	 * @param numeroRue
	 * @param libelleVoie
	 * @param codePostal
	 * @param ville
	 */
	public AdressePostale (int numeroRue, String libelleVoie, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleVoie = libelleVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleVoie() {
		return libelleVoie;
	}

	public void setLibelleVoie(String libelleVoie) {
		this.libelleVoie = libelleVoie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
