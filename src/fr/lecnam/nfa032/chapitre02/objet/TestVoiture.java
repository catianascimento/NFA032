package fr.lecnam.nfa032.chapitre02.objet;

import fr.lecnam.nfa032.chapitre02.objet.Voiture.EtatMoteur;

public class TestVoiture {

	public static void main(String[] args) {
		Voiture voiture = new Voiture("Ferrari", "rouge", 500, 300, 0, EtatMoteur.ARRETE);

		System.out.println(voiture.toString());
		
		voiture.accelerer(20);
		
		voiture.ralentir(20);
		
		voiture.freiner();
		
		voiture.initialiser();
		
		System.out.println(voiture.toString());
		
		voiture.accelerer(20);
		
		System.out.println(voiture.toString());
		
		voiture.ralentir(5);
		
		System.out.println(voiture.toString());
		
		voiture.freiner();
		
		System.out.println(voiture.toString());
		
		voiture.arreterLeMoteur();
		
		System.out.println(voiture.toString());
	}
}
