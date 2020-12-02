package JavaOOPsPack;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s= "Selenium Training Online Line";
String s1= "Selenium Training Online Line    ";
System.out.println("Length of the String s = "+ s.length());
System.out.println("index posirion of online = " + s.indexOf("Online"));
System.out.println("index position of s = "+ s.indexOf("s"));
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.charAt(0));
System.out.println(s.charAt(1));

String Sa=s.trim();
String S1a=s.trim();


System.out.println(Sa);
System.out.println(S1a);

String bmitext = "BMI = 20.1 kg/m2";
int indexOfEq = bmitext.indexOf("=");
int indexOfkg = bmitext.indexOf("kg");

System.out.println("bmiext = " + bmitext +"indexof ");

String sbmiextractedvalue = bmitext.substring(indexOfEq+1,indexOfkg-1); 	
double bmivalue = Double.parseDouble(sbmiextractedvalue);	
	
	
	
	
	
	
	}

}
