package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int batons = 21;
        boolean tourJoueur = true;
        System.out.println("Bienvenue dans le jeu des 21 bâtons !");
        System.out.println("Règles : Vous pouvez prendre de 1 à 3 bâtons à chaque tour.");
        while (batons > 0) {
            if (tourJoueur) {
                // Tour du joueur
                int choix;
                do {
                    System.out.print("Tour du joueur. Combien de bâtons voulez-vous prendre (1-3) ? ");
                    choix = sc.nextInt();
                } while (choix < 1 || choix > 3);

                batons -= choix;
                System.out.println("Le joueur a pris " + choix + " bâton(s). Bâtons restants : " + batons);
            } else {
                // Tour de l'ordinateur
                int choixOrdinateur = Math.min(random.nextInt(3) + 1, batons);
                batons -= choixOrdinateur;
                System.out.println("L'ordinateur a pris " + choixOrdinateur + " bâton(s). Bâtons restants : " + batons);
            }
            tourJoueur = !tourJoueur; // Passer au tour suivant
            // Vérifier si quelqu'un a gagné
            if (batons == 0) {
                if (tourJoueur) {
                    System.out.println("L'ordinateur a gagné !");
                } else {
                    System.out.println("Le joueur a gagné !");
                }
            }
        }
        sc.close();

	}

}
