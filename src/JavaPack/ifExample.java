package JavaPack;
public class ifExample {

	public static void main(String[] args) {
		int marks=99;
		if((marks>0)&&(marks<40))
		{
			System.out.println("Partcipant failed due to low score of " + marks);
		}
		else 
		if((marks>=40)&&(marks>100))
		{
				System.out.println("Partcipant Passed due to pass score of " + marks);
		}
		else
		System.out.println("Invalid score");
	}
}
