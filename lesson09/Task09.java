package lesson9.lt.lhu.lesson09;

import java.util.Random;

public class Task09 {

	public static void main(String[] args) {
		int[][] ar = new int[5][5];
		Random inPutNum = new Random();
		System.out.println("Array look: ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = inPutNum.nextInt(0, 100);
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("New array look:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j) {
					System.out.printf("[%4d]", ar[i][j]);
				} else
					System.out.print("      ");
			}
			System.out.println(" ");
		}
	}
}
