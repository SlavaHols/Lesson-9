package lesson9.lt.lhu.lesson09;

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		int[][] ar = new int[6][5];
		System.out.println("Source array:");
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = inPutNum.nextInt(0, 100);
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("New array look:");
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				if(i%2==0) {
					System.out.printf("[%4d]", ar[i][j] );
				}
			}
			System.out.println(" ");
		}
	}
}
