package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un chiffre entre 1 et 10 : ");
		int nb = sc.nextInt();
		if(nb <= 10 && nb >= 1) {
			System.out.println("Le nombre saisi est le : " + nb);
		} else {
			do {
				System.out.println("Veuillez saisir un chiffre entre 1 et 10 : ");
				nb = sc.nextInt();
			} while(nb <= 1 && nb >= 10);
			System.out.println("Le nombre saisi est le : " + nb);
		}
	}
}
