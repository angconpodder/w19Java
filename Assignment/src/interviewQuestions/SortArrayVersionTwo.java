package interviewQuestions;

public class SortArrayVersionTwo {

	public static void main(String[] args) {
	
		int[] myArray = {3,1,2};
		
		int temp;
		
		for(int i=0; i<myArray.length; i++){
			for(int j=0; j<myArray.length; j++){
				
				if(myArray[i]<myArray[j]){
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j]=temp;
				}
				
			}
		}

		for(int x:myArray){
			System.out.println(x);
		}

	}

}
