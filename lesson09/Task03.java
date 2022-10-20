package lesson9.lt.lhu.lesson09;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		System.out.println("Source array :");
		int[][] ar = new int[3][4];
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = inPutNum.nextInt(0, 10);
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("New array look:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++)
				if (j == 0 || j == ar.length) {
					System.out.print("");
					System.out.printf("[%4d]", ar[i][j]);
					System.out.print("");
				}
			System.out.println(" ");
		}
	}
}
