package courseProject;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DataEntry {
	static Scanner scanner = new Scanner(System.in);
	
	public static String getString(String prompt) {
		System.out.print(prompt);
		return scanner.nextLine();
	}
	
	public static String getString(String prompt, int max) {
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
	
	public static String getNumString(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = scanner.nextLine();
			if (input.matches("\\d+")) {
				return input;
			}
			System.out.println("Error: Input must contain numbers only.");
		}	
	}
	
	public static int getInt(String prompt) {
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
	
	public static int getIntRange(String prompt, int min, int max) {
		while (true) {
			int value = scanner.nextInt();
			if (value >= min && value <= max) {
				return value;
			}
			System.out.println("Error: Number not in range.");
		}
	}
	
	public static double getDecimal(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = scanner.nextLine();
			if (input.matches("-?\\d+(\\.\\d+)?")) {
				return Double.parseDouble(input);
			}
			System.out.println("Error: Number is not a decimal");
		}
	}
	
	public static double getDecimalLimit(String prompt, double min, double max) {
		while (true) {
			double value = getDecimal(prompt + "(" + min + " to " + max +"): ");
			if (value >= min && value <= max) {
				return value;
			}
		System.out.println("Error: Decimal not in range");
		}
	}
	
	public static LocalDate getDate(String prompt) {
		while (true) {
			System.out.print(prompt + "yyyy-mm-dd: ");
			String input = scanner.nextLine();
			try {
				return LocalDate.parse(input);
			} catch (DateTimeParseException e) {
				System.out.println("Error: Incorrect date format");
			}
		}
	}
}
