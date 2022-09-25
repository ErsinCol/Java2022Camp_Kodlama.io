package second_week_oop_part1;

public class methods2 {

	public static void main(String[] args) {
		String town = getTown ("Ankara") ;
		System.out.println (town) ;
		int total =  total( 15,7 ) ;
		System.out.println (total) ;
	}
	
	public static void add () {
		System.out.println(" added ") ;
	}
	public static void delete () {
		System.out.println ("deleted") ;
	}
	public static void update () {
	    System.out.println ("updated") ;
	}
	public static int total(int number1, int number2 ) {
	    return number1+number2 ;
	}
	public static String getTown (String town) {
	    return town ;
	}
		

}























