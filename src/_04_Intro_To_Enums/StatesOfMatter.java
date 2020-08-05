package _04_Intro_To_Enums;

import _04_Intro_To_Enums.IntroToEnums.DataTypes;

public class StatesOfMatter {
	public enum SOM {
		SOLID, LIQUID, GAS, PLASMA, BOSE_EINSTEIN_CONDENSATE
	}
	public static void printState(SOM state) {
		switch (state) {
		// Notice that 'DataTypes.' is not requires when accessing categories
		case SOLID: {
			System.out.println("APPLE");
			break;
		}
		case LIQUID: {
			System.out.println("MILK");
			break;
		}
		case GAS: {
			System.out.println("GAS");
			break;
		}
		case PLASMA: {
			System.out.println("PLASMA");
			break;
		}
		case BOSE_EINSTEIN_CONDENSATE: {
			System.out.println("NO IDEA");
			break;
		}
		}}
	public static void main(String[] args) {
		// Enum objects can be created and initialized:
		SOM data;
		printState(SOM.LIQUID);
		printState(SOM.SOLID);
		printState(SOM.GAS);
		printState(SOM.PLASMA);
		printState(SOM.BOSE_EINSTEIN_CONDENSATE);
		
		}

}