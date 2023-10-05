package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un chiffre entre 1 et 10");
		int nb = sc.nextInt();
		if(nb >= 1 && nb <= 10) {
			 for(int i = nb; i <= nb + 10; i++) {
				 System.out.println(i);
			 }
		} else {
			System.out.println("Le nombre saisi n'est pas valide. Veuillez saisir un nombre entre 1 et 10.");
		}

	}

}
