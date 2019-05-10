package interviewQuestions;

public class SumOfN {

	public static void main(String[] args) {
		int N = 100;
		
		int count=0;
		for(int i=0; i<=N; i++){
			count = count + i;
		}
		
		System.out.println(count);

	}

}
