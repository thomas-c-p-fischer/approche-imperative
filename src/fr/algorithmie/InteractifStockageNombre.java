package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] tableau = new int[10];
        int nombreElements = 0;

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    if (nombreElements >= tableau.length) {
                        tableau = Arrays.copyOf(tableau, tableau.length * 2);
                    }
                    System.out.print("Entrez un nombre : ");
                    int nombre = sc.nextInt();
                    tableau[nombreElements] = nombre;
                    nombreElements++;
                    break;
                case 2:
                    if (nombreElements == 0) {
                        System.out.println("Aucun nombre n'a été ajouté.");
                    } else {
                        System.out.println("Nombres existants :");
                        for (int i = 0; i < nombreElements; i++) {
                            System.out.println(tableau[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Option non valide. Veuillez choisir une option valide.");
                    break;
            }
        }
	}

}
