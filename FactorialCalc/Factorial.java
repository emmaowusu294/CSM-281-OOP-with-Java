import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int i, num, fact = 1;

        // Asking the user for the number / integer

        System.out.println("\nEnter a positive number");

        num = input.nextInt();


        if (num < 0) {
            System.out.println("\n....Enter a positine number....");
        } else {
            // Calculate for the factorial
            for (i = 1; i <= num; i++)
            {
                fact *= i;
            }
        }
        // Print the factorial

        input.close();

        System.out.println("\n\n\nThe Factorial of " + num + " is " + fact);

    }
}
