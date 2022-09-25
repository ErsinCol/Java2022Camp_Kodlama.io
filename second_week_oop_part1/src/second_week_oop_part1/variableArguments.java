package second_week_oop_part1;

public class variableArguments {

	public static void main(String[] args) {
		int total = total(1,2,3,5,7,8,9);
		System.out.println("Total: "+ total);
	}
	
	public static int total(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

}
