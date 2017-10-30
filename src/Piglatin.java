import java.util.Scanner;

/* 
 * Created by Siddique Khatri on 10/28/2017.
 */

public class Piglatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = " ";
		String choice = "y";

		System.out.println("Welcome to the Pig Latin Translator!");
		while (choice.equalsIgnoreCase("Y")) {
			System.out.println("Enter a line to be translated: ");
			sentence = scan.nextLine();
			System.out.println(piggifiedSentence(sentence)); // calling the main method to convert sentence to piglatin.
			System.out.println("");
			System.out.println("Translate another line? (y/n)");
			choice = scan.nextLine();

		}
		System.out.println("Goodbye!");
		scan.close();
	}

	private static String piggifiedSentence(String sentence) {
		String end = "";
		String delims = "\\s+"; // separates the sentence into words at the spaces
		String[] words = sentence.split(delims); // sentence is split into words (using split method) and then placed
													// into an array.
		for (int i = 0; i < words.length; i++) { // this for loop will go through all of the words in the array
			if (isVowel(words[i].toLowerCase().charAt(0))) {
				end += words[i] + "way"; // if word begins w/ a vowel, it just adds way to the word
			} else {
				end += words[i].substring(1) + words[i].substring(0, 1) + "ay";
			} 
			// The above statement will combine the individual words after moving all of the
			// letters in front of the vowel in the consonant to the end of the word and add 'ay' to the end of it.

		}
		return end; // returns the newly formed sentence
	}

	// this method defines the vowel
	private static boolean isVowel(char v) {
		if (v == 'a') {
			return true;
		}
		if (v == 'e') {
			return true;
		}
		if (v == 'i') {
			return true;
		}
		if (v == 'o') {
			return true;
		}
		if (v == 'u') {
			return true;
		}
		return false;
	}

}
