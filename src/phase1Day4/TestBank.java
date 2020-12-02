package phase1Day4;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hdfc = new HDFCBank();
		   hdfc.debit();
		   hdfc.credit();
		   hdfc.transfermoney();
		   hdfc.getHDFCSpecificROI();
		
		
		   Citibank citi = new Citibank();
		   citi.debit();
		   citi.credit();
		   citi.transfermoney();
		   citi.getMinBal();

		
		   Bank b = new HDFCBank();
		   b.debit();
		   b.credit();
		   b.transfermoney();
		   //b.getHDFCSpecificROI(); //will not be accessible here sincewe  //are pointing to the interfac
		   b = new Citibank();
		    b.debit();
		    b.credit();
		    b.transfermoney();
		   }
		 
		
		
		
		
		
		
		
		

	}


