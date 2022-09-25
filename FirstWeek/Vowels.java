package FirstWeek;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Bir harf giriniz: ");
		char letter = input.next().charAt(0);
		char [] vowels = {'a','ı','o','u','e','i','ü','ö'};
		char [] boldVowels = String.copyValueOf(vowels,0,4).toCharArray();
		char [] thinVowels = String.copyValueOf(vowels,4,4).toCharArray(); // array,offset,count
		boolean isVowel = false;
		boolean isThinVowel = false;
		for (int i = 0; i < vowels.length; i++) {
			if(letter == vowels[i]) {
				isVowel = true;
				break;
			}
		}
		if(isVowel) {
			for (int i = 0; i < thinVowels.length; i++) {
				if(letter == thinVowels[i]) {
					isThinVowel = true;
					break;
				}
			}
			if(isThinVowel) {
				System.out.println("Letter is the thin vowels");
			}else {
				System.out.println("Letter is the bold vowels");
			}
		}else {
			System.out.println("Letter must be vowels");
		}

	}

}
