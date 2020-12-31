import java.io.File;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Java project to practice with text files
 *
 * @author     Jake Jacobs-Smith (jacobjv@auburn.edu)
 * @version    2020-12-28
 *
 */

public class TextFilePractice {
	private static boolean started = false;
	private static File fileName = null;
	private static int numberOfNums = 0;
	
	public static void main(String[] args) {
		programChooser ();
	}
	
	
	public static void printText() {
			try {
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNextLine()) {
					String line = textInput.nextLine();
					System.out.println(line);
				}
				textInput.close();
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
	
	public static void findString() {
		try {	
			Scanner stringInput = new Scanner(System.in);
			System.out.print("What am I looking for? ");
			String findString = stringInput.nextLine();
			try {
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNextLine()) {
					String line = textInput.nextLine();
					if (line.contains(findString)) {
						System.out.println(line);
					}
				}
				textInput.close();
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			stringInput.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void reverseTextByLine() {
		ArrayList<String> reverse = new ArrayList<String>();
			try {
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNextLine()) {
					String line = textInput.nextLine();
					reverse.add(line);
				}
				for (int i = reverse.size() - 1 ; i >= 0; i --) {
					System.out.println(reverse.get(i));
				}
				textInput.close();	
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
	
	public static void reverseText() {
		ArrayList<String> reverse = new ArrayList<String>();
			try {
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNext()) {
					String string = textInput.next();
					reverse.add(string);
				}
				for (int i = reverse.size() - 1 ; i >= 0; i --) {
					System.out.println(reverse.get(i));
				}
				textInput.close();	
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
	
	public static void findLength() {
		try {	
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("What length am I looking for? ");
			int stringLength = input.nextInt();
			try {
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNext()) {
					String string = textInput.next();
					if (string.length() == stringLength) {
						System.out.println(string);
					}
				}
				textInput.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void findWord() {
		try {	
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("What word am I looking for? ");
			String wordFind = input.nextLine();
			int count = 0;
			try {
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNext()) {
					String string = textInput.next();
					if (string.equals(wordFind)) {
						count++;
					}
				}
				System.out.println(wordFind + " appears: " + count + " times.");
				textInput.close();	
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void wordCount() {
			int count = 0;
			try {
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNext()) {
					textInput.next();
					count++;
				}
				System.out.println("Word count: " + count);
				textInput.close();	
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
	
	public static void charCount() {
			int count = 0;
			try {
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNext()) {
					String string = textInput.next();
					count = count + string.length();
				}
				System.out.println("Character count (not including spaces): " + count);
				textInput.close();	
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
	
	public static void backwardsWords() {
		ArrayList<String> reverseWords = new ArrayList<String>();
			try {
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNext()) {
					String string = textInput.next();
					String reverseString = "";
					for (int i = string.length() - 1; i >= 0; i--) {
						reverseString += string.charAt(i);
					}
					reverseWords.add(reverseString);
				}
				textInput.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		for (String word : reverseWords) {
			System.out.println(word);
		}
	}
	
	public static void backwardsLine() {
		ArrayList<String> reverse = new ArrayList<String>();
			try {
				@SuppressWarnings("resource")
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNextLine()) {
					String line = textInput.nextLine();
					String lineReverse = "";
					for (int i = line.length() - 1; i >= 0; i--) {
						lineReverse += line.charAt(i);
					}
					reverse.add(lineReverse);
				}
				for (int i = 0 ; i < reverse.size(); i++) {
					System.out.println(reverse.get(i));
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
	
	public static void findChar() {
		try {	
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("What character am I looking for? ");
			char charFind = input.nextLine().charAt(0);
			int count = 0;
			try {
				Scanner textInput = new Scanner(fileName);
				while (textInput.hasNext()) {
					String string = textInput.next();
					for (int i = 0; i < string.length(); i++ ) {
						if (string.charAt(i) == charFind) {
							count++;
						}
					}
				}
				System.out.println(charFind + " appears: " + count + " times.");
				textInput.close();	
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void stringProgramStart() {
		try {
			fileHandler();
			System.out.println("Hello Dave. What would you like me to do? ");
			System.out.println("1) Print entire file");
			System.out.println("2) Print file backwards line by line");
			System.out.println("3) Print entire file backwards");
			System.out.println("4) Find a spcific word or sentence");
			System.out.println("5) Find all words of a specific length");
			System.out.println("6) Find how many times a specific word appears");
			System.out.println("7) Word count for the document");
			System.out.println("8) Character count for the document");
			System.out.println("9) Print all words backwards");
			System.out.println("10) Print all words backwards by line");
			System.out.println("11) Find how many times a spcific character appears");
			System.out.println("Please select an option");
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int selection = input.nextInt();
			
			if (selection == 1) {
				printText();
			}
			else if (selection == 2) {
				reverseTextByLine();
			}
			else if (selection == 3) {
				reverseText();
			}
			else if (selection == 4) {
				findString();
			}
			else if (selection == 5) {
				findLength();
			}
			else if (selection == 6) {
				findWord();
			}
			else if (selection == 7) {
				wordCount();
			}else if (selection == 8) {
				charCount();
			}
			else if (selection == 9) {
				backwardsWords();
			}
			else if (selection == 10) {
				backwardsLine();
			}
			else if (selection == 11) {
				findChar();
			}
			else {
				System.out.println("I don't think you understood the instructions.");
				playAgain();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		playAgain();
	}
	
	public static int numSum() {
		numberOfNums = 0;
		int returnNum = 0;
		try {
			Scanner numInput = new Scanner(fileName);
			while (numInput.hasNext()) {
				int num = numInput.nextInt();
				returnNum += num;
				numberOfNums++;
			}
			numInput.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return returnNum;
	}
	
	public static int numAverage() {
		return (numSum() / numberOfNums);
	}
	
	public static ArrayList<Integer> oddNums() {
		ArrayList<Integer> oddNumsArray = new ArrayList<Integer>();
		try {
			Scanner numInput = new Scanner(fileName);
			while (numInput.hasNext()) {
				int num = numInput.nextInt();
				if (num % 2 != 0) {
					oddNumsArray.add(num);
				}
			}
			numInput.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return oddNumsArray;
	}
	
	public static ArrayList<Integer> evenNums() {
		ArrayList<Integer> evenNumsArray = new ArrayList<Integer>();
		try {
			Scanner numInput = new Scanner(fileName);
			while (numInput.hasNext()) {
				int num = numInput.nextInt();
				if (num % 2 == 0) {
					evenNumsArray.add(num);
				}
			}
			numInput.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return evenNumsArray;
	}
	
	public static int oddNumSum() {
		numberOfNums = 0;
		int returnNum = 0;
		try {
			Scanner numInput = new Scanner(fileName);
			while (numInput.hasNext()) {
				int num = numInput.nextInt();
				if (num % 2 != 0) {
					returnNum += num;
					numberOfNums++;
				}
			}
			numInput.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return returnNum;
	}
	
	public static int oddNumAverage() {
		return (oddNumSum() / numberOfNums);
	}
	
	public static int evenNumSum() {
		numberOfNums = 0;
		int returnNum = 0;
		try {
			Scanner numInput = new Scanner(fileName);
			while (numInput.hasNext()) {
				int num = numInput.nextInt();
				if (num % 2 == 0) {
					returnNum += num;
					numberOfNums++;
				}
			}
			numInput.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return returnNum;
	}
	
	public static int evenNumAverage() {
		return evenNumSum() / numberOfNums;
	}
	
	public static void playAgain() {
		try {
			System.out.println("\n");
			System.out.println("Would you like to do anything else?");
			Scanner input = new Scanner(System.in);
			String selection = input.nextLine();
			if (selection.equalsIgnoreCase("y") || selection.equalsIgnoreCase("yes")) {
				programChooser();
			}
			else {
				System.out.println("Later tater!");
				input.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void fileHandler() {
		if (started) {
			System.out.println("Would you like to use the same file?");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String selection = input.nextLine();
			if (selection.equalsIgnoreCase("y") || selection.equalsIgnoreCase("yes")) {
				return;
			}
			else {
				System.out.println("Ok, what's the new file?");
				fileName = new File(input.nextLine());
			}
		} else {
			System.out.print("Enter the file name: ");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			fileName = new File(input.nextLine());
			started = true;
		}
	}
	
	public static void programChooser() {
		try {
			System.out.println("Hi There! Is your file text or numeric?");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String choice = input.nextLine();
			System.out.println("Choice is: " + choice);
			if (choice.equals("text") || choice.equals("t")) {
				stringProgramStart();
			}
			if (choice.equals("numeric") || choice.equals("num") || choice.equals("number")) {
				numProgramStart();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
	
	public static void numProgramStart() {
		try {
			fileHandler();
			System.out.println("Hello Dave. What would you like me to do? ");
			System.out.println("1) Find the sum of all numbers");
			System.out.println("2) Find the average of all numbers");
			System.out.println("3) Find all odd numbers");
			System.out.println("4) Find all even numbers");
			System.out.println("5) Find the sum of all the odd numbers");
			System.out.println("6) Find the average of all the odd numbers");
			System.out.println("7) Find the sum of all the even numbers");
			System.out.println("8) Find the average of all the even numbers");
			System.out.println("Please select an option");
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int selection = input.nextInt();
			
			if (selection == 1) {
				System.out.println(numSum());
			}
			else if (selection == 2) {
				System.out.println(numAverage());
			}
			else if (selection == 3) {
				System.out.println(oddNums());
			}
			else if (selection == 4) {
				System.out.println(evenNums());
			}
			else if (selection == 5) {
				System.out.println(oddNumSum());
			}
			else if (selection == 6) {
				System.out.println(oddNumAverage());
			}
			else if (selection == 7) {
				System.out.println(evenNumSum());
			}
			else if (selection == 8) {
				System.out.println(evenNumAverage());
			}
			else {
				System.out.println("I don't think you understood the instructions.");
				playAgain();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		playAgain();
	}
}