package listes;

/**
 * Représente une ville
 * 
 * @author Nicolas
 *
 */
public class Ville {

	private String nom;
	private int nbHabitant;

	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	public String toString() {
		return nom + " (" + nbHabitant + ")"; 
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

}
