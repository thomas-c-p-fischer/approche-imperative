package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1;
        int nombreEssais = 0;
        int nombreUtilisateur;
        System.out.println("Bienvenue dans le jeu du Plus ou Moins !");
        System.out.println("Devinez le nombre entre 1 et 100.");
        do {
            System.out.print("Entrez votre proposition : ");
            nombreUtilisateur = scanner.nextInt();
            nombreEssais++;
            if (nombreUtilisateur < nombreAleatoire) {
                System.out.println("Le nombre est plus grand.");
            } else if (nombreUtilisateur > nombreAleatoire) {
                System.out.println("Le nombre est plus petit.");
            } else {
                System.out.println("Bravo, vous avez trouvé en " + nombreEssais + " coups !");
            }
        } while (nombreUtilisateur != nombreAleatoire);
        scanner.close();
	}

}
