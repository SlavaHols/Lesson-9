package lesson9.lt.lhu.lesson09;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		int[][] ar = new int[2][3];
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = inPutNum.nextInt(0, 9);
				System.out.printf("[ %4d]", ar[i][j]);
			}
			System.out.println();
		}
	}
}
