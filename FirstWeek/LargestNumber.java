package FirstWeek;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("First number: ");
		int firstNumber = input.nextInt();
		System.out.println("Second number: ");
		int secondNumber = input.nextInt();
		System.out.println("Third number: ");
		int thirdNumber = input.nextInt();
		int largestNumber = firstNumber;
		if(secondNumber > largestNumber) {
			largestNumber = secondNumber;
		}
		if(thirdNumber > largestNumber) {
			largestNumber = thirdNumber;
		}
		
		System.out.println("En büyük sayı: " + largestNumber);

	}

}
