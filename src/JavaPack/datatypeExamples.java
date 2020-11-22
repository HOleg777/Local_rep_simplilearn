package JavaPack;

public class datatypeExamples {

	public static void main(String[] args) {
		int qty = 50;
		//float needs to be end with f lower case to indicate it is a float variable
		float price = 45.6f;
		double totalPrice;
		totalPrice= qty * price;
		char c = 'e';
		boolean flag = false;
		System.out.println("Quantity of Apple = " + qty);
		System.out.println("Price of Apple = " + price);
		System.out.println("Total Price = " + totalPrice);
		System.out.println("Char Value = "+ c);
		System.out.println("Value of flag = " + flag);
		price = 20.5f;
		totalPrice= qty * price;
		System.out.println("Quantity of Apple = " + qty + "\n"
                   + "Price of Apple = " + price + "\n" 
		   + "Total Price = " + totalPrice + "\n"
		   + "Char Value = "+ c + "\n"
		   + "Value of flag = " + flag);
		
		int i = 100;
		int j = 200;
		String s = "Hello";
		System.out.println(i+j+s); //it will start from left and start adding up the values for all integers - but the moment it finds a string, it converts the integer into string before concatenating and display the value in the console
		System.out.println(s+i+j); //first variable is of type string + all the variables after that are converted to string and displayed in the console
		System.out.println(s+(i+j));
	}

}
