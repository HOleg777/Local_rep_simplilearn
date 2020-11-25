package youTubeExamples;

public class EnhacedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		float newArr []=new  float [7];
		 
		 newArr [0] = 332.1f;
		 newArr [1] = 55.1f;
		 newArr [2] = 33.1f;
		 newArr [3] = 32.1f;
		 newArr [4] = 3344.1f;
		 newArr [5] = 3325.1f;
		 newArr [6] = 3324.1f;
		 
		 
		 double smallest = newArr[0];
		 double greatest = newArr[0];
		
		 
		 for (double example: newArr) {
			
			if (example<smallest) smallest = example;
			if (example>greatest) greatest= example;
			 
			 
			
		 
		}
		 
		 System.out.println("The smalest number is "+smallest);
		 System.out.println("The largest number is "+greatest);

		}
	
		
		
	
	
	}


