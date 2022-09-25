package FirstWeek;
import java.util.Scanner;
public class FriendNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("First number: ");
		int firstNumber = input.nextInt();
		System.out.println("Second number: ");
		int secondNumber = input.nextInt();
		int firstTotal= 0;
		int secondTotal= 0;
		for (int i = 1 ; i < firstNumber; i++) {
			if(firstNumber % i == 0) {
				firstTotal += i;
			}
		}
		for (int j = 1 ; j < secondNumber; j++) {
			if(secondNumber % j == 0) {
				secondTotal += j;
			}
		}
		if(firstTotal == secondNumber && secondTotal == firstNumber) {
			System.out.println("Are friends number");
		}else {
			System.out.println("Are not  friends number");
		}

	}

}
