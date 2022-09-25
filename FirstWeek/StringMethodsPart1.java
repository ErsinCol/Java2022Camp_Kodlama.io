package FirstWeek;

public class StringMethodsPart1 {

	public static void main(String[] args) {
		String message = "The weather is very nice today";
		System.out.println(message);
		
		System.out.println("Length: "+ message.length());
		System.out.println("Third item: "+ message.charAt(2));
		System.out.println(message.concat(" ...Perfect!"));
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("Z"));
		char[] charArray = new char[12];
		message.getChars(0, 11, charArray , 0);
		System.out.println(charArray);
		System.out.println(message.indexOf("very"));
		System.out.println(message.lastIndexOf("o"));
		String  newMessage = message.replace(" ", "-");
		System.out.println(newMessage);
		System.out.println(message.substring(4, 11));
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	}

}
