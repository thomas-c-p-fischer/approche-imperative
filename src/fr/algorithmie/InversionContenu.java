package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] copyArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copyArray[i] = array[array.length -1 -i];
		}
		for(int affichage : copyArray) {
			System.out.println(affichage + " ");
		}
	}

}
