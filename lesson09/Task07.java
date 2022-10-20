package lesson9.lt.lhu.lesson09;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		int[][] ar = new int[5][5];
		int sum = 0;
		Random inPutNum = new Random();
		System.out.println("Array look: ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = inPutNum.nextInt(-10, 10);
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println("   ");
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] < 0 && ar[i][j] % 2 != 0) {
					ar[i][j] = Math.abs(ar[i][j]);
					sum = sum + ar[i][j];
				}
			}
			System.out.println("Summa iterazii " + i+" = " + sum);
		}
		System.out.println("Summa all = " + sum);
	}
}
