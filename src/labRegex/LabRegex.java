package labRegex;

import java.util.Scanner;

public class LabRegex {
	public static void main(String[] args) 
	{

		String upA = "[A]\\w+|[A]";
		String vowel = "[AEIOU]\\w+";
		String myRegex1 = "CS\\d{4}";
		test(vowel);
	}

	private static void test(String regex) 
	{
		String word;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter words to match the expression %s%n", regex);
		System.out.println("Enter DONE when you are finished");
		System.out.print("Word: ");
		
		word = input.nextLine();
		while (!word.equalsIgnoreCase("done")) 
		{
			System.out.printf("%s %s%n", word, word.matches(regex) ? "matches" : "does not match");
			System.out.print("Word: ");
			word = input.nextLine();
		}
	}
}
