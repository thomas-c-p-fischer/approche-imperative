package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un chiffre entre 1 et 10");
		int nb = sc.nextInt();
		if(nb >= 1 && nb <= 10) {
			 System.out.println("Table de " + nb + " : ");
			 for(int i = 1; i <= 10; i++) {
				 int result = nb * i;
				 System.out.println(nb + " x " + i + " = " + result);
			 }
		} else {
			System.out.println("Le nombre saisi n'est pas valide. Veuillez saisir un nombre entre 1 et 10.");
		}
		sc.close();
	}

}
