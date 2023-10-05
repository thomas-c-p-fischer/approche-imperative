package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un chiffre entre 1 et 10");
		int nb = sc.nextInt();
		double plusGrand = Double.NEGATIVE_INFINITY;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Entrez le nombre #" + i + ": ");
            double nombre = sc.nextDouble();
            if (nombre > plusGrand) {
                plusGrand = nombre;
            }
        }
        System.out.println("Le plus grand nombre est : " + plusGrand);
        sc.close();
	}

}
