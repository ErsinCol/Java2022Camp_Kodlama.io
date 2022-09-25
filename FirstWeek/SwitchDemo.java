package FirstWeek;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter note: ");
		int note = input.nextInt();
		
		switch(note) {
		case 5: System.out.println("Perfect"); break;
		case 4: System.out.println("Good"); break;
		case 3: System.out.println("Medium"); break;
		case 2: System.out.println("Bad"); break;
		case 1: System.out.println("Wretched"); break;
		default: System.out.println("warning! please enter valid grade value"); break;
		}
		

	}

}
