package lesson9.lt.lhu.lesson09;

public class Task12 {

	public static void main(String[] args) {
		int[][] ar = new int[5][5];
		System.out.println("Array look: ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = 0;
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println("  ");
		}
		System.out.println("New array look: ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (j == i) {
					ar[i][j] = i;
				}
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println("  ");
		}
	}
}
