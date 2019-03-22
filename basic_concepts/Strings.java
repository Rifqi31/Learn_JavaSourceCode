public class Strings {
	public static void main(String[] args) {
		// example of string in java

		String singleQuote = "Hello'oy";
		String doubleQuote = "There";

		// check length
		System.out.println(singleQuote);
		System.out.println(singleQuote.length());

		// to uppercase and lowercase
		System.out.println(doubleQuote.toUpperCase());
		System.out.println(doubleQuote.toLowerCase());

		// index of to find position in string including whitespace
		String example = "I hope this year before ramadhan, I find my job";
		System.out.println(example.indexOf("job"));

		// String Concatination
		System.out.println(singleQuote + " " + doubleQuote);
		// same as like this but without space
		System.out.println(singleQuote.concat(doubleQuote));
	}
}