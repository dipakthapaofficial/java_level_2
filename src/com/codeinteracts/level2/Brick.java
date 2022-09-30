package com.codeinteracts.level2;

public class Brick {
	
	String clayType;
	
	int waterContent;
	
	String waterContentUnit;
	
	void createBrick() {
		System.out.println("Create method brick");
		System.out.println(this.clayType);
	}
	
	void heatBrick() {
		System.out.println("Heat method brick");
		
		//		DRY
	}

	public static void main(String[] args) {
		
		Brick br1 = new Brick();
		br1.clayType = "White";
		br1.waterContent = 10;
		br1.waterContentUnit = "ml";
		
		System.out.println(br1);
		
		System.out.println(br1.getClass().getName());
		
		br1.createBrick();
		
		Brick br2 = new Brick();
		br2.clayType = "Black";
		br2.waterContent = 10;
		br2.waterContentUnit = "ml";
		
		br2.createBrick();
		System.out.println(br2.waterContent);
		System.out.println(br2.clayType);
	}
	
}
