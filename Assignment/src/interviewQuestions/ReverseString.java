package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String word = "xyz";
		
		char[] myArray = word.toCharArray();
		
		String reverseWord = "";
		for(int i =word.length()-1; i>=0; i--){
			reverseWord = reverseWord + myArray[i];
		}
		
		System.out.println("Reverse word: " + reverseWord);
		
		if (word.equalsIgnoreCase(reverseWord)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("NOT Palindrome");
		}

	}

}
