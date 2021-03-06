import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
        //sets up variable to collect age data
        String ageAsString = console.readLine("How old are you?  ");
        //set up integer datatype
        //replaces static number with parsed string response
        //Integer is a class
        //parseInt is a static method of Integer
        int age = Integer.parseInt(ageAsString);
        //set up a conditional
        //set up block of code insde curly brace
        if (age <13) {
            //Insert exit code
            console.printf("Sorry, you must be at least 13 to use this program.\n");
            //set up Object known as a Global System Object
            //this object has a Method called Exit
            //0 status code means it exited normally
            System.exit(0);
        }
        String name = console.readLine("Enter a name:  ");
		String adjective = console.readLine("Enter an adjective:  ");
        //added do while to prompt user until acceptable response is given
        //declared variable outside to solve scope error
        String noun;
        boolean isInvalidWord;
        do {
            noun = console.readLine("Enter a noun:  ");
            //dry up our code with a boolean
            isInvalidWord = (noun.equalsIgnoreCase("dork") ||noun.equalsIgnoreCase("jerk") ||
                noun.equalsIgnoreCase("nerd"));
            //method for the string object
            //added logical OR statement ||
            if (isInvalidWord)  {
                console.printf(" That language is not allowed.  Try again.  \n\n");
            }  
        } while(isInvalidWord);
		
		String adverb = console.readLine("Enter an adverb:  ");
		String verb = console.readLine("Enter a verb ending with -ing:  ");

		console.printf("Your Strory:\n.............\n");
		console.printf("%s is a(n) %s %s.  ", name, adjective, noun);
		console.printf("They are always %s %s.\n", adverb, verb);
    }
    
}