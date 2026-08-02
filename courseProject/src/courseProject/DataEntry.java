package courseProject;

import java.util.Scanner;

public class DataEntry {
	Scanner scanner = new Scanner(System.in);
	
	public String getString(String prompt) {
		System.out.print(prompt);
		return scanner.nextLine();
	}
	
	public String getString(String prompt, int max) {
		String input;
		while (true) {
			System.out.print(prompt);
			input = scanner.nextLine();
			if (input.length() <= max) {
				return input;
			}
			System.out.println("Error: Input exceeds maximum length of " + max +" characters");
		}
	}
	
	public String getNumString(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = scanner.nextLine();
			if (input.matches("\\d+")) {
				return input;
			}
			System.out.println("Error: Input must contain numbers only.");
		}	
	}
	
	public int getInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			if (scanner.hasNextInt()) {
				int value = scanner.nextInt();
				scanner.nextLine();
				return value;
				}
			System.out.println("Error: Please enter an integer");
			scanner.nextLine();
		}
	}
}
