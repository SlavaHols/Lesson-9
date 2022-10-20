package lesson9.lt.lhu.lesson09;

public class Task01 {

	public static void main(String[] args) {
		int[][] ar = new int[3][4];
		System.out.println("Source array:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = 0;
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("Removed the first and last column:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j) {
					ar[i][j] = 1;
					System.out.printf("[%4d]", ar[i][j]);
				} else
					System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println(" ");
		}
	}
}
