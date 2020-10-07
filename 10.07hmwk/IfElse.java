// **
//  * if
//  */
import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean condition = true;
    
    while (condition == true) {
        System.out.println("Input Grade Below");

        int grade = Integer.parseInt(input.nextLine());

        if (grade >= 90){
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            System.out.println("Grade: C");
        } else if (grade >= 60) {
            System.out.println("Grade: D");
        } else if (grade < 60) {
            System.out.println("Grade: F");
        }

        System.out.println("Do you want to keep grading? Y/N");
        
        String keepGoing = input.nextLine();

        if (keepGoing.equals("N")) {
            condition = false;
        }
    }
}
}