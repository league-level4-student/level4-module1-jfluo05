package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(choice) {
		case "Sunday": 
			System.out.println("SUNday");
			break;
		case "Monday": 
			System.out.println("MOONday");
			break;
		case "Tuesday": 
			System.out.println("2s-day");
			break;
		case "Wednesday": 
			System.out.println("WHENSday");
			break;
		case "Thursday": 
			System.out.println("THERSday");
			break;
		case "Friday": 
			System.out.println("FRIYAY");
			break;
		case "Saturday": 
			System.out.println("SATURN-day");
			break;
		default: 
			System.out.println("Something went very extremely horribly wrong. Please try again before the computer blows up");
			break;
		}
	}
}
