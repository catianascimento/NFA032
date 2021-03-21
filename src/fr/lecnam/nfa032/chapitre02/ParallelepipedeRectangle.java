package fr.lecnam.nfa032.chapitre02;

public class ParallelepipedeRectangle {

	//Mes 3 variables d'instances
	private int hauteur;

	private int longueur;

	private int largeur;
	
	public ParallelepipedeRectangle(int hauteur, int longueur, int largeur) {
		this.hauteur = hauteur;
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public ParallelepipedeRectangle() {
		this.hauteur = 0;
		this.longueur = 0;
		this.largeur = 0;
	}

	public long getVolume() {
		return this.hauteur * this.longueur * this.largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
}
