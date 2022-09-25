package FirstWeek;

public class ArraysDemo {

	public static void main(String[] args) {
		double [] myList = {1.2 , 2.5 , 3.1 , 6.8 , 9.5};
		double total = 0;
		double max = myList[0];
		for (double item : myList) {
			if(item > max) {
				max = item;
			}
			total += item;
		}
		System.out.println("Total: "+ total + "\nLargest Number: " + max );
		

	}

}
