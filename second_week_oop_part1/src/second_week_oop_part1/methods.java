package second_week_oop_part1;

public class methods {

	public static void main(String[] args) {
		
		    int [] numbers = new int [] { 1,2,5,7,9,0 } ;
		    int searchedNumber = 6 ;
		    
		    boolean isThere = searchNumber(numbers,searchedNumber);
		    
		    if (isThere) {
		        showMessage("sayı mevcuttur");
		    } else {
		    	showMessage("sayı mevcut değildir");                   
		    }                      		
 	}
	
	public static boolean searchNumber(int [] numbers, int searchedNumber) {
		for ( int number : numbers ) {
	        if ( number == searchedNumber ) {
	            return true ;
	        }
	    }
		return false;
	}
	
	public static void showMessage(String message) {
		System.out.println(message);
	}
}
