import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the array size
        System.out.print("Enter the number of numbers you'll sort: ");
        int size = scanner.nextInt();  

        // Declare an array with the given size
        int[] a = new int[size];

        // Taking inputs from the user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        // Close scanner to prevent resource leak
        scanner.close();

        // Bubble Sort
        for (int pass = 1; pass < size; pass++) {
            for (int comps = 0; comps < (size - pass); comps++) {
                if (a[comps] > a[comps + 1]) {
                    int c = a[comps];
                    a[comps] = a[comps + 1];
                    a[comps + 1] = c;
                }
            }
        }

        // Printing the sorted values without an extra comma
        System.out.print("The sorted values are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]);
            if (i < size - 1) { 
                System.out.print(", "); // Add comma only if not the last number
            }
        }
        System.out.println(); // Move to a new line after printing
    }
}
