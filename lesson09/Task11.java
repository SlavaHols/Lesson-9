package lesson9.lt.lhu.lesson09;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		int[][] ar = new int[8][5];
		Random inPutNum = new Random();
		System.out.println("Array look: ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = inPutNum.nextInt(100);
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println("  ");
		}
		System.out.println("New array look:");
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < ar[i].length; j++) {
					System.out.printf("[%4d]", ar[i][j]);
				}
			} else
				for (int j = ar[i].length - 1; j >= 0; j--) {
					System.out.printf("[%4d]", ar[i][j]);
				}
			System.out.println("    ");
		}
	}
}
