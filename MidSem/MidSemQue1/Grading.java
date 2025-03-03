import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking the number of students
        System.out.println("\nEnter the number of Students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // Consume the leftover newline

        // Get full name
        String fullName = getFullName(input);

        // Print full name
        System.out.println("Student's Full Name: " + fullName);

        input.close();
    }

    // Function to get full name
    public static String getFullName(Scanner input) {
        System.out.println("Enter First name: ");
        String firstName = input.nextLine();

        System.out.println("Enter Last name: ");
        String lastName = input.nextLine();

        return firstName + " " + lastName; // Return full name instead of printing
    }
}
