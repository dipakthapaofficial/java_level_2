package com.codeinteracts.level2;

import java.util.Scanner;

public class TicTacToe {
	
	void startGame() {
		String[][] layout = { { "", "", "" }, { "", "", "" }, { "", "", "" } };
		
		
		for (int i = 0; i < layout.length; i++) {
			for (int j = 0; j < layout[i].length; j++) {
				System.out.print(layout[i][j] + " |");
			}
			System.out.println();
		}
		
		//User: X
		// computer: 0
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i< 9; i++) {
			System.out.println("Enter location x:: 0-2");
			int locationX = sc.nextInt();
			
			System.out.println("Enter location x:: 0-2");
			int locationY = sc.nextInt();
			
			layout[locationX][locationY] = "X";
			
			//Computer enters after user enters the value
			
			
			//Showing result after each input
			for (int j = 0; j < layout.length; j++) {
				for (int k = 0; k < layout[i].length; k++) {
					System.out.print(layout[j][k] + " |");
				}
				System.out.println();
			}
			
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.startGame();
		
	}
	
}
