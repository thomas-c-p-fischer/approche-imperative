package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = {1,  15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] copyArray = new int[array.length];
		for (int i = 0; i < 17; i++) {
			System.out.println(array[i]);
			copyArray[i] = array[i];
			System.out.println(copyArray[i]);
		}
		for (int i = 16; i > -1; i--) {
			System.out.println(array[i]);
		}
	}

}
