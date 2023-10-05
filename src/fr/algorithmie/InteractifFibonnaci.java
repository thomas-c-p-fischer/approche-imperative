package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le rang N pour calculer le nombre de la suite de Fibonacci : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Le rang doit être un nombre positif.");
        } else {
            long resultat = testFibonacci(n);
            System.out.println("Le nombre de rang " + n + " dans la suite de Fibonacci est : " + resultat);
        }

        scanner.close();
    }

    public static long testFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long fibNMinus1 = 1;
            long fibNMinus2 = 0;
            long fibN = 0;

            for (int i = 2; i <= n; i++) {
                fibN = fibNMinus1 + fibNMinus2;
                fibNMinus2 = fibNMinus1;
                fibNMinus1 = fibN;
            }

            return fibN;
        }

	}

}
