import java.util.Scanner;

public class PigLatinApp {

	public static void main(String[] args) {
		// The Application will translate English word to Pig Latin
		// Will prompt the user for a Word
		// The application translates the text to Pig Latin and displays it on the console
		// The application ask the user if he or she wants to translate another word
				
				Scanner scnr = new Scanner (System.in);
				String userWord;
				String PigLatin = "yes"; // ask our user if they want to keep going.
		
do { 
					
					System.out.println("Please enter a word you would like to translate Pig Latin?"); //ask user to enter a word.
					userWord = scnr.nextLine(); 
					userWord = userWord.toLowerCase(); 
					
					System.out.println("You have have entered : " + userWord.toLowerCase());
					
					if(startsWithVowel(userWord)){// Prints way with words that start with a vowel
					
					 System.out.println("You have entered a vowel, your pig latin word is :" + userWord + "way");
					 
					} else if (startsWithConstant(userWord)) {
						
						char firstLetter = userWord.charAt(0);
						userWord = userWord.substring(1);
						System.out.println("Your Pig latin word " + userWord + firstLetter + "ay");
					}
							    
				    System.out.println("Would you like to change another word to Pig Latin?");
					PigLatin = scnr.nextLine();
					
					}while (PigLatin.equalsIgnoreCase("yes"));
					
					System.out.println("Goodbye!");
								
					scnr.close();									
		}

			private static boolean startsWithVowel(String way){
				    
				
				    char firstLetter = way.charAt(0);
				
					if (way.startsWith("a")){
						return true;					
					}if (way.startsWith("e")){
						return true;					
					}if (way.startsWith("i")){
						return true;
					}if (way.startsWith("o")){
						return true;	
					}if (way.startsWith("u")){
						return true;
					}
						return false;
		}
			private static boolean startsWithConstant(String constant){
			    
				char firstLetter = constant.charAt(0);
					return true;
	}				
			
}

	