package interviewQuestions;

public class Swap {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);

	}
	
	public static void swap(int a, int b){
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}

}
