package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		System.out.println("Affichage des entiers supérieur à 3 : ");
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("Affichage des entiers pairs : ");
		for(int pair : array) {
			if(pair % 2 == 0) {
				System.out.println(pair);
			}
		}
		
		System.out.println("Affichage des entiers impairs : ");
		for(int impair : array) {
			if(impair % 2 != 0) {
				System.out.println(impair);
			}
		}
		
		System.out.println("Affichage des entiers dont l'index est pairs : ");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
	}

}
