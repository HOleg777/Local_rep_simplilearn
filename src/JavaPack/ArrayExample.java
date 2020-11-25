package JavaPack;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arr = new int[6];
		//assign values to arr
		arr[0] = 45;
		arr[1] = 56;
		arr[2] = 67;
		arr[3] = 90;
		arr[4] = 35;
		arr[5] = 37;
		
		
		for(int i = 0 ; i<arr.length;i++)
		{
		  System.out.println("arr["+i+"] ="+ arr[i]);
		}

		String names[] = new String [10];
		
		names[0] = "alex";
		names[1] = "nataly";
		names[2] = "t";
		names[3] = "u";
		names[4] = "n";
		names[5] = "nat";
		names[6] = "ly";
		names[7] = "italy";
		names[8] = "nt";
		names[9] = "v";
		
		
		for(int e = 0 ; e<names.length;e++) {
			  System.out.println("names["+e+"] ="+ names[e]);
			}
	
	
	
	
	
	}

}
