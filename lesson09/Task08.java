package lesson9.lt.lhu.lesson09;

import java.util.Random;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		Random inPutNum = new Random();
		System.out.println("Enter number n:");
		System.out.println("Enter number m:");
		int n = inPut.nextInt();
		int m = inPut.nextInt();
		int count = 0;
		int[][] ar = new int[n][m];
		inPut.close();
		System.out.println("Array look:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = inPutNum.nextInt(0, 10);
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println(" ");
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == 7) {
					count++;
				}
			}
		}
		System.out.println(" In the array number 7 :  " + count + " .");
	}
}
