package com.chess.tournament;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int players = findPlayers(n);
		System.out.println("Total Players " + players);
		int arrList[] = new int[players];
		for (int i = 0; i < arrList.length; i++) {
			arrList[i] = i + 1;
		}

		for (int i = 0; i < arrList.length; i++) {
			System.out.println("P" + arrList[i]);
		}
		int playerInfo[][] = new int[players - 1][];
		for (int i = 0; i < playerInfo.length; i++) {

			for (int j = 0; j < playerInfo.length; j++) {
				if (i > j)
					playerInfo[i][j] = 1;
				else
					playerInfo[i][j] = 0;

			}
		}
	}

	public static int findPlayers(int num) {
		int p = (int) Math.pow(2, num);
		return p;
	}
}
