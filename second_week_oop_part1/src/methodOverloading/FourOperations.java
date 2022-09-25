package methodOverloading;

public class FourOperations {
	
	public int addition(int number1, int number2) {
		return number1+number2;
	}
	public int addition(int number1,int number2, int number3) {
		return number1+number2+number3;
	}
	// with variable arguments
	public int addition(int... numbers) {
		int total = 0;
		for (int item : numbers) {
			total += item;
		}
		return total;
	}
}
