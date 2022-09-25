package FirstWeek;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.print("Enter number: ");
				int number = input.nextInt();
				int total = 0;
				if(number>0) {
					for (int i = 1; i < number; i++) { 
						if(number % i == 0 ) {
							total += i;
						}
					}
					if(number == total) {
						System.out.println("Number is perfect number");
					}else {
						System.out.println("Number is not perfect number");
					}
						
				}else {
					System.out.println("entered number must be positive");
				}

	}

}
