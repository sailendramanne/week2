
public class electricity {

	
		private int customerNo;
		private String name;
		private int units;
		 void m1(int num, String lname, int nounits ) 
	     { 
	         customerNo = num; 
	         name = lname ; 
	         units=  nounits; 
	     } 
	     void show() 
	     {    
	           System.out.println("Customer Number : " + customerNo); 
	           System.out.println("Customer Number : " + name); 
	           System.out.println("Units Consumed  : " + units); 
	     } 
	     double billcalculate () 
	     { 
	         double bill; 
	         if(units<100) 
	           bill = units * 1.20 ; 
	         else if(units <= 300) 
	            bill = 100 * 1.20 + (units - 100) * 2 ; 
	         else 
	            bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3 ; 
	         return bill; 
	    
	  } 
	  
}
