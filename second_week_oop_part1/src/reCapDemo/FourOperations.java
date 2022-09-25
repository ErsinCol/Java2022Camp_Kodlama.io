package reCapDemo;

public class FourOperations {
	public int addition(int number1, int number2) {
		return number1+number2;
	}
	public int subtraction(int number1, int number2) {
		return number1-number2;
	}
	public int multiplication(int number1, int number2) {
		return number1*number2;
	}
	public int division(int number1, int number2) {
		if(number2 == 0) {
			System.out.println("The denominator cannot be zero ! ");
			return 0;
		}
		return number1/number2;
	}
	
}
