package fr.lecnam.nfa032.chapitre02;

/**
 * @author Catia Sepetauskas
 *
 */
public class Point {

	private String nom;
	private double abcisse;

	/**
	 * Methode permet d'initialiser les variables d'instances de la classe Point
	 * @param nom
	 * @param abcisse
	 */
	public void initialise(String nom, double abcisse) {
		this.nom = nom;
		this.abcisse = abcisse;
	}

	/**
	 * Methode d'affichage des informations de la classe Point
	 */
	public void affiche() {
		System.out.println("Nom du point : " + this.nom + " - Coordonnee :" + this.abcisse);
	}
	
	/**
	 * Methode qui permet le modifier la coordinnee du point
	 * @param newAbs nouvelle coordonnee du point
	 */
	public void translate(double newAbs) {
		this.abcisse = newAbs;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getAbcisse() {
		return abcisse;
	}

	public void setAbcisse(double abcisse) {
		this.abcisse = abcisse;
	}
}