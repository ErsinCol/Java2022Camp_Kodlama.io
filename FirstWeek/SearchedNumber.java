package FirstWeek;
import java.util.Scanner;
public class SearchedNumber {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		Scanner input = new Scanner(System.in);
		System.out.print("enter searched number: ");
		int searchedNumber = input.nextInt();
		boolean isThere = false;
		for (int i = 0; i < numbers.length; i++) {
			if(searchedNumber == numbers[i]) {
				isThere = true;
				break;
			}
		}
		if(isThere) {
			System.out.println("is there");
		}else {
			System.out.println("is not there");
		}

	}

}
