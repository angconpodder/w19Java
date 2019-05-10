package assignmentTwo;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner userInput = new Scanner(System.in);
		
		
		String myStr = userInput.next();
		
		String myStrUpper = myStr.toUpperCase();
		
		System.out.println(myStrUpper);
		int myStrLen = myStrUpper.length();
		System.out.println(myStrLen);
		System.out.println(myStrUpper.replace("O", "Z"));
		
		char lastChar = myStr.charAt(myStrLen-1);
		System.out.println(lastChar);
		System.out.println(myStr.replace(lastChar, 'Z'));
	}

}
