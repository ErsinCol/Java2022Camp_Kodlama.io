package FirstWeek;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		boolean isPrime = true;
		int number = input.nextInt();
		
		if(number<=1) {
			System.out.println("number must be greater than one");
		}else {
			for (int i = 2; i < number; i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println("number is prime");
			}else {
				System.out.println("number is not prime");
			}
		}
	}
}
