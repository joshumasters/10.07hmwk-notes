/**
 * MadLib
 */
import java.util.Scanner;

public class MadLib {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you (provide an int)");

        int age = input.nextInt();
        String error = input.nextLine();

        if (age >= 18) {
        System.out.println("Who are you talking to?");

        String name = input.nextLine();
        System.out.println("Describe who you're talking to! Is this person 'super cool' or 'really dumb' ");

        String adverbAdjective = input.nextLine();

        System.out.println("Do you want to be friends? Enemies? Roommates? Pick a noun!");

        String noun = input.nextLine();

        System.out.println("Where would you go with this person? The zoo? Prison? Ice Cream Parlor?");

        String nounTwo = input.nextLine();

        System.out.println("How long till you go to that place");

        String numberDays = input.nextLine();

        System.out.println("Finally, what's your name!");

        String yourName = input.nextLine();
        
        String paragraph = "Dear " + name + ", You are " + adverbAdjective + " and I want to be your " + noun + "! I want to go to the " + nounTwo + " with you in " + numberDays + ".  Sincerely, " + yourName;

        System.out.println("Here's your story:");
        
        System.out.println(paragraph);

        } else {
            System.out.println("Buzz off ya little shit");
        } 
    

        


        




    }
}