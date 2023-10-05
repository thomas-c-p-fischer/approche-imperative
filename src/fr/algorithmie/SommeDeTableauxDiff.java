package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] tableau1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tableau2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        int longueurMax = Math.max(tableau1.length, tableau2.length);
        int[] sommeTableaux = new int[longueurMax];
        for (int i = 0; i < longueurMax; i++) {
            int valeurTableau1 = (i < tableau1.length) ? tableau1[i] : 0;
            int valeurTableau2 = (i < tableau2.length) ? tableau2[i] : 0;
            sommeTableaux[i] = valeurTableau1 + valeurTableau2;
        }
        
        System.out.print("Tableau de la somme : ");
        for (int element : sommeTableaux) {
            System.out.print(element + " ");
        }
	}

}
