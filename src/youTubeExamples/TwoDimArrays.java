package youTubeExamples;

public class TwoDimArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	int  table [][] = new int [3][4];
	
	table [0][0] = 1;
	table [0][1] = 2;
	table [0][2] = 3;
	table [0][3] = 4;
	table [1][0] = 5;
	table [1][1] = 6;
	table [1][2] = 7;
	table [1][3] = 8;
	table [2][0] = 9;
	table [2][1] = 10;
	table [2][2] = 11;
	table [2][3] = 12;
	

	System.out.println(table[0][3]);
	System.out.println(table.length);
	
	for (int i=0;i< table.length;i++)
	{ for(int c=0;c<table[i].length;c++) {
	
		System.out.print("table["+i+"]["+c+"] = "+table[i][c] + "\t");
	 
	 System.out.print("\n");
	

	 
	}
	}
	
 float newArr []=new  float [7];
	 
	 newArr [0] = 332.1f;
	 newArr [1] = 55.1f;
	 newArr [2] = 33.1f;
	 newArr [3] = 32.1f;
	 newArr [4] = 3344.1f;
	 newArr [5] = 3325.1f;
	 newArr [6] = 3324.1f;
	 
	 for (int i=0;i< newArr.length;i++)
		{ 
			System.out.print("newArr["+i+"]= "+ newArr[i]);
	 
	
	
	}
	 
	for (double example: newArr) {
		
		System.out.println(example*example);
	 
	}
	 
	 

	}
}