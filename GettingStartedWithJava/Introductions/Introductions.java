import java.io.Console;
 
public class Introductions {
  
    public static void main(String[] args) {
        Console console = System.console();
        //set up a string datatype with the variable firstName
        //readline is a method of console which captures the data the user enters on the next line
        String firstName = console.readLine("What is your name?  ");
        // Print formatted text with printf. 
        // \n is an escape sequence to break to the next line without breaking the code.
        // %s is a format specifier, which is a parameter of printf, where s stands for string
        console.printf("Hello %s\n", firstName);
        console.printf("%s is learning to write Java\n", firstName);
  }
}

//to run: 
// 1) Save file then Compile
//  -  javac Introductions.java
// 2) ls
// 3) Run
//  -  java Introductions
//    - java runs the program with the class name and requires no extension