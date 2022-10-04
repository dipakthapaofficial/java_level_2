package com.codeinteracts.level2;

import java.util.Scanner;

public class Hangman {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attempts = 3;
		String mystryString = "_ _ _ _ y _";
		System.out.println(mystryString);
		
		char guessedCharater = new Scanner(System.in).next().charAt(0);
		
		//		if (guess is wrong) {
		//			attempts--;
		//		}
		//		
		//		if (attempts == 0) {
		//			stop game. 
		//		}
		
	}
	
}
