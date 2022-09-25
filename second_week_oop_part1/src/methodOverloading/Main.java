package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourOperations operation1 = new FourOperations();
		System.out.println(operation1.addition(15, 25));
		System.out.println(operation1.addition(15, 25, 35));
		System.out.println(operation1.addition(15, 25, 35, 45));
	}

}
