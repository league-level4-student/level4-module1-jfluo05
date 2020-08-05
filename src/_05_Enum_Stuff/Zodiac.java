package _05_Enum_Stuff;

import _04_Intro_To_Enums.StatesOfMatter.SOM;
public class Zodiac {
public enum zod {
	ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, 
	LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
}
public static void printState(zod zodiacSign) {
	switch (zodiacSign) {
	// Notice that 'DataTypes.' is not requires when accessing categories
	case ARIES: {
		System.out.println("A");
		break;
	}
	case TAURUS: {
		System.out.println("T");
		break;
	}
	case GEMINI: {
		System.out.println("G");
		break;
	}
	case CANCER: {
		System.out.println("C");
		break;
	}
	case LEO: {
		System.out.println("L");
		break;
	}
	case VIRGO: {
		System.out.println("V");
		break;
	}
	case LIBRA: {
		System.out.println("L");
		break;
	}
	case SCORPIO: {
		System.out.println("S");
		break;
	}
	case SAGITTARIUS: {
		System.out.println("S");
		break;
	}
	case CAPRICORN: {
		System.out.println("C");
		break;
	}
	case AQUARIUS: {
		System.out.println("A");
		break;
	}
	case PISCES: {
		System.out.println("P");
		break;
	}
	
	}}public static void main(String[] args) {
		// Enum objects can be created and initialized:
		SOM data;
		printState(zod.AQUARIUS);
		printState(zod.ARIES);
		printState(zod.CANCER);
		printState(zod.CAPRICORN);
		printState(zod.GEMINI);
		printState(zod.LEO);
		printState(zod.LIBRA);
		printState(zod.PISCES);
		printState(zod.SAGITTARIUS);
		printState(zod.SCORPIO);
		printState(zod.TAURUS);
		printState(zod.VIRGO);
		}}
