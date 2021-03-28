package fr.lecnam.nfa032.chapitre02.objet;

public class Voiture {

	enum EtatMoteur {
		INITIE, ARRETE
	};

	private String marque;
	private String couleur;
	private double poids;
	private double vitesseMaxi;
	private double vitesseCourante;
	private EtatMoteur etatMoteur;

	public Voiture(String marque, String couleur, double poids, double vitesseMaxi, double vitesseCourante,
			EtatMoteur etatMoteur) {
		this.marque = marque;
		this.couleur = couleur;
		this.poids = poids;
		this.vitesseMaxi = vitesseMaxi;
		this.vitesseCourante = vitesseCourante;
		this.etatMoteur = etatMoteur;
	}

	public Voiture() {
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", couleur=" + couleur + ", poids=" + poids + ", vitesseMaxi="
				+ vitesseMaxi + ", vitesseCourante=" + vitesseCourante + ", etatMoteur=" + etatMoteur + "]";
	}

	/**
	 * M�thode qui vous permet de d�marrer le moteur et d'acc�l�rer
	 */
	public void initialiser() {
		demarrerleMoteur();
		accelerer(40);
	}

	/**
	 * M�thode qui vous permet de lire le compte tour
	 */
	public void lireLeCompteTour() {
		System.out.println("Vitesse courante: " + vitesseCourante);
	}

	/**
	 * M�thode qui vous permet d'accelerer si le moteur de la voiture n'est pas
	 * �teint
	 * 
	 * @param vitesse
	 */
	public void accelerer(double vitesse) {
		if (this.etatMoteur == EtatMoteur.INITIE) {
			this.vitesseCourante = this.vitesseCourante + vitesse;
		} else {
			System.out.println("Il faut d'abord d�marrer le moteur.");
		}
	}

	/**
	 * M�thode qui vous permet de ralentir si le moteur de la voiture n'est pas
	 * �teint
	 * 
	 * @param vitesse
	 */
	public void ralentir(double vitesse) {
		if (this.etatMoteur == EtatMoteur.INITIE) {
			this.vitesseCourante = this.vitesseCourante - vitesse;
		} else {
			System.out.println("D�sol�e, mais le moteur est �teint.");
		}
	}

	/**
	 * M�thode qui vous permet de freiner si le moteur de la voiture n'est pas
	 * �teint
	 */
	public void freiner() {
		if (this.etatMoteur == EtatMoteur.INITIE) {
			this.vitesseCourante = 0;
		} else {
			System.out.println("D�sol�e, mais le moteur est �teint.");
		}
	}

	/**
	 * M�thode qui vous permet de demarrer le moteur
	 */
	public void demarrerleMoteur() {
		this.etatMoteur = EtatMoteur.INITIE;
	}

	/**
	 * M�thode qui vous permet d'arreter le moteur
	 */
	public void arreterLeMoteur() {
		this.etatMoteur = EtatMoteur.ARRETE;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getVitesseMaxi() {
		return vitesseMaxi;
	}

	public void setVitesseMaxi(double vitesseMaxi) {
		this.vitesseMaxi = vitesseMaxi;
	}

	public double getVitesseCourante() {
		return vitesseCourante;
	}

	public void setVitesseCourante(double vitesseCourante) {
		this.vitesseCourante = vitesseCourante;
	}

	public EtatMoteur getEtatMoteur() {
		return etatMoteur;
	}

	public void setEtatMoteur(EtatMoteur etatMoteur) {
		this.etatMoteur = etatMoteur;
	}
}
