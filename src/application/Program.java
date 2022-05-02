package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int m = input.nextInt();
		System.out.print("Enter the number of columns: ");
		int n = input.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("[" + i + "][" + j + "]: ");
				mat[i][j] = input.nextInt();
			}
		}

		System.out.print("Choose a number: ");
		int x = input.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + ", " + j);
					if (j > 0) {
						System.out.println("Left " + mat[i][j - 1]);
						}
					if (j < n-1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
						}
					if (i < m-1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		input.close();

	}

}
