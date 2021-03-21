package fr.lecnam.nfa032.chapitre02;

import java.util.Scanner;

import fr.lecnam.nfa032.chapitre01.Personne;

public class TestPersonne {

	private static int nombreDePersonnes;

	/**
	 * Methode pour demander le nombre de personnes a stocker
	 */
	public static void createTableau() {
		Scanner scanner = new Scanner(System.in);
		nombreDePersonnes = 0;

		System.out.println("Veuillez spécifier le nombre de personnes à stocker, svp:");
		nombreDePersonnes = scanner.nextInt();
		scanner.close();
	}

	public static void main(String[] args) {
		Boolean exit = false;
		Scanner scanner = new Scanner(System.in);

		nombreDePersonnes = 0;

		while (nombreDePersonnes <= 0) {
			System.out.println("Veuillez spécifier le nombre(>0) de personnes à stocker, svp:");
			nombreDePersonnes = scanner.nextInt();
		}

		Personne[] tableauDePersonnes = new Personne[nombreDePersonnes];

		int i = 0;
		while (!exit) {
			Personne personne = new Personne();
			personne.initialise("Nom Personne", "Prenom Personne", 0);
			System.out.println("Veuillez saisir le nom de la personne " + i + ", svp:");
			String nom = scanner.next();
			System.out.println("Veuillez saisir le prenom de la personne " + i + ", svp:");
			String prenom = scanner.next();
			System.out.println("Veuillez saisir l'age de la personne " + i + ", svp:");
			Integer ageSaisie = scanner.nextInt();
			Integer age = ageSaisie >= 0 ? ageSaisie : 0;
			personne.setNom(nom);
			personne.setPrenom(prenom);
			personne.setAge(age);
			tableauDePersonnes[i] = personne;
			i++;
			if (i == nombreDePersonnes)
				exit = true;
		}

		System.out.println(tableauDePersonnes);
		int sum = 0;
		Personne plusAgee = null;
		Personne moinsAgee = null;

		for (Personne personne : tableauDePersonnes) {
			System.out.println(personne.getInfoPerso());
			sum += personne.getAge();

			if (plusAgee == null) {
				plusAgee = personne;
				moinsAgee = personne;
			} else {
				if (personne.getAge() > plusAgee.getAge()) {
					plusAgee = personne;
				} else if (personne.getAge() < moinsAgee.getAge()) {
					moinsAgee = personne;
				}
			}
		}

		System.out.println("La personne plus agee est: \n" + plusAgee.toString());
		System.out.println("La personne moins agee est: \n" + moinsAgee.toString());
		System.out.println("L'âge moyen de toutes les personnes: " + sum / nombreDePersonnes);

	}
}
