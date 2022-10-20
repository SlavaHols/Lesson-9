package lesson9.lt.lhu.lesson09;

import java.util.Random;

public class Task31 {
//////////////////////// вернуться к задаче не доделал!!!!!!!!!!
	public static void main(String[] args) {
		int[][] ar = new int[5][5];
		int a = 0;
		int count2 = 0;
		int countAllcount = 0;

		Random inPutNum = new Random();
		System.out.println("Array look:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = inPutNum.nextInt(0, 1000);
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("New array look:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				a = ar[i][j];
				while (ar[i][j] > 10) {
					ar[i][j] = ar[i][j] / 10;
					++count2;
				}
				if (count2 ==1) {
				System.out.printf("[%4d]", a);
				
				} else 
					System.out.print(" ||| ");

			}
			System.out.println("  ");
			countAllcount = countAllcount + count2;

		}
		System.out.println("Numbers count 2 : " + countAllcount);
	}
}
