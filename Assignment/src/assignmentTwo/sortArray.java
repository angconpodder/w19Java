package assignmentTwo;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		
		int[] arr = {1,1,17,32,15,1,3,55,2};
		
		int temp;
		
		for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		
		for(int item : arr){
			System.out.println(item);
		}
		
		

	}

}
