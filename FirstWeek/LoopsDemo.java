package FirstWeek;

public class LoopsDemo {

	public static void main(String[] args) {
		// for
		for(int count = 1 ; count < 10 ; count+=2) {
			System.out.println(count);
		}
		// while
		int count = 1;
		while(count < 10) {
			System.out.println(count);
			count+=2;
		}
		// do-while
		int secondCount= 1;
		do {
			System.out.println(secondCount);
			secondCount +=2;
		}while(secondCount< 10);

	}

}
