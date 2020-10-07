import java.util.Scanner;

/**
 * Switch
 */
public class Switch {

    public static void main(String[] args) {
        

    Scanner input = new Scanner(System.in);

    boolean condition = true;
    
    while (condition == true){
    
    System.out.println("Input Grade Below");

    int grade = Integer.parseInt(input.nextLine());

    switch (grade) {
        case 100:
        case 99:
        case 98:
        case 97:
        case 96:
        case 95:
        case 94:
        case 93:
        case 92:
        case 91:
        case 90:
            System.out.println("Grade: A");
            break;
        case 89:
        case 88:
        case 87:
        case 86:
        case 85:
        case 84:
        case 83:
        case 82:
        case 81:
        case 80:
            System.out.println("Grade: B");
            break;
        case 79:
        case 78:
        case 77:
        case 76:
        case 75:
        case 74:
        case 73:
        case 72:
        case 71:
        case 70:
            System.out.println("Grade: C");
            break;
        case 69:
        case 68:
        case 67:
        case 66:
        case 65:
        case 64:
        case 63:
        case 62:
        case 61:
        case 60:
            System.out.println("Grade: D");
            break;
        default:
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