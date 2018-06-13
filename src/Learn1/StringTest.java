package Learn1;

import java.util.Optional;

public class StringTest {
	public static void main(String[] args) {
		System.out.println("Простая строка");

		String simpleString = "";
		for (int i = 1; i < 10000; i ++) {
			simpleString = simpleString + "adssd";
		}
		System.out.println(simpleString);

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 1; i < 10000; i ++) {
			stringBuilder.append("adssd");
		}
		System.out.println(stringBuilder);



		System.out.println(" ");
		System.out.println("Optional на примере строки");

		Optional<String> optionalString = Optional.ofNullable("Error");
		optionalString.ifPresent(System.out::println);




		System.out.println(" ");
		System.out.println("StringBuffer");

		StringBuffer strBuffer = new StringBuffer("Java");
		char c = strBuffer.charAt(0); // J
		System.out.println(c);
		strBuffer.setCharAt(0, 'c');
		System.out.println(strBuffer.toString());
    }
}
