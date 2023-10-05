package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] tableau = {0, 1, 2, 3};
        int n = tableau.length;
        int temp = tableau[n - 1];
        for (int i = n - 1; i > 0; i--) {
            tableau[i] = tableau[i - 1];
        }
        tableau[0] = temp;
        System.out.print("Tableau après rotation : ");
        for (int element : tableau) {
            System.out.print(element + " ");
        }	}

}
