

/**
 * HelloWorld
 */
import java.util.Scanner;

 public class HelloWorld {

    
    public static void main(String[] args) {
        // String name = "Josh";
        // System.out.println(name);

        Scanner scanInput = new Scanner(System.in); 
        System.out.println("Whats your name?");
        String firstName = scanInput.nextLine();
        System.out.println("Hello " + firstName);
        System.out.println("Whats your last name?");
        String lastName = scanInput.nextLine();
        System.out.println("Oh, your last name is " + lastName);
    }
}