package fr.lecnam.nfa032.chapitre01;

public class TestPersonne {

	public static void main(String[] args) {

//PART 1------------------------------------------------------------------		
//		Personne p1 = new Personne();
//		System.out.println(p1.age);
//		
//		Personne p2 = new Personne();
//        int x;
//        int[] tab = {2,4,6};
//        
//        x = p2.age;
//        System.out.println(x); // Affiche 0
//        
//        System.out.println(tab[p2.age]); // Affiche 2

//PART 2------------------------------------------------------------------
//		Personne p1 = new Personne();
//		Personne p2 = new Personne();
//		
//		p1.nom = "Martin";
//		p1.prenom = "Jules";
//		p1.age = 48;
//		
//		p2.nom = "Petit";
//		p2.prenom = "Alice";
//		p2.age = 21;
//		
//		System.out.println("Valeur de l’objet Personne p1 : " + p1.nom + ", " + p1.prenom + ", " + p1.age);
//		System.out.println("Valeur de l’objet Personne p2 : " + p2.nom + ", " + p2.prenom + ", " + p2.age);

//PART 3------------------------------------------------------------------		
//		Personne p1 = new Personne();
//		Personne p2 = new Personne();
//		p1.nom = "Martin";
//		p1.prenom = "Jules";
//		p1.age = 48;
//		p2 = p1;
//		p2.age = 52;
//		System.out.println("Valeur de l’objet Personne p1 : " + p1.nom + ", " + p1.prenom + ", " + p1.age);
//		System.out.println("Valeur de l’objet Personne p2 : " + p2.nom + ", " + p2.prenom + ", " + p2.age);

//PART 4------------------------------------------------------------------
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		p1.nom = "Martin";
		p1.prenom = "Jules";
		p1.age = 48;
		System.out.println(p1.getInfoPerso());
		System.out.println(p2.getInfoPerso());

	}

}
